package com.qf.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class PatientRecord {
    //病历id
    private Integer id;
    //主治医生id
    private Integer doctorId;
    //科室id
    private Integer departmentId;
    //病人id
    private Integer patientId;
    //病人姓名
    private String patientName;
    //预约时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date appointmentTime;
    //病历状态
    private String state;
    //体检订单id
    private Integer physicalExaminationId;
    //处方订单id
    private Integer prescription;
}
