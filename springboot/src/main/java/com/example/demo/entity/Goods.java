package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Goods {
    @TableId(type = IdType.AUTO)
    private int gid;
    private String gname;//商品名称
    private String type;//商品类型
    private double price;
    private String size;

    private String picture;
    private String introduction;//商品介绍
    private boolean bargain;
    private int storage;

    @TableField(value = "Gcondition")
    private String gcondition;//新旧程度

    private int mid;//卖家id
    @TableField(value = "RNumber")
    private int rnumber;//评论id
    private int sale;
    @TableField(value = "likeRate")
    private double likeRate;
    private int status;
}
