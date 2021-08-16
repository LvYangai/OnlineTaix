package com.onlinetaxi.internalcommon.dto.serviceverificationcode.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 验证码统一请求
 * @author: lvyangai
 * @date: 2021/8/14 18:43
 * @version: 1.0.0
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("all")
public class VerifyCodeRequest {
    private int identfy;
    private String phoneNumber;
    private String code;
}
