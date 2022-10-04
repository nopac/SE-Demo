package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

@TableName("reviews")
@Data
public class Review {
    @TableId(type = IdType.AUTO)
    private int rid;
    private int star;
    private String remark;
    @TableField(value = "Time")
    private Date time = new Timestamp(new Date().getTime());
    private int Fromid;
    private int Toid;
    private double rate;
    private int type;
    private int oid;
}
