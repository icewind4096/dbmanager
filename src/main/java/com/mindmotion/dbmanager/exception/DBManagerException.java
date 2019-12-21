package com.mindmotion.dbmanager.exception;

import com.mindmotion.dbmanager.enums.ResultEnum;

public class DBManagerException extends RuntimeException {
    private Integer code;

    public DBManagerException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public DBManagerException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
