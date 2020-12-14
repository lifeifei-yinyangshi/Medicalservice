package com.qf.pojo;

import lombok.Data;

import java.util.List;

@Data
public class PhysicalExaminationOrder {
    //处方单id
    private Integer id;
    //药品列表
    private List<PhysicalExaminationProject> medicalProjects;
    //总价格
    private Double price;
    //订单状态
    private String state;
}
