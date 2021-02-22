package com.jsabry.vaccNowjsabry.repository;

import com.jsabry.vaccNowjsabry.model.Branches;
import com.jsabry.vaccNowjsabry.model.TimeSlot;
import com.jsabry.vaccNowjsabry.model.Vaccines;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AvailabilityRepository {
    @Autowired
    JdbcTemplate template;
    public List<Branches> getAllBranches(){
        List<Branches> branches = template.query("select branchId, branchName, branchAddress from branches",(result,rowNum)->new Branches(result.getInt("branchId"), result.getString("branchName"), result.getString("branchAddress")));
        return branches;
    }
    public List<Vaccines> getAllAvailableVaccines(){
        List<Vaccines> vaccines = template.query("select v.vaccineId as vaccineId, v.vaccineName as vaccineName from vaccines v, branch_vaccine b where v.vaccineId = b.vaccineId ",(result,rowNum)->new Vaccines(result.getInt("vaccineId"), result.getString("vaccineName")));
        return vaccines;
    }
    public List<Vaccines> getVaccinesInBranch(int branchId){
        List<Vaccines> vaccines = template.query("select v.vaccineId as vaccineId, v.vaccineName as vaccineName from vaccines v, branch_vaccine b where v.vaccineId = b.vaccineId and b.branchId = "+branchId,(result,rowNum)->new Vaccines(result.getInt("vaccineId"), result.getString("vaccineName")));
        return vaccines;
    }
    
    public List<TimeSlot> getAvailableTimeSlots(int branchId){
        List<TimeSlot> timeslots = template.query("select slotId, branchId, timeSlot from branch_timeslots where branchId="+branchId,(result,rowNum)->new TimeSlot(result.getInt("slotId"),result.getInt("branchId"), result.getString("timeSlot")));
        return timeslots;
    }    

}
