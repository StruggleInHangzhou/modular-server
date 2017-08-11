package com.hzszn.auth.service.impl;

import com.gavel.auth.orm.query.UserQuery;
import com.gavel.core.moudel.ServiceResult;
import com.hzszn.auth.service.facade.UserService;
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

    @Override
    public ServiceResult userAdd_tx(UserQuery query) throws Exception
    {

        return null;
    }
}
