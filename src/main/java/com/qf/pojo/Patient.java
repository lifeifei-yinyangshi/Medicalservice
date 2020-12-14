package com.qf.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Patient {
    //病人id
    private Integer id;
    //病历id
    private Integer recordId;
    //病人姓名
    private String name;
    //病人年龄
    private Integer age;
    //病人性别
    private String sex;
    //病人地址
    private String address;
    //病人生日
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
}
