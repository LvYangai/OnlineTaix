package com.onlinetaxi.apipassenger.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * @author lvyangai
 * @Description: 消息发送验证
 * @date 2021/8/14 16:23
 * @email: 1076977275@qq.com
 * @version: 1.0.0
 **/
@Data
@SuppressWarnings("all")
@NoArgsConstructor
public class ShortMsgRequest {
    @NotNull(message = "手机号不能为空")
    @Pattern(message = "手机号验证不正确",
    regexp = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\\\d{8}$")
    private String phoneNumber;
}
