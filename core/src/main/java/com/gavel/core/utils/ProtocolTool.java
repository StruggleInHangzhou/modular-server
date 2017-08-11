package com.gavel.core.utils;

import com.gavel.core.constant.AuthHeader;
import com.gavel.core.moudel.UserSession;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by jhhuang on 2017/8/10
 * QQ:781913268
 * Description：xxx
 */
public class ProtocolTool
{

    public static Integer validateUser(HttpServletRequest httpServletRequest)
    {
        Integer userId = null;
        try
        {
            userId = Integer.parseInt(httpServletRequest.getHeader(AuthHeader.X_MODULAR_USER_ID.getValue()));
            String platform = httpServletRequest.getHeader(AuthHeader.X_MODULAR_PLATFORM.getValue());
            UserSession.getCurrent().setUserId(userId);
            UserSession.getCurrent().setPlatform(platform);
        } catch (Exception e)
        {
        }

        return userId;
    }
}
