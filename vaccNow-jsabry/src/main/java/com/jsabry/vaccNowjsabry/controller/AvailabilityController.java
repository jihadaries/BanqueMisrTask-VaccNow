package com.jsabry.vaccNowjsabry.controller;

import com.jsabry.vaccNowjsabry.model.Branches;
import com.jsabry.vaccNowjsabry.model.TimeSlot;
import com.jsabry.vaccNowjsabry.model.Vaccines;
import com.jsabry.vaccNowjsabry.services.AvailabilityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/availability")
public class AvailabilityController {
    @Autowired
    AvailabilityServices availabilityService;

    @RequestMapping(value="/branches", method = RequestMethod.GET)
    @ResponseBody
    public List<Branches> getAllBranches(){
        return availabilityService.getAllBranches();
    }

    @RequestMapping(value="/vaccines", method = RequestMethod.GET)
    @ResponseBody
    public List<Vaccines> getAllAvailableVaccines(){return availabilityService.getAllAvailableVaccines();
    }

    @RequestMapping(value="/branches/{branchid}/vaccines", method = RequestMethod.GET)
    @ResponseBody
    public List<Vaccines> getVaccinesInBranch(@PathVariable("branchid") int branchId){
        return availabilityService.getVaccinesInBranch(branchId);
    }

	@RequestMapping(value="/branches/{branchid}/availabletimeslot", method = RequestMethod.GET)
	public List<TimeSlot> getAvailableSlotInBranch(@PathVariable("branchid") int branchId){
		return availabilityService.getAvailableTimeSlots(branchId);
	}
}