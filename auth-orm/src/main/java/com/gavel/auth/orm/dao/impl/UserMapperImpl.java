package com.gavel.auth.orm.dao.impl;

import com.gavel.auth.orm.dao.facade.UserMapper;
import com.gavel.auth.orm.pojo.User;
import com.gavel.auth.orm.query.UserQuery;
import com.gavel.core.base.BaseDao;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * Created by jhhuang on 2017/8/11
 * QQ:781913268
 * Description：xxx
 */
@Repository
@Primary
public class UserMapperImpl extends BaseDao implements UserMapper
{
    @Override
    public int deleteByPrimaryKey(Integer id)
    {
        return super.getSqlSession().getMapper(UserMapper.class).deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record)
    {
        return super.getSqlSession().getMapper(UserMapper.class).insert(record);
    }

    @Override
    public int insertSelective(User record)
    {
        return super.getSqlSession().getMapper(UserMapper.class).insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer id)
    {
        return super.getSqlSession().getMapper(UserMapper.class).selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User record)
    {
        return super.getSqlSession().getMapper(UserMapper.class).updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record)
    {
        return super.getSqlSession().getMapper(UserMapper.class).updateByPrimaryKey(record);
    }

    @Override
    public int countByQuery(UserQuery query)
    {
        return super.getSqlSession().getMapper(UserMapper.class).countByQuery(query);
    }
}
