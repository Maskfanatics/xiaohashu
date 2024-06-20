package com.shumujin.framework.biz.operationlog.config;

import com.shumujin.framework.biz.operationlog.aspect.ApiOperationLogAspect;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @author: riversome1
 * @date: 2024/6/20 18:54
 * @description:
 **/
@AutoConfiguration
public class ApiOperationLogAutoConfiguration {

    @Bean
    public ApiOperationLogAspect apiOperationLogAspect(){
        return new ApiOperationLogAspect();
    }
}
