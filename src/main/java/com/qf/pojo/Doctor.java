package com.qf.pojo;

import lombok.Data;

@Data
public class Doctor {
    //医生id
    private Integer id;
    //医生姓名
    private String name;
    //医生性别
    private String sex;
    //医生所属部门
    private Integer departmentId;
    //医生职位
    private String position;
}
