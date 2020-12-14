package com.qf.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Department {

    //科室id
    private Integer id;

    //科室名称
    private String name;

    //科室主管id
    private Integer doctorId;

    //科室医生列表
    private List<Doctor> doctors;

}
