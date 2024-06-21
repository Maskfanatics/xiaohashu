package com.shumujin.xiaohashu.auth.controller;

import com.shumujin.framework.biz.operationlog.aspect.ApiOperationLog;
import com.shumujin.framework.common.response.Response;
import com.shumujin.xiaohashu.auth.model.vo.verificationcode.SendVerificationCodeReqVO;
import com.shumujin.xiaohashu.auth.service.VerificationCodeService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: riversome1
 * @date: 2024/6/21 19:16
 * @description:
 **/

@RestController
@Slf4j
public class VerificationCodeController {

    @Resource
    private VerificationCodeService verificationCodeService;

    @PostMapping("/verification/code/send")
    @ApiOperationLog(description = "发送短信验证码")
    public Response<?> send(@Validated @RequestBody SendVerificationCodeReqVO sendVerificationCodeReqVO) {
        return verificationCodeService.send(sendVerificationCodeReqVO);
    }
}
