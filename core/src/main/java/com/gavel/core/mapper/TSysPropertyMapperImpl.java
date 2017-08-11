package com.gavel.core.mapper;

import com.gavel.core.base.BaseDao;
import com.gavel.core.mapper.facade.TSysPropertyMapper;
import com.gavel.core.orm.pojo.TSysProperty;
import org.springframework.stereotype.Repository;

/**
 * Created by jhhuang on 2017/8/10
 * QQ:781913268
 * Description：xxx
 */
@Repository
public class TSysPropertyMapperImpl extends BaseDao implements TSysPropertyMapper
{

    @Override
    public int deleteByPrimaryKey(Integer id)
    {
        return super.getSqlSession().getMapper(TSysPropertyMapper.class).deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TSysProperty record)
    {
        return super.getSqlSession().getMapper(TSysPropertyMapper.class).insert(record);
    }

    @Override
    public int insertSelective(TSysProperty record)
    {
        return super.getSqlSession().getMapper(TSysPropertyMapper.class).insertSelective(record);
    }

    @Override
    public TSysProperty selectByPrimaryKey(Integer id)
    {
        return super.getSqlSession().getMapper(TSysPropertyMapper.class).selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TSysProperty record)
    {
        return super.getSqlSession().getMapper(TSysPropertyMapper.class).updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TSysProperty record)
    {
        return super.getSqlSession().getMapper(TSysPropertyMapper.class).updateByPrimaryKey(record);
    }
}
