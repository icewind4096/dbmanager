package com.mindmotion.dbmanager.dto;

import lombok.Data;
import lombok.ToString;

import java.sql.Timestamp;

/**
 * Created by MMNJ002 on 2019/12/19.
 */
@Data
@ToString
public class TablesDTO {
    private Integer id;
    private String account;
    private String name;
    private Integer status;
    private String operator;
    private Timestamp crTime;
    private Timestamp updateTime;

    public TablesDTO(Integer id, String account, String name, Integer status, String operator) {
        this.id = id;
        this.account = account;
        this.name = name;
        this.status = status;
        this.operator = operator;
    }
}
