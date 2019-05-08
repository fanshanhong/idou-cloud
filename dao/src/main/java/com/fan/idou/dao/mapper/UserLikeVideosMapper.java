package com.fan.idou.dao.mapper;

import com.fan.idou.dao.pojo.UserLikeVideos;
import com.fan.idou.dao.pojo.UserLikeVideosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLikeVideosMapper {
    long countByExample(UserLikeVideosExample example);

    int deleteByExample(UserLikeVideosExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserLikeVideos record);

    int insertSelective(UserLikeVideos record);

    List<UserLikeVideos> selectByExample(UserLikeVideosExample example);

    UserLikeVideos selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserLikeVideos record, @Param("example") UserLikeVideosExample example);

    int updateByExample(@Param("record") UserLikeVideos record, @Param("example") UserLikeVideosExample example);

    int updateByPrimaryKeySelective(UserLikeVideos record);

    int updateByPrimaryKey(UserLikeVideos record);
}