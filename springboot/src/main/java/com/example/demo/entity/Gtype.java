package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @ProjectName: sprintboot-vue-demo
 * @Desc:
 * @Author: wangfeilong
 * @Date: 2022/10/3
 */

@Data
public class Gtype {
    @TableId(type = IdType.AUTO)
    private int gtypeid;
    private int gid;
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
