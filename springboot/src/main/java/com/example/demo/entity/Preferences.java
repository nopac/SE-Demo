package com.example.demo.entity;

/**
 * @ProjectName: sprintboot-vue-demo
 * @Desc:
 * @Author: wangfeilong
 * @Date: 2022/10/3
 */

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Preferences {
    @TableId(type = IdType.AUTO)
    private int uid;
    private double food;
    private double stationary;
    private double book;
    private double mobile_phone;
    private double daily_use;
    private double furniture;
    private double computer;
    private double clothes;
    private double digtal;
    private double outdoor;
    private double sports;

}

