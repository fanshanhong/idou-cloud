package com.fan.idou.dao.mapper;

import com.fan.idou.dao.pojo.BgmCategory;
import com.fan.idou.dao.pojo.BgmCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BgmCategoryMapper {
    long countByExample(BgmCategoryExample example);

    int deleteByExample(BgmCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BgmCategory record);

    int insertSelective(BgmCategory record);

    List<BgmCategory> selectByExample(BgmCategoryExample example);

    BgmCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BgmCategory record, @Param("example") BgmCategoryExample example);

    int updateByExample(@Param("record") BgmCategory record, @Param("example") BgmCategoryExample example);

    int updateByPrimaryKeySelective(BgmCategory record);

    int updateByPrimaryKey(BgmCategory record);
}