package com.jsabry.vaccNowjsabry.controller;

import com.jsabry.vaccNowjsabry.model.PaymentOptions;
import com.jsabry.vaccNowjsabry.services.VaccinationService;
import com.jsabry.vaccNowjsabry.util.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vaccination")
public class VaccinationController {
	@Autowired
	VaccinationService vaccinationServices;

	@RequestMapping(value = "/schedulevaccination", method = RequestMethod.POST)
	@ResponseBody
	public String schedulevaccination(@RequestParam("branchId") int branchId,
                                      @RequestParam("vaccineId") int vaccineId, @RequestParam("timeSlot") String timeSlot,
                                      @RequestParam("userId") int userId) {

		if (vaccinationServices.schedulevaccination(branchId, vaccineId, timeSlot, userId) >= 1) {
			return "Successfully Scheduled";
		} else {
			return "Something went wrong!";
		}
	}

	@RequestMapping(value = "/choosepayment", method = RequestMethod.POST)
	@ResponseBody
	public List<String> choosepayment(@RequestParam("userId") int userId) {
		return PaymentOptions.getPaymentOptions();
	}

	@RequestMapping(value = "/scheduleconfirmationemail", method = RequestMethod.POST)
	@ResponseBody
	public String scheduleconfirmationemail(@RequestParam("userId") int userId) {return Utility.emailUtility();	}
}