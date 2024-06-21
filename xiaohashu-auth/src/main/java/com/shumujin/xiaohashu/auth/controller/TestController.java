package com.shumujin.xiaohashu.auth.controller;

import com.shumujin.framework.biz.operationlog.aspect.ApiOperationLog;
import com.shumujin.framework.common.response.Response;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author shumujin
 * @date 2024/6/20-下午5:25
 * @apiNote
 */

@RestController
public class TestController {

    @GetMapping("/test")
    @ApiOperationLog
    public Response<String> Test() {
        return Response.success("Hello,World");
    }

    @PostMapping("/test2")
    @ApiOperationLog(description = "测试接口 2")
    public Response<User> test2(@RequestBody @Validated User user) {
        int i = 1 / 0;
        return Response.success(user);
    }
}
