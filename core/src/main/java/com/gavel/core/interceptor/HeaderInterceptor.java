package com.gavel.core.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gavel.core.base.BaseInterceptor;
import com.gavel.core.utils.JsonResponseTool;
import com.gavel.core.utils.ProtocolTool;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by jhhuang on 2017/8/10
 * QQ:781913268
 * Description：xxx
 */
public class HeaderInterceptor extends BaseInterceptor
{
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception
    {
        if (RequestMethod.OPTIONS.name().equals(httpServletRequest.getMethod()))
        {
            return true;
        }

        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");

        Integer userId = ProtocolTool.validateUser(httpServletRequest);

        if (userId == null || userId < 1)
        {
            httpServletResponse.setCharacterEncoding("utf-8");
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(httpServletResponse.getWriter(), JsonResponseTool.authFailure(null));
            httpServletResponse.getWriter().close();
            return false;
        }

        return true;

    }
}
