package com.hzszn.auth.controller;

import com.gavel.core.base.BaseApiContorller;
import com.hzszn.auth.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jhhuang on 2017/8/11
 * QQ:781913268
 * Description：xxx
 */
@RestController()
@RequestMapping("/auth")
public class AuthController extends BaseApiContorller
{
    @Autowired
    private UserService userService;

}
