package com.qf.pojo;

import lombok.Data;

@Data
public class PhysicalExaminationProject {
    //体检项目id
    private Integer id;
    //体检项目名称
    private String name;
    //体检项目分类
    private String category;
}
