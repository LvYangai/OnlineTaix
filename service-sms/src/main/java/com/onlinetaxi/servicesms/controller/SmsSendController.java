package com.onlinetaxi.servicesms.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 短消息发送视图层
 * @author: lvyangai
 * @date: 2021/8/15 20:56
 * @version: 1.0.0
 **/
@Slf4j
@RestController
@RequestMapping("/send")
public class SmsSendController {
//    @Autowired
//    private SmsService smsService;

//    @PostMapping("/sms-temolate")
//    public ResponseResult send(@RequestBody SmsSendRequest smsTemplate){
//        log.info("/send/sms-template request:"+smsTemplate);
//        return smsService.sendSms(smsTemplate);
//    }

}
