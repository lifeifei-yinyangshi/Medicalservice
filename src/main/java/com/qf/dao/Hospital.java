package com.qf.dao;

import com.qf.pojo.Department;
import com.qf.pojo.Doctor;

import java.util.List;

public interface Hospital {
    //查询所有科室
    List<Department> findAllDepartments();
    //查询单个科室
    Department findDepartment();
    //查询所有医生
    List<Doctor> findAllDoctors();
    //查询单个医生资料
    Doctor findDoctor();
}
