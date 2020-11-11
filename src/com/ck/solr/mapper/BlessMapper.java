package com.ck.solr.mapper;

import com.ck.solr.model.Bless;
import com.ck.solr.model.BlessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlessMapper {
    int countByExample(BlessExample example);

    int deleteByExample(BlessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bless record);

    int insertSelective(Bless record);

    List<Bless> selectByExample(BlessExample example);

    Bless selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bless record, @Param("example") BlessExample example);

    int updateByExample(@Param("record") Bless record, @Param("example") BlessExample example);

    int updateByPrimaryKeySelective(Bless record);

    int updateByPrimaryKey(Bless record);
}