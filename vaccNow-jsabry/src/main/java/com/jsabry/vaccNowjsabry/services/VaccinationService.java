package com.jsabry.vaccNowjsabry.services;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface VaccinationService {
	
	public Integer schedulevaccination(int branchId, int vaccineId, String timeSlot, int userId);
	public List<String> choosepayment(@RequestParam("userId") int userId);
	public String scheduleconfirmationemail(@RequestParam("userId") int userId);

}
