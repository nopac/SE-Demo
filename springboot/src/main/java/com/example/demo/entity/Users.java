package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/*
身份证，营业执照等图片暂不取出，点击查看后根据uid数据库搜索显示
 */
@TableName("users")
@Data
public class Users {
    @TableId(type = IdType.AUTO)
    private int uid;
    private String uname;
    private String upsw;
    private String phone;
    private String email;
    private String city;
    private int sex;
    private String bank;
    private double account;
    private int point;
    private int status;
    @TableField(value = "LikeRate")
    private double uLikeRate;
//    用户实名需提交
    @TableField(value = "IdentityNumber")
    private String identityNumber;
    private String identity;
    private String address;

//  成为商家需显示
    private int grade;
    private double turnover;
    @TableField(value = "MLikeRate")
    private double mLikeRate;
    @TableField(value = "isMerchant")
    private int isMerchant;

    private String license;
}
