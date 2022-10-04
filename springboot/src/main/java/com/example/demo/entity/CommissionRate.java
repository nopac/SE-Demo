package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("commissionrate")
@Data
public class CommissionRate {
    @TableId(type = IdType.AUTO)
    private int id;
    private int grade;
    private double rate;
}
