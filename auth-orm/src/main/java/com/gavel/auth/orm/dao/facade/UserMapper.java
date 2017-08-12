package com.gavel.auth.orm.dao.facade;

import com.gavel.auth.orm.pojo.User;
import com.gavel.auth.orm.query.UserQuery;

public interface UserMapper
{
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int countByQuery(UserQuery query);
}