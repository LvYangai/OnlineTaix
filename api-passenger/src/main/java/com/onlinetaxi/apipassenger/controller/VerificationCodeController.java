package com.onlinetaxi.apipassenger.controller;

import com.onlinetaxi.apipassenger.request.ShortMsgRequest;
import com.onlinetaxi.apipassenger.service.VerificationCodeService;
import com.onlinetaxi.internalcommon.dto.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lvyangai
 * @Description: 验证码控制器
 * @date 2021/8/14 16:10
 * @email: 1076977275@qq.com
 * @version: 1.0.0
 **/
@RestController
@RequestMapping("/verify-code")
public class VerificationCodeController {
    @Autowired
    private VerificationCodeService verificationCodeService;
    @PostMapping("/send")
    public ResponseResult send(@RequestBody ShortMsgRequest request){
        return verificationCodeService.send(request.getPhoneNumber());
    }
}
