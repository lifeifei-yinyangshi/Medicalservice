package com.qf.controller;

import com.qf.common.BaseResp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospital")
public class Hospital {
    /**
     * 医院活动,简介和指引
     * @return
     */
    @RequestMapping("/activities")
    public BaseResp Activities(){
        return null;
    }

    /**
     * 医院科室的详细情况
     * @return
     */
    @RequestMapping("/department")
    public BaseResp department(){
        return null;
    }

    /**
     * 医生信息,可以实现按科室,姓名,id,职称进行查询
     * @return
     */
    @RequestMapping("/doctor")
    public BaseResp doctor(){
        return null;
    }
}
