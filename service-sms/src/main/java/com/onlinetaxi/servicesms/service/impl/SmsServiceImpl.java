package com.onlinetaxi.servicesms.service.impl;


import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.onlinetaxi.servicesms.service.SmsService;
import org.springframework.stereotype.Service;

/**
 * @Description: 短消息实现层
 * @author: lvyangai
 * @date: 2021/8/15 21:03
 * @version: 1.0.0
 **/
@Service
public class SmsServiceImpl implements SmsService {
    /**
     * 本地缓存服务容器(google guava cache)
     * TIP: 思考--为什么要将模板放入缓存?
     * 模板的内容是有限的.一个模板大小81B左右, 1k大概可以100个, 1M存放就是10w个,所以放入内存完全够用了
     * 另外对于短信模板而言,只会有删除不会有对模板进行更新.如果需要更新,这一套使用就要考虑了
     */
    private static Cache<String, String> localCache = CacheBuilder.newBuilder().build();
//
//    @Override
//    public ResponseResult sendSms(SmsSendRequest smsTemplate) {
//        return null;
//    }
}
