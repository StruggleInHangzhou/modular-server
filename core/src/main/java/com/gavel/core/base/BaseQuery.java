package com.gavel.core.base;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Created by jhhuang on 2017/8/10
 * QQ:781913268
 * Description：xxx
 */
@Data
public abstract class BaseQuery
{
    protected Integer id;     //唯一ID
    protected Integer version = 1;        //数据版本号
    protected String remark;        //备注
    protected Date createAt;         //创建时间
    protected Long stateflag;       //数据状态
    protected String orderDesc = "DESC";       //排序方向
    protected boolean isOrder;      //是否排序
    protected List orderBy;       //排序列表
}
