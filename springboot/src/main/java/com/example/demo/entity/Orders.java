package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.awt.*;
import java.sql.Timestamp;
import java.util.Date;

@Data
public class Orders {
    @TableId(type = IdType.AUTO)
    private int oid;
    private int uid;
    private int gid;
    private int mid;
    private int rid;
    @TableField(value = "SubmitTime")
    private Timestamp subTime = new Timestamp(new Date().getTime());
    @TableField(value = "SubSucTime")
    private Timestamp sucTime;
    @TableField(value = "SentTime")
    private Timestamp sentTime;
    private double price;
    @TableField(value = "RetTime")
    private Timestamp retTime;
    @TableField(value = "RetSucTime")
    private Timestamp retSecTime;
    private int status;
    private double commission;//手续费
    private String address;
    private int number;
    @TableField(value = "DeliverID")
    private String deliverID;
    private double sum;
    private String gname;
    @TableField(value = "MNote")
    private String mNote;
}
