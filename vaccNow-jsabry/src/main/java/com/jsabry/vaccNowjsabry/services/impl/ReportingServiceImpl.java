package com.jsabry.vaccNowjsabry.services.impl;

import com.jsabry.vaccNowjsabry.model.Vaccination;
import com.jsabry.vaccNowjsabry.repository.ReportingRepository;
import com.jsabry.vaccNowjsabry.services.ReportingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ReportingServiceImpl implements ReportingService {
	
	@Autowired
    ReportingRepository reportingRepo;
	
	@Override
	public List<Vaccination> vaccination(@PathVariable("branchid") int branchId){
        return reportingRepo.appliedvaccination(branchId);
    }
	
	@Override
	public List<Vaccination> vaccination(@PathVariable("date") String date){
		return reportingRepo.appliedvaccinationperday(date);
	}
	
	@Override
	public List<Vaccination> listConfirmedVaccination(@PathVariable("date1") String date1, @PathVariable("date2") String date2){
		return reportingRepo.listAllConfirmedVaccination(date1, date2);
	}

}
