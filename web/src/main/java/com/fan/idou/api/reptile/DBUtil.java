package com.fan.idou.api.reptile;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

class DBUtil {

    private static String url = null;
    private static String username = null;
    private static String password = null;
    private static String driverPath = null;

    static {
        loadProps();
    }

    static Connection connection;

    public static Connection getConn() {
        try {
            // JDBC 4.0 以后, 不需要再注册了
            // Class.forName(driverPath);
            if (connection == null || connection.isClosed())
                connection = DriverManager.getConnection(url, username, password);
            return connection;

        } catch (Exception e) {

            e.printStackTrace();
        }
        return null;
    }


    public static void release(Connection conn, Statement statement, ResultSet resultSet) {
        closeRs(resultSet);
        closeSt(statement);
        closeConn(conn);
    }


    private static void closeRs(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            rs = null;
        }
    }

    private static void closeSt(Statement st) {
        try {
            if (st != null) {
                st.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            st = null;
        }
    }

    private static void closeConn(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conn = null;
        }
    }


    synchronized static private void loadProps() {
        try {

            Properties properties = new Properties();

            // 如果将 配置文件 放在 项目的根目录下面, 可以使用FileInputStream的方式读取
            // InputStream is = new FileInputStream("jdbc.properties");

            // 如果将 配置文件 放在 src目录下面, 要使用ClassLoader读取
            InputStream is = BgmReptile.class.getClassLoader().getResourceAsStream("application.properties");

            properties.load(is);

            url = properties.getProperty("spring.datasource.url");
            username = properties.getProperty("spring.datasource.username");
            password = properties.getProperty("spring.datasource.password");
            driverPath = properties.getProperty("spring.datasource.driver-class-name");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


