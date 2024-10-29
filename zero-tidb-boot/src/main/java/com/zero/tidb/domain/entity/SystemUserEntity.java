package com.zero.tidb.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("system_user")
public class SystemUserEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    @TableField("username")
    private String username;

    @TableField("age")
    private int age;
}