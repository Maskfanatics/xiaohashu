package com.shumujin.xiaohashu.auth.constant;

/**
 * @author: riversome1
 * @date: 2024/6/21 19:04
 * @description:
 **/
public class RedisKeyConstant {

    /**
     * 验证码 KEY 前缀
     */
    private static final String VERIFICATION_CODE_KEY_PREFIX = "verification_code:";

    /**
     * 构建验证码 KEY
     *
     * @param phone
     * @return
     */
    public static String buildVerificationCodeKey(String phone) {
        return VERIFICATION_CODE_KEY_PREFIX + phone;
    }

}
