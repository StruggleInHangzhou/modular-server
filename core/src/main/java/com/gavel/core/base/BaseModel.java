package com.gavel.core.base;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by jhhuang on 2017/8/10
 * QQ:781913268
 * Description：xxx
 */
public class BaseModel implements Serializable
{
    protected Integer id;     //唯一ID
    protected Integer version;        //数据版本号
    protected LocalDateTime createAt;         //创建时间
    protected LocalDateTime updateAt;         //更新时间
    protected String remark;          //数据备注

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getVersion()
    {
        return version;
    }

    public void setVersion(Integer version)
    {
        this.version = version;
    }

    public LocalDateTime getCreateAt()
    {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt)
    {
        this.createAt = createAt;
    }

    public LocalDateTime getUpdateAt()
    {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt)
    {
        this.updateAt = updateAt;
    }

    public String getRemark()
    {
        return remark;
    }

    public void setRemark(String remark)
    {
        this.remark = remark;
    }
}
