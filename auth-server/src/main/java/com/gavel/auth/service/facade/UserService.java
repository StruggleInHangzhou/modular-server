package com.gavel.auth.service.facade;

import com.gavel.auth.orm.query.UserQuery;
import com.gavel.core.moudel.ServiceResult;

/**
 * Created by jhhuang on 2017/8/11
 * QQ:781913268
 * Description：xxx
 */
public interface UserService
{
    ServiceResult userAdd_tx(UserQuery query) throws Exception;

    ServiceResult appLogin(UserQuery query) throws Exception;
}
