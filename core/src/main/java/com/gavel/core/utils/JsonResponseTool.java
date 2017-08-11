package com.gavel.core.utils;

import com.gavel.core.constant.ResponseCode;
import com.gavel.core.moudel.CommonResponse;

/**
 * Created by jhhuang on 2017/8/10
 * QQ:781913268
 * Description：xxx
 */
@SuppressWarnings("unchecked")
public class JsonResponseTool
{
    /**
     * 通用成功返回消息
     *
     * @param data
     * @return
     */
    public static CommonResponse success(Object data)
    {
        CommonResponse commonResponse = new CommonResponse();
        commonResponse.setCode(ResponseCode.SUCCESS.getValue());
        commonResponse.setMsg(ResponseCode.SUCCESS.getText());
        commonResponse.setData(data);

        return commonResponse;
    }

    /**
     * 失败返回消息
     *
     * @param msg
     * @return
     */
    public static CommonResponse failure(String msg)
    {
        CommonResponse commonResponse = new CommonResponse();
        commonResponse.setCode(ResponseCode.FAILURE.getValue());
        commonResponse.setMsg(msg);
        commonResponse.setData(null);

        return commonResponse;
    }

    public static CommonResponse paramErr(String msg)
    {
        CommonResponse commonResponse = new CommonResponse();
        commonResponse.setCode(ResponseCode.PARAM_ERR.getValue());
        commonResponse.setMsg(msg);
        commonResponse.setData(null);

        return commonResponse;
    }

    /**
     * 通用无数据返回消息
     *
     * @return
     */
    public static CommonResponse noData()
    {
        CommonResponse commonResponse = new CommonResponse();
        commonResponse.setCode(ResponseCode.NODATA.getValue());
        commonResponse.setMsg(ResponseCode.NODATA.getText());
        commonResponse.setData(null);

        return commonResponse;
    }

    /**
     * 服务器异常
     *
     * @return
     */
    public static CommonResponse serverErr()
    {
        CommonResponse commonResponse = new CommonResponse();
        commonResponse.setCode(ResponseCode.SERVER_ERR.getValue());
        commonResponse.setMsg(ResponseCode.SERVER_ERR.getText());
        commonResponse.setData(null);

        return commonResponse;
    }

    /**
     * 服务器异常
     *
     * @return
     */
    public static CommonResponse illegalRequest()
    {
        CommonResponse commonResponse = new CommonResponse();
        commonResponse.setCode(ResponseCode.ILLEGAL_REQUEST.getValue());
        commonResponse.setMsg(ResponseCode.ILLEGAL_REQUEST.getText());
        commonResponse.setData(null);

        return commonResponse;
    }

    public static CommonResponse notFound()
    {
        CommonResponse commonResponse = new CommonResponse();
        commonResponse.setCode(ResponseCode.NOT_FOUND.getValue());
        commonResponse.setMsg(ResponseCode.NOT_FOUND.getText());
        commonResponse.setData(null);

        return commonResponse;
    }

    /**
     * 反射异常
     *
     * @return
     */
    public static CommonResponse reflectErr()
    {
        CommonResponse commonResponse = new CommonResponse();
        commonResponse.setCode(ResponseCode.REFLECT_ERR.getValue());
        commonResponse.setMsg(ResponseCode.REFLECT_ERR.getText());
        commonResponse.setData(null);

        return commonResponse;
    }

    /**
     * 帐号验证错误
     *
     * @return
     */
    public static CommonResponse authFailure(String msg)
    {
        CommonResponse CommonResponse = new CommonResponse();
        CommonResponse.setCode(ResponseCode.AUTH_FAILURE.getValue());
        CommonResponse.setMsg(null == msg ? ResponseCode.AUTH_FAILURE.getText() : msg);
        CommonResponse.setData(null);

        return CommonResponse;
    }

    public static CommonResponse authConflict()
    {
        CommonResponse commonResponse = new CommonResponse();
        commonResponse.setCode(ResponseCode.AUTH_CONFLICT.getValue());
        commonResponse.setMsg(ResponseCode.AUTH_CONFLICT.getText());
        commonResponse.setData(null);

        return commonResponse;
    }
}
