package com.gavel.core.constant;

/**
 * Created by jhhuang on 2017/8/10
 * QQ:781913268
 * Description：xxx
 */
public enum Platform
{
    APP_IOS(1, "IOS"),
    APP_ANDROID(2, "ANDROID"),
    APP_WINDOWSPHONE(4, "WP"),
    APP_SYMBIAN(7, "塞班"),
    APP_BLACKBERRYOS(8, "黑莓");

    private Integer value;
    private String desc;

    Platform(Integer value, String desc)
    {
        this.value = value;
        this.desc = desc;
    }

    public static Platform findByValue(Integer type)
    {
        for (Platform e : Platform.values())
        {
            if (type == e.getValue())
            {
                return e;
            }
        }
        return null;
    }

    public static Platform findByDesc(String desc)
    {
        for (Platform e : Platform.values())
        {
            if (e.getDesc().endsWith(desc))
            {
                return e;
            }
        }
        return null;
    }

    public Integer getValue()
    {
        return value;
    }

    public void setValue(Integer value)
    {
        this.value = value;
    }

    public String getDesc()
    {
        return desc;
    }

    public void setDesc(String desc)
    {
        this.desc = desc;
    }
}

