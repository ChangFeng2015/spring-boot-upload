package com.baitu.shop.exception;

import com.baitu.shop.enums.ResultEnum;

/**
 * Created by Dave on 2017/5/25.
 */
public class GirlException extends RuntimeException{

    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
