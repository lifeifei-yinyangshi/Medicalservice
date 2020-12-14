package com.qf.controller;

import com.qf.common.BaseResp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class Patient {

    /**
     * 预约挂号
     * @return
     */
    @RequestMapping("/appointment")
    public BaseResp appointment(){
        return null;
    }

    /**
     * 支付
     * @return
     */
    @RequestMapping("/pay")
    public BaseResp pay(){
        return null;
    }

    /**
     * 发送邮件
     * @return
     */
    @RequestMapping("/sendMail")
    public BaseResp sendMail(){
        return null;
    }

    /**
     * 注册
     * @return
     */
    @RequestMapping("/registry")
    public BaseResp registry(){
        return null;
    }

    /**
     * 登录
     * @return
     */
    @RequestMapping("/login")
    public BaseResp login(){
        return null;
    }

}
