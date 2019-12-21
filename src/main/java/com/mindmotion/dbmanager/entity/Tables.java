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
}
