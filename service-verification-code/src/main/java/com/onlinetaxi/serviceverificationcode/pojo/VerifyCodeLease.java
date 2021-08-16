package com.onlinetaxi.serviceverificationcode.pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @Description: 验证码租约
 * @author: lvyangai
 * @date: 2021/8/15 16:52
 * @version: 1.0.0
 **/
@Data
@Builder
public class VerifyCodeLease implements Serializable {
    //获取次数
    private long repeatNums;

    //第一次获取验证码时间
    private long firstObtainTime;

    private boolean oneMinLimit;

    private boolean oneHourLimit;

    public void resetRepeatNums(){
        repeatNums++;
    }
}
