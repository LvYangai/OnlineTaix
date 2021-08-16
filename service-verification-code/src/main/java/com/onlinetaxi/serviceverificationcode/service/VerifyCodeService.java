package com.onlinetaxi.serviceverificationcode.service;

import com.onlinetaxi.internalcommon.dto.ResponseResult;
import com.onlinetaxi.internalcommon.dto.verificationcode.VerifyCodeResponse;

/**
 * @author lvyangai
 * @Description: 验证码服务层
 * @date 2021/8/12 21:40
 * @email: 1076977275@qq.com
 * @version: 1.0.0
 **/
public interface VerifyCodeService {
    /**
     * 验证码生成
     * @param identity: 身份id
     * @param phoneNumber: 手机号
     * @return: {@link ResponseResult< VerifyCodeResponse>}
     * @author: lvyangai 2021/8/15 19:17
     */
    ResponseResult<VerifyCodeResponse> generate(int identity,String phoneNumber);

    /**
     * 验证码校验
     * @param identity: 身份ID
     * @param phoneNumber: 手机号
     * @param code: 验证码
     * @return: {@link ResponseResult}
     * @author: lvyangai 2021/8/15 19:25
     */
    ResponseResult verify(int identity, String phoneNumber, String code);
}
