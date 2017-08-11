package com.gavel.core.orm.pojo;

import com.gavel.core.base.BaseModel;

import java.io.Serializable;

public class TSysProperty extends BaseModel implements Serializable {

    private Long stateflag;

    private Byte type;

    private String propertyName;

    private String propertyValue;

    private static final long serialVersionUID = 1L;

    public Long getStateflag() {
        return stateflag;
    }

    public void setStateflag(Long stateflag) {
        this.stateflag = stateflag;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName == null ? null : propertyName.trim();
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue == null ? null : propertyValue.trim();
    }
}