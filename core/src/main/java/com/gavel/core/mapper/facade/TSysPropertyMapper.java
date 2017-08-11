package com.gavel.core.mapper.facade;

import com.gavel.core.orm.pojo.TSysProperty;

public interface TSysPropertyMapper
{
    int deleteByPrimaryKey(Integer id);

    int insert(TSysProperty record);

    int insertSelective(TSysProperty record);

    TSysProperty selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TSysProperty record);

    int updateByPrimaryKey(TSysProperty record);
}