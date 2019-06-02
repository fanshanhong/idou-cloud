package com.fan.idou.api.reptile;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * 背景音乐爬虫
 */
public class BgmReptile {

    private List<String> bgmIds = new ArrayList<>();

    public static void main(String[] args) {
        try {
            new BgmReptile().getData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 开始爬取数据啦
    private void getData() {
        getBgmCategoryIds();

        for (String id : bgmIds) {

            offset = 0;
            count = 0;
            getBgmList(id);

        }
    }

    // 从数据库中读出所有的id, 存放在bgmIds中
    private void getBgmCategoryIds() {

        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet1 = null;

        try {

            conn = DBUtil.getConn();

            // Statement 是先创建, 然后把sql语句塞进去, 然后再执行
            // Statement statement = conn.createStatement();
            // ResultSet resultSet = statement.executeQuery("select * from xx");

            // PrepareStatement 是先用sql语句塞入, 创建一个 PrepareStatement对象, 然后执行
            // 预先对SQL语句进行语法校验.
            preparedStatement = conn.prepareStatement("select * from bgm_category");

            // 如果带参数  比如, select * from bgm_category where username=? and password=? 就这样写, 然后使用setString设置参数
            // preparedStatement.setString(1, "admin");
            // preparedStatement.setString(2, "password");
            resultSet1 = preparedStatement.executeQuery();
            while (resultSet1.next()) {
                String categoryId = resultSet1.getString("bgm_category_id");
                String categoryName = resultSet1.getString("bgm_category_name");
                bgmIds.add(categoryId);
            }

            System.out.println("从数据库读出来的id:" + bgmIds.toArray());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            DBUtil.release(conn, preparedStatement, resultSet1);
        }
    }

    private OkHttpClient okHttpClient = new OkHttpClient();

    private int offset = 0;
    private int count = 0;

    private void getBgmList(String categoryId) {
        try {
            Thread.sleep(2004);

            String bgmListPath = "http://lf.snssdk.com/toutiao/music/collection/songs?id=" + categoryId + "&count=20&iid=38686426259&device_id=54029163126&version_code=682&device_platform=android&offset=" + offset;
            System.out.println("请求id=" + categoryId + "的数据, offset是:" + offset + "   url是:" + bgmListPath);
            final Request request = new Request.Builder()
                    .url(bgmListPath)
                    .get()//默认就是GET请求，可以不写
                    .build();
            Call call = okHttpClient.newCall(request);

            // 同步调用,返回Response,会抛出IO异常
            Response response = call.execute();

            String string = response.body().string();


            // 解析json数据
            ObjectMapper mapper = new ObjectMapper();
            JsonNode rootNode = mapper.readTree(string);

            JsonNode dataNode = rootNode.path("data");

            for (int j = 0; j < dataNode.size(); j++) {

                JsonNode node = dataNode.get(j);

                int duration = node.path("duration").asInt();
                String bgmId = node.path("id_str").asText();
                String author = node.path("author").asText();
                String title = node.path("title").asText();

                StringBuilder sb = new StringBuilder();
                String hdCover = "";
                String mediumCover = "";
                String largeCover = "";
                String thumbCover = "";
                String downloadUrl = "";

                if (node.get("cover_hd") != null) {
                    JsonNode hdNode = node.path("cover_hd").path("url_list");
                    for (int i = 0; i < hdNode.size(); i++) {
                        String s = hdNode.get(i).asText();
                        sb.append(s);
                        sb.append(",");
                    }
                    hdCover = sb.substring(0, sb.length() - 1);
                }

                if (node.get("cover_medium") != null) {
                    JsonNode mediumNode = node.path("cover_medium").path("url_list");
                    sb.delete(0, sb.length());
                    for (int i = 0; i < mediumNode.size(); i++) {
                        String s = mediumNode.get(i).asText();
                        sb.append(s);
                        sb.append(",");
                    }
                    mediumCover = sb.substring(0, sb.length() - 1);
                }

                if (node.get("cover_large") != null) {
                    JsonNode largeNode = node.path("cover_large").path("url_list");
                    sb.delete(0, sb.length());
                    for (int i = 0; i < largeNode.size(); i++) {
                        String s = largeNode.get(i).asText();
                        sb.append(s);
                        sb.append(",");
                    }
                    largeCover = sb.substring(0, sb.length() - 1);
                }

                if (node.get("cover_thumb") != null) {
                    JsonNode thumbNode = node.path("cover_thumb").path("url_list");
                    sb.delete(0, sb.length());
                    for (int i = 0; i < thumbNode.size(); i++) {
                        String s = thumbNode.get(i).asText();
                        sb.append(s);
                        sb.append(",");
                    }
                    thumbCover = sb.substring(0, sb.length() - 1);
                }

                if (node.get("play_url") != null) {
                    JsonNode playUrl = node.path("play_url").path("url_list");
                    sb.delete(0, sb.length());
                    for (int i = 0; i < playUrl.size(); i++) {
                        String s = playUrl.get(i).asText();
                        sb.append(s);
                        sb.append(",");
                    }
                    downloadUrl = sb.substring(0, sb.length() - 1);
                }


                // 存在数据库表中(bgm)

                Connection conn = null;
                PreparedStatement preparedStatement = null;

                try {

                    conn = DBUtil.getConn();

                    String sql = "insert into bgm  (bgm_id, author, title, category_id, bgm_download_url, duration, cover_hd, cover_medium, cover_large, cover_thumb) VALUES (?,?,?,?,?,?,?,?,?,?)";
                    preparedStatement = conn.prepareStatement(sql);
                    preparedStatement.setString(1, bgmId);
                    preparedStatement.setString(2, author);
                    preparedStatement.setString(3, title);
                    preparedStatement.setString(4, categoryId);
                    preparedStatement.setString(5, downloadUrl);
                    preparedStatement.setInt(6, duration);
                    preparedStatement.setString(7, hdCover);
                    preparedStatement.setString(8, mediumCover);
                    preparedStatement.setString(9, largeCover);
                    preparedStatement.setString(10, thumbCover);

                    preparedStatement.executeUpdate();

                    System.out.println("插入数据:       " + title + "       " + author);


                    String realUrl = "";

                    if (downloadUrl.contains(",")) {
                        realUrl = downloadUrl.split(",")[0];
                    } else {
                        realUrl = downloadUrl;
                    }

                    String filename = realUrl.substring(realUrl.lastIndexOf("/") + 1, realUrl.length());
                    String filePath = "D:\\fan\\workspace\\douyin-file\\bgm\\" + categoryId + "\\";

                    // 开始下载
                    downloadFile(realUrl, filePath, filename);


                    // 更新数据库
                    String sql1 = "update bgm set bgm_path=? where bgm_id = ?";
                    preparedStatement = conn.prepareStatement(sql1);
                    preparedStatement.setString(1, "/bgm/" + categoryId + "/" + filename);
                    preparedStatement.setString(2, bgmId);
                    preparedStatement.executeUpdate();

                } catch (Exception e) {
                    e.printStackTrace();
                }
                count++;
            }

            boolean hasMore = rootNode.path("extra").path("has_more").asBoolean();
            if (hasMore && count <= 40) {
                offset += 20;
                // 递归
                getBgmList(categoryId);
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("categoryId:" + categoryId);
        }
    }


    private void downloadFile(String url, String filePath, String filename) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = okHttpClient.newCall(request).execute();
        InputStream is = response.body().byteStream();


        // 写入磁盘
        File dir = new File(filePath);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        FileOutputStream fileOutputStream = new FileOutputStream(filePath + filename);

        byte[] bytes = new byte[1024];
        int len = -1;
        while ((len = is.read(bytes)) != -1) {
            fileOutputStream.write(bytes, 0, len);
        }

        fileOutputStream.flush();
        fileOutputStream.close();

        System.out.println("存入:" + filePath + filename);
    }
}
