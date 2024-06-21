package com.shumujin.xiaohashu.auth.service;

import com.shumujin.framework.common.response.Response;
import com.shumujin.xiaohashu.auth.model.vo.verificationcode.SendVerificationCodeReqVO;

/**
 * @author: riversome1
 * @date: 2024/6/21 19:08
 * @description:
 **/
public interface VerificationCodeService {
    /**
     * 发送短信验证码
     *
     * @param sendVerificationCodeReqVO
     * @return
     */
    Response<?> send(SendVerificationCodeReqVO sendVerificationCodeReqVO);

}
