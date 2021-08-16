package com.onlinetaxi.internalcommon.constant;

/**
 * @Description: redis存储前缀常量池
 * @author: lvyangai
 * @date: 2021/8/15 16:35
 * @version: 1.0.0
 **/
public class RedisKeyPrefixConstant {
    public static final String SEND_LIMIT_FREQ_CODE_KEY_PREFIX = "send_limit_freq_code_";
    /**
     * 乘客登录验证码key前缀
     */
    public static final String PASSENGER_LOGIN_CODE_KEY_PREFIX = "passenger_login_code_";

    public static final String PASSENGER_LOGIN_TOKEN_APP_KEY_PREFIX = "passenger_login_token_app_";

    public static final String PASSENGER_LOGIN_TOKEN_WEIXIN_KEY_PREFIX = "passenger_login_token_wechat_";

    /**
     * 司机登录验证码key前缀
     */
    public static final String DRIVER_LOGIN_CODE_KEY_PREFIX = "driver_login_code_";
}
