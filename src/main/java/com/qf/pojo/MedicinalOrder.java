package com.qf.pojo;

import java.util.List;

public class MedicinalOrder {
    //处方单id
    private Integer id;
    //药品列表
    private List<Medicinal> medicinals;
    //总价格
    private Double price;
    //订单状态
    private String state;
}
