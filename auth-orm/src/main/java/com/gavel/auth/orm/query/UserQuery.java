package com.gavel.auth.orm.query;

import com.gavel.core.base.BaseQuery;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by jhhuang on 2017/8/11
 * QQ:781913268
 * Description：xxx
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserQuery extends BaseQuery
{
    private String mobile;

    private String password;
}
