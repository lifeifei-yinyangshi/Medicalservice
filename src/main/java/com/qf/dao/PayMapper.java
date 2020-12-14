package com.qf.dao;

import com.qf.pojo.MedicinalOrder;
import com.qf.pojo.PhysicalExaminationOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PayMapper {

    /**
     * 添加体检订单
     * @param medicalOrder
     * @return
     */
    Integer insertPhysicalExaminationOrder(PhysicalExaminationOrder medicalOrder);

    /**
     * 根据体检订单id查询体检订单
     * @param transferId
     * @return
     */
    PhysicalExaminationOrder findPhysicalExaminationOrderBytransferId(@Param("transferid") String transferId);

    /**
     * 根据体检订单id修改体检订单
     * @param bytransferId
     */
    void updatePhysicalExaminationOrderById(PhysicalExaminationOrder bytransferId);

    /**
     * 添加处方订单
     * @param medicinalOrder
     * @return
     */
    Integer insertMedicinalOrder(MedicinalOrder medicinalOrder);

    /**
     * 根据处方订单id查询处方订单
     * @param transferId
     * @return
     */
    MedicinalOrder findMedicinalOrderBytransferId(@Param("transferid") String transferId);

    /**
     * 根据处方订单id修改处方订单
     * @param bytransferId
     */
    void updateMedicinalOrderOrderById(MedicinalOrder bytransferId);

}
