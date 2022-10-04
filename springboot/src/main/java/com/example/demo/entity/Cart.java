package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("cart")
@Data
public class Cart {

    @TableId(value = "cid",type = IdType.AUTO)
    private int cid;
    private String uid;
    private String gid;
    private int number;
    private String gname;
    private double price;
}
