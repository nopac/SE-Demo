package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@TableName("amountrecord")
@Data
public class AccountRecord {
    @TableId(type = IdType.AUTO)
    private int aid;
    private int type;
    private double amount;
    private Timestamp time;
    private int oid;
    private int uid;
    private double account;
}
