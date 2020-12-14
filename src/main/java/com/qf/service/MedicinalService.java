package com.qf.service;

import com.qf.pojo.Medicinal;

public interface MedicinalService {
    /**
     * 新增药品
     * @return
     */
    Integer insertMedicinal();

    /**
     * 删除药品
     * @return
     */
    Integer deleteMedicinal();

    /**
     * 修改药品信息
     * @return
     */
    Integer updateMedicinal();

    /**
     * 查询药品
     * @return
     */
    Medicinal selectMedicinal();

}
