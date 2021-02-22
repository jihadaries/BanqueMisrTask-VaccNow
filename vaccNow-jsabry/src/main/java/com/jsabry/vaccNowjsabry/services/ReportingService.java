package com.jsabry.vaccNowjsabry.services;

import com.jsabry.vaccNowjsabry.model.Vaccination;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ReportingService {
	
	public List<Vaccination> vaccination(@PathVariable("branchid") int branchId);
	public List<Vaccination> vaccination(@PathVariable("date") String date);
	public List<Vaccination> listConfirmedVaccination(@PathVariable("date1") String date1, @PathVariable("date2") String date2);

}
