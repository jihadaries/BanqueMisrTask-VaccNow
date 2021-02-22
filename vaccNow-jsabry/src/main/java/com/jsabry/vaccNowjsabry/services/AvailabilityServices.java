package com.jsabry.vaccNowjsabry.services;

import com.jsabry.vaccNowjsabry.model.Branches;
import com.jsabry.vaccNowjsabry.model.TimeSlot;
import com.jsabry.vaccNowjsabry.model.Vaccines;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface AvailabilityServices {
	
	public List<Branches> getAllBranches();
	public List<Vaccines> getAllAvailableVaccines();
	public List<Vaccines> getVaccinesInBranch(@PathVariable("branchid") int branchId);
	public List<TimeSlot> getAvailableTimeSlots(@PathVariable("branchid") int branchId);
	
}
