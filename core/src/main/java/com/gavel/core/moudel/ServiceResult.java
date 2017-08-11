package com.gavel.core.moudel;

/**
 * Created by jhhuang on 2017/8/10
 * QQ:781913268
 * Description：xxx
 */
public class ServiceResult<T> implements JsonResponse
{
    private Boolean flag;
    private String message;
    private T data;

    public static <T> ServiceResult success(T t)
    {
        ServiceResult<T> serviceResult = new ServiceResult<T>();
        serviceResult.setFlag(true);
        serviceResult.setMessage("");
        serviceResult.setData(t);

        return serviceResult;
    }

    public static <T> ServiceResult failure(String message, T t)
    {
        ServiceResult<T> serviceResult = new ServiceResult<T>();
        serviceResult.setFlag(false);
        serviceResult.setMessage(message);
        serviceResult.setData(t);

        return serviceResult;
    }

    public Boolean getFlag()
    {
        return flag;
    }

    private void setFlag(Boolean flag)
    {
        this.flag = flag;
    }

    public String getMessage()
    {
        return message;
    }

    private void setMessage(String message)
    {
        this.message = message;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }
}