package com.shumujin.xiaohashu.auth.controller;

import com.shumujin.framework.biz.operationlog.aspect.ApiOperationLog;
import com.shumujin.framework.common.response.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;


/**
 * @author shumujin
 * @date 2024/6/20-下午5:25
 * @apiNote
 */

@RestController
public class TestController {

    @GetMapping("/test")
    @ApiOperationLog
    public Response<String> Test(){
        return Response.success("Hello,World");
    }

    @GetMapping("/test2")
    @ApiOperationLog(description = "测试接口 2")
    public Response<User> test2(){
        return Response.success(User.builder()
                .nickName("shumujin")
                .createTime(LocalDateTime.now())
                .build());
    }
}
