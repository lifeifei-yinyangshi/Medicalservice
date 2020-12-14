package com.qf.service;

import com.qf.pojo.Medicinal;

public interface PhysicalExaminationProjectService {
    /**
     * 新增检查项目
     * @return
     */
    Integer insertPhysicalExaminationProject();

    /**
     * 删除检查项目
     * @return
     */
    Integer deletePhysicalExaminationProject();

    /**
     * 修改检查项目信息
     * @return
     */
    Integer updatePhysicalExaminationProject();

    /**
     * 查询检查项目信息
     * @return
     */
    Medicinal selectPhysicalExaminationProject();
}
