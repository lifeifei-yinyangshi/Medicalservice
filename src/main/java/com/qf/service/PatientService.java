package com.qf.service;

import com.qf.common.BaseResp;

public interface PatientService {
    /**
     * 预约挂号
     */
    public BaseResp appointment();

    /**
     * 支付
     */
    public BaseResp pay();

    /**
     * 发送邮件
     */
    public BaseResp sendMail();

    /**
     * 注册
     */
    public BaseResp registry();

    /**
     * 登录
     */
    public BaseResp login();
}
