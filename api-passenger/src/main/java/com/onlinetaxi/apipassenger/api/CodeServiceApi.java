package com.onlinetaxi.apipassenger.api;

import com.onlinetaxi.internalcommon.dto.ResponseResult;
import com.onlinetaxi.internalcommon.dto.serviceverificationcode.request.VerifyCodeRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author lvyangai
 * @Description: 验证码API
 * @date 2021/8/14 18:09
 * @email: 1076977275@qq.com
 * @version: 1.0.0
 **/
@FeignClient(name = "service-verification-code")
@SuppressWarnings("all")
public interface CodeServiceApi {

    @GetMapping("/verify-code/generate/{identify}/{phoneNumber}")
    public ResponseResult generate(@PathVariable("identify")int identify
            ,@PathVariable("phoneNumber")String phoneNumber);

    @PostMapping("/verify-code/verify")
    public ResponseResult verify(@RequestBody VerifyCodeRequest request);
}
