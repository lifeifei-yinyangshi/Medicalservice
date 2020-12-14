package com.qf.service;

import com.qf.common.BaseResp;
import org.springframework.web.bind.annotation.RequestMapping;

public interface HospitalService {
    /**
     * 医院活动,简介和指引
     */
    public BaseResp Activities();

    /**
     * 医院科室的详细情况
     */
    public BaseResp department();

    /**
     * 医生信息,可以实现按科室,姓名,id,职称进行查询
     */
    public BaseResp doctor();
}
