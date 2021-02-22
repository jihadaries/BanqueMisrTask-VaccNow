package com.jsabry.vaccNowjsabry.services.impl;

import com.jsabry.vaccNowjsabry.model.Branches;
import com.jsabry.vaccNowjsabry.model.TimeSlot;
import com.jsabry.vaccNowjsabry.model.Vaccines;
import com.jsabry.vaccNowjsabry.repository.AvailabilityRepository;
import com.jsabry.vaccNowjsabry.services.AvailabilityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class AvailabilityServicesImpl implements AvailabilityServices {

	@Autowired
	AvailabilityRepository availabilityRepo;

	@Override
	public List<Branches> getAllBranches() {
		return availabilityRepo.getAllBranches();
	}

	@Override
	public List<Vaccines> getAllAvailableVaccines() {return availabilityRepo.getAllAvailableVaccines();
	}

	@Override
	public List<Vaccines> getVaccinesInBranch(@PathVariable("branchid") int branchId) {
		return availabilityRepo.getVaccinesInBranch(branchId);
	}

	@Override
	public List<TimeSlot> getAvailableTimeSlots(@PathVariable("branchid") int branchId) {
		return availabilityRepo.getAvailableTimeSlots(branchId);
	}

}
