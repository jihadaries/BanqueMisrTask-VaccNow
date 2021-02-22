package com.jsabry.vaccNowjsabry.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class VaccinationRepository {

    @Autowired
    JdbcTemplate template;
    
    public int schedulevaccination(int branchId,int vaccineId,String timeSlot, int userId){
        String query = "INSERT INTO `vaccination` (`appliedId`, `branchId`,`vaccineId`, `timeSlot`, `userId`, `isConfirmed`, `appliedTime`) VALUES(?,?,?,?,?,false,sysdate)";
        return template.update(query, template.getMaxRows()+1,branchId,vaccineId,timeSlot,userId);
    }

}
