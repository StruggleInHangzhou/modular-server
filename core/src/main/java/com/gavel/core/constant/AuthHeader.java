package com.gavel.core.constant;

/**
 * Created by jhhuang on 2017/8/10
 * QQ:781913268
 * Description：xxx
 */
public enum AuthHeader
{
    /**
     * token信息
     */
    X_MODULAR_USER_ID("x-modular-user-id"),
    X_MODULAR_TOKEN("x-modular-token"),
    X_MODULAR_PLATFORM("x-modular-platform"),
    ;

    private String value;

    AuthHeader(String value)
    {
        this.value = value;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }
}
