package com.shumujin.framework.common.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @author shumujin
 * @date 2024/6/20-下午4:32
 * @apiNote
 */

@Getter
@Setter
public class BizException extends RuntimeException{
    private String errorCode;

    private String errorMessage;

    public BizException(BaseExceptionInterface baseExceptionInterface){
        this.errorCode = baseExceptionInterface.getErrorCode();
        this.errorMessage = baseExceptionInterface.getErrorMessage();
    }
}
