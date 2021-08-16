package com.onlinetaxi.internalcommon.dto.servicesms.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description: 短信发送请求参数
 * @author: lvyangai
 * @date: 2021/8/14 20:34
 * @version: 1.0.0
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SmsSendRequest {
    private List<String> receivers;
    private List<SmsTemplateDto> data;
    
}
