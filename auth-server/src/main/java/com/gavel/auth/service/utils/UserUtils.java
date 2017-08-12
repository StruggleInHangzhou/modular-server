package com.gavel.auth.service.utils;


import com.gavel.auth.orm.pojo.User;
import com.gavel.auth.orm.query.UserQuery;

/**
 * Created by jhhuang on 17-3-7
 * QQ:781913268
 * Description：xxx
 */
public class UserUtils
{
    public static UserQuery toQuery(User dto)
    {
        UserQuery query = new UserQuery();
        query.setId(dto.getId());
        query.setVersion(dto.getVersion());
        query.setRemark(dto.getRemark());
        query.setMobile(dto.getMobile());
        query.setPassword(dto.getPassword());
        return query;
    }

    public static User toModel(UserQuery query)
    {
        User model = new User();
        model.setId(query.getId());
        model.setVersion(query.getVersion());
        model.setRemark(query.getRemark());
        model.setMobile(query.getMobile());
        model.setPassword(query.getPassword());
        return model;
    }

}
