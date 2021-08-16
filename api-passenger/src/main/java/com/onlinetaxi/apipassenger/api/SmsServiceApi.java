package com.onlinetaxi.apipassenger.api;

import com.onlinetaxi.internalcommon.dto.ResponseResult;
import com.onlinetaxi.internalcommon.dto.servicesms.request.SmsSendRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Description:
 * @author: lvyangai
 * @date: 2021/8/14 20:30
 * @version: 1.0.0
 **/
@FeignClient(name = "service-sms")
@SuppressWarnings("all")
public interface SmsServiceApi {
    @PostMapping(value = "/send/sms-template")
    public ResponseResult send(@RequestBody SmsSendRequest smsTemplate);
}
