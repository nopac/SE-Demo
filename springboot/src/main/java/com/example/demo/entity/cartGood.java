package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class cartGood {

    @TableId(type = IdType.AUTO)
    private int cid;
    private int uid;
    private int gid;
    private int number;
}
