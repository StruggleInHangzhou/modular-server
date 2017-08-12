package com.gavel.auth.service.impl;

import com.gavel.auth.orm.dao.facade.UserMapper;
import com.gavel.auth.orm.query.UserQuery;
import com.gavel.auth.service.facade.UserService;
import com.gavel.auth.service.utils.UserUtils;
import com.gavel.core.moudel.ServiceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by jhhuang on 2017/8/11
 * QQ:781913268
 * Description：xxx
 */
@Service
@Primary
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserMapper userMapper;

    @Override
    public ServiceResult userAdd_tx(UserQuery query) throws Exception
    {
        UserQuery mobileQuery = new UserQuery();
        mobileQuery.setMobile(query.getMobile());
        if (userMapper.countByQuery(mobileQuery) > 0)
        {
            return ServiceResult.failure("手机号已注册", null);
        }

        int i = userMapper.insertSelective(UserUtils.toModel(query));

        if (i == 0)
        {
            return ServiceResult.failure("创建用户失败", null);
        }

        return ServiceResult.success(null);
    }

    @Override
    public ServiceResult appLogin(UserQuery query) throws Exception
    {
        UserQuery checkQuery = new UserQuery();
        checkQuery.setMobile(query.getMobile());
        if (userMapper.countByQuery(checkQuery) < 1)
        {
            return ServiceResult.failure("帐号未注册", null);
        }
        checkQuery.setPassword(query.getPassword());
        if (userMapper.countByQuery(checkQuery) < 1)
        {
            return ServiceResult.failure("帐号密码不匹配", null);
        }
        return ServiceResult.success(null);
    }
}
