package com.orion.mp.entities;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.orion.mp.enums.StatusEnum;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author li.lc
 */
@Data
public class User {

    private Long id;
    private String name;
    private Integer age;
    @TableField(select = false)
    private String nickName;
    private LocalDateTime birthDay;
    @TableField(value = "email")
    private String mail;
    /**
     * 数据表额外参数，用于VO，需用注解忽略掉
     */
    @TableField(exist = false)
    private String gender;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    /**
     * 枚举&逻辑删除
     */
    @TableLogic
    private StatusEnum status;
}
