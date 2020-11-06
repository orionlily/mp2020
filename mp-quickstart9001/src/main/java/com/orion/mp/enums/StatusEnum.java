package com.orion.mp.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;

/**
 * @author li.lc
 */
public enum StatusEnum{

    /**
     * 有效
     */
    ACTIVE(1,"有效"),

    /**
     * 无效，逻辑删除
     */
    INACTIVE(0,"无效");

    StatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @EnumValue
    private Integer code;

    private String desc;

    public Integer getCode(){
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
