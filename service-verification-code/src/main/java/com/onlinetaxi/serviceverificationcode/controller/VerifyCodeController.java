package com.onlinetaxi.serviceverificationcode.controller;

import com.alibaba.fastjson.JSON;
import com.onlinetaxi.internalcommon.dto.ResponseResult;
import com.onlinetaxi.internalcommon.dto.serviceverificationcode.request.VerifyCodeRequest;

import com.onlinetaxi.serviceverificationcode.service.VerifyCodeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author lvyangai
 * @Description: 验证码服务
 * @date 2021/8/1221:01
 * @email: 1076977275@qq.com
 * @version: 1.0.0
 **/
@Slf4j
@RestController
@RequestMapping("/verify-code")
public class VerifyCodeController {

    @Resource
    private VerifyCodeService verifyCodeService;

    @GetMapping("/generate/{identity}/{phoneNumber}")
    public ResponseResult generate(@PathVariable("identity") int identity,@PathVariable("phoneNumber") String phoneNumber ){
         return verifyCodeService.generate(identity,phoneNumber);
    }

    /**
     * 这种写法：通过feign调用时，code为空
     */
//    @GetMapping("/verify/{identify}/{phoneNumber}")
//    public ResponseResult verify(@PathVariable("identify") int identify
//            , @PathVariable("phoneNumber") String phoneNumber, String code) {
//        return verifyCodeService.verify(identify, phoneNumber, code);
//    }

    @PostMapping("/verify")
    public ResponseResult verify(@RequestBody VerifyCodeRequest request){
        log.info("/verify-code/verify  request:"+ JSON.toJSONString(request));
        //获取手机号和验证码
        String phoneNumber = request.getPhoneNumber();
        int identity = request.getIdentfy();
        String code = request.getCode();
        return verifyCodeService.verify(identity, phoneNumber, code);
    }
}
