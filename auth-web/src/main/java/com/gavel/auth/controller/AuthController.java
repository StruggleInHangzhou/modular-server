package com.gavel.auth.controller;

import com.gavel.auth.orm.query.UserQuery;
import com.gavel.auth.service.facade.UserService;
import com.gavel.core.base.BaseApiContorller;
import com.gavel.core.moudel.JsonResponse;
import com.gavel.core.moudel.ServiceResult;
import com.gavel.core.utils.JsonResponseTool;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jhhuang on 2017/8/11
 * QQ:781913268
 * Description：xxx
 */
@RestController
@RequestMapping("/auth")
public class AuthController extends BaseApiContorller
{
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/app/login", method = RequestMethod.POST)
    public JsonResponse appLogin(@ModelAttribute UserQuery query) throws Exception
    {
        if (StringUtils.isBlank(query.getMobile()) || StringUtils.isBlank(query.getPassword()))
        {
            return JsonResponseTool.paramErr("参数无效");
        }
        ServiceResult result = userService.appLogin(query);
        if (!result.getFlag())
        {
            return JsonResponseTool.failure(result.getMessage());
        }
        return JsonResponseTool.success(result.getData());
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public JsonResponse register(@ModelAttribute UserQuery query) throws Exception
    {
        if (StringUtils.isBlank(query.getMobile()) || StringUtils.isBlank(query.getPassword()))
        {
            return JsonResponseTool.paramErr("参数无效");
        }

        ServiceResult result = userService.userAdd_tx(query);
        if (result.getFlag())
        {
            return JsonResponseTool.success(result.getData());
        } else
        {
            return JsonResponseTool.failure(result.getMessage());
        }
    }

}
