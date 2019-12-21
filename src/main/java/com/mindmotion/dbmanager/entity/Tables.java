package com.mindmotion.dbmanager.entity;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by MMNJ002 on 2019/12/19.
 */

@Data
public class Tables implements Serializable {
    private static final long serialVersionUID = 1L;        // 版本号

    private Integer id;
    private String account;
    private String name;
    private Integer status;
    private String operator;
    private Timestamp crTime;
    private Timestamp updateTime;

    //存在有参构造方法时，必须提供一个无参构造方法
    public Tables(){

    }

    public Tables(String account, String name, Integer status, String operator) {
        this.account = account;
        this.name = name;
        this.status = status;
        this.operator = operator;
    }
}
