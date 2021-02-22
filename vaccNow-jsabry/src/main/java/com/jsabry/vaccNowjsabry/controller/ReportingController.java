package com.jsabry.vaccNowjsabry.controller;

import com.jsabry.vaccNowjsabry.model.Vaccination;
import com.jsabry.vaccNowjsabry.services.ReportingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reporting")
public class ReportingController {
    @Autowired
    ReportingService reportingService;

    @RequestMapping(value="/branches/{branchid}/appliedvaccination", method = RequestMethod.GET)
    @ResponseBody
    public List<Vaccination> vaccination(@PathVariable("branchid") int branchId){
        return reportingService.vaccination(branchId);
    }

    @RequestMapping(value="/appliedvaccinationperday/{date}", method = RequestMethod.GET)
	public List<Vaccination> vaccination(@PathVariable("date") String date){
		return reportingService.vaccination(date);
	}
	
    @RequestMapping(value="/listallconfirmedvaccination/{date1}/{date2}", method = RequestMethod.GET)
	public List<Vaccination> listConfirmedVaccination(@PathVariable("date1") String date1, @PathVariable("date2") String date2){
		return reportingService.listConfirmedVaccination(date1, date2);
	}
}