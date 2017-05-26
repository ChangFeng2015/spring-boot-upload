package com.baitu.shop.handle;

import com.baitu.shop.domain.Result;
import com.baitu.shop.exception.GirlException;
import com.baitu.shop.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * Created by Dave on 2017/5/25.
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger LOGGER = LoggerFactory.getLogger(ExceptionHandle.class);

    public Result handle(Exception e){
        if(e instanceof GirlException){
            GirlException girlException = (GirlException)e;
            return ResultUtil.error(girlException.getCode(),girlException.getMessage());
        }else{
            LOGGER.error("[系统异常]{}",e);
            return ResultUtil.error(-1,"未知错误");
        }
    }
}
