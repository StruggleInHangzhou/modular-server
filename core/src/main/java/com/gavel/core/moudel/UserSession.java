package com.gavel.core.moudel;

/**
 * Created by jhhuang on 2017/8/10
 * QQ:781913268
 * Description：xxx
 */
public class UserSession
{
    private static ThreadLocal<UserSession> sessionHolder = new ThreadLocal<UserSession>();

    private Integer userId;

    private String platform;

    public static UserSession getCurrent()
    {
        return sessionHolder.get();
    }

    public static void setCurrent(UserSession userSession)
    {
        sessionHolder.set(userSession);
    }


    public Integer getUserId()
    {
        return userId;
    }

    public void setUserId(Integer userId)
    {
        this.userId = userId;
    }

    public String getPlatform()
    {
        return platform;
    }

    public void setPlatform(String platform)
    {
        this.platform = platform;
    }
}
