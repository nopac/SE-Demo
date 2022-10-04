package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("administrators")
@Data
public class Administrators {
    @TableId(type = IdType.AUTO)
    private int admid;
    private String password;
}
