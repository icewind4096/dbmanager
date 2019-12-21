package com.mindmotion.dbmanager.enums;

import lombok.Getter;

/**
 * Created by MMNJ002 on 2019/9/25.
 */
@Getter
public enum ResultEnum {
    PARMATER_ERROR(1, "参数错误"),
    ACCOUNT_TABLES_EXIST(100, "账册下，存在相同表"),
    ;

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
