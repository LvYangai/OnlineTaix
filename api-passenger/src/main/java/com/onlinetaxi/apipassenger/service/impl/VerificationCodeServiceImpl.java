package com.onlinetaxi.apipassenger.service.impl;

import com.alibaba.fastjson.JSON;
import com.onlinetaxi.apipassenger.api.CodeServiceApi;
import com.onlinetaxi.apipassenger.api.SmsServiceApi;
import com.onlinetaxi.apipassenger.service.VerificationCodeService;
import com.onlinetaxi.internalcommon.constant.CommonStatusEnum;
import com.onlinetaxi.internalcommon.constant.IdentityConstant;
import com.onlinetaxi.internalcommon.dto.ResponseResult;
import com.onlinetaxi.internalcommon.dto.servicesms.request.SmsSendRequest;
import com.onlinetaxi.internalcommon.dto.servicesms.request.SmsTemplateData;
import com.onlinetaxi.internalcommon.dto.servicesms.request.SmsTemplateDto;
import com.onlinetaxi.internalcommon.dto.serviceverificationcode.request.VerifyCodeRequest;
import com.onlinetaxi.internalcommon.dto.verificationcode.VerifyCodeResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


/**
 * @author lvyangai
 * @Description : 验证码服务类
 * @date 2021/8/14 16:39
 * @email : 1076977275@qq.com
 * @version : 1.0.0
 **/
@Slf4j
@Service
@SuppressWarnings("all")
public class VerificationCodeServiceImpl implements VerificationCodeService {
    @Resource
    private CodeServiceApi codeServiceApi;
    @Resource
    private SmsServiceApi smsServiceApi;
    @Override
    public ResponseResult send(String phoneNumber) {
        //1.调用远程服务器生成验证码
        ResponseResult codeResponse = codeServiceApi.generate(IdentityConstant.PASSENGER_IDENT,phoneNumber);

        VerifyCodeResponse verifyCodeResponse = null;
        if (codeResponse.getCode() == CommonStatusEnum.SUCCESS.getCode()){
            verifyCodeResponse = JSON.parseObject(JSON.toJSONString(codeResponse.getData()),VerifyCodeResponse.class);
        }else {
            return ResponseResult.fail("获取验证码失败");
        }
        String code = verifyCodeResponse.getCode();
        //2.发送短信验证码
        ResponseResult result = smsServiceApi.send(buildSmsSendRequest(phoneNumber,code));
        if (result.getCode() != CommonStatusEnum.SUCCESS.getCode()){
            return ResponseResult.fail("发送短信失败");
        }
        log.info("手机号%s，发送短信验证码：%s",phoneNumber,code);
        return ResponseResult.success("");
    }

    private SmsSendRequest buildSmsSendRequest(String phoneNumber, String code) {
        List<String> receivers = new ArrayList<>();
        List<SmsTemplateDto> templateData = new ArrayList<>();

        //接收者
        receivers.add(phoneNumber);
        //消息模版数据
        templateData.add(SmsTemplateDto.builder()
                .id("SMS_144145499")
                .templateData(SmsTemplateData.builder().code(code).build())
                .build());
        return SmsSendRequest.builder().receivers(receivers).data(templateData).build();
    }

    /**
    * @see VerificationCodeService#verifyCode(String, String)
    */
    @Override
    public ResponseResult verifyCode(String phoneNumber, String code) {
        VerifyCodeRequest codeRequest = VerifyCodeRequest.builder()
                .identfy(IdentityConstant.PASSENGER_IDENT)
                .phoneNumber(phoneNumber)
                .code(code)
                .build();
        return codeServiceApi.verify(codeRequest);
    }

}

