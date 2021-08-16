package com.onlinetaxi.internalcommon.dto.servicesms.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 短信模版
 * @author: lvyangai
 * @date: 2021/8/14 20:36
 * @version: 1.0.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@SuppressWarnings("all")
public class SmsTemplateDto {
    //模版id
    private String id;
    //模版内容
    private SmsTemplateData templateData;

    @Override
    public String toString() {
        return "SmsTemplateDto{" +
                "id='" + id + '\'' +
                ", templateData=" + templateData +
                '}';
    }
}
