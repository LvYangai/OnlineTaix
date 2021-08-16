package com.onlinetaxi.apipassenger.service;

import com.onlinetaxi.internalcommon.dto.ResponseResult;

/**
 * @author lvyangai
 * @Description: 验证码服务
 * @date 2021/8/14 16:32
 * @email: 1076977275@qq.com
 * @version: 1.0.0
 **/
@SuppressWarnings("all")
public interface VerificationCodeService {
    /**
     * 发送验证码给手机
     * @param phoneNumber 15591797755
     * @return {@link ResponseResult}
     */
    ResponseResult send(String phoneNumber);

    /**
     * 校验验证码-在用户输入验证码登录时做校验
     * @param phoneNumber 15591797755
     * @param code 234126
     * @return {@link ResponseResult}
     */
    ResponseResult verifyCode(String phoneNumber,String code);

}
