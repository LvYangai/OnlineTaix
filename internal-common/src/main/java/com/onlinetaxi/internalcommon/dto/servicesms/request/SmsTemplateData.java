package com.onlinetaxi.internalcommon.dto.servicesms.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 模版内容
 * @author: lvyangai
 * @date: 2021/8/14 20:40
 * @version: 1.0.0
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("all")
public class SmsTemplateData {
    private String code;

    @Override
    public String toString() {
        return "SmsTemplateData{" +
                "code='" + code + '\'' +
                '}';
    }
}
