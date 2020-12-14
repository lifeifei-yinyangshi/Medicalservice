package com.qf.pojo;

import lombok.Data;

import java.util.List;

@Data
public class PhysicalExaminationOrder {
    //体检订单id
    private Integer id;
    //体检项目列表
    private List<PhysicalExaminationProject> medicalProjects;
    //总价格
    private Double price;
    //订单状态
    private String state;
}
