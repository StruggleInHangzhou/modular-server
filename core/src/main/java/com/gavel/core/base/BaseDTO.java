package com.gavel.core.base;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by jhhuang on 2017/8/10
 * QQ:781913268
 * Description：xxx
 */
@Data
public abstract class BaseDTO implements Serializable, Cloneable
{
    protected Integer id;     //唯一ID
    protected Integer version;        //数据版本号
    protected String remark;        //备注
    protected String key;       //密钥

    public BaseDTO clone()
    {
        try
        {
            return (BaseDTO) super.clone();
        } catch (CloneNotSupportedException e)
        {
            return null;
        }
    }
}
