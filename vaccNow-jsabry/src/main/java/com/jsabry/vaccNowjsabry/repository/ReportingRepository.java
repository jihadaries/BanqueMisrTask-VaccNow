package com.jsabry.vaccNowjsabry.repository;

import com.jsabry.vaccNowjsabry.model.Vaccination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReportingRepository {

    @Autowired
    JdbcTemplate template;


    public List<Vaccination> appliedvaccination(int branchId){
        List<Vaccination> appliedVaccination = template.query("select appliedId, branchId, vaccineId, timeSlot, userId, isConfirmed, appliedTime from vaccination where branchId="+branchId,(result,rowNum)->new Vaccination(result.getInt("appliedId"),
        		result.getInt("vaccineId"),result.getInt("branchId"),result.getInt("userId"),result.getString("timeSlot"),result.getBoolean("isConfirmed"), result.getDate("appliedTime")));
        return appliedVaccination;
    }
    
    public List<Vaccination> appliedvaccinationperday(String date){
    	List<Vaccination> appliedVaccination = template.query("select appliedId, branchId, vaccineId, timeSlot, userId, isConfirmed, appliedTime from vaccination where appliedTime BETWEEN DATE '"+date+"' AND DATE '"+date+"'",(result,rowNum)->new Vaccination(result.getInt("appliedId"),
        		result.getInt("vaccineId"),result.getInt("branchId"),result.getInt("userId"),result.getString("timeSlot"),result.getBoolean("isConfirmed"), result.getDate("appliedTime")));
        return appliedVaccination;
    }
    
    public List<Vaccination> listAllConfirmedVaccination(String date1, String date2){
        List<Vaccination> appliedVaccination = template.query("select appliedId, branchId, vaccineId, timeSlot, userId, isConfirmed, appliedTime from vaccination where isConfirmed is true and appliedTime BETWEEN DATE '"+date1+"' AND DATE '"+date2+"'",(result,rowNum)->new Vaccination(result.getInt("appliedId"),
        		result.getInt("vaccineId"),result.getInt("branchId"),result.getInt("userId"),result.getString("timeSlot"),result.getBoolean("isConfirmed"), result.getDate("appliedTime")));
        return appliedVaccination;
    } 
}
