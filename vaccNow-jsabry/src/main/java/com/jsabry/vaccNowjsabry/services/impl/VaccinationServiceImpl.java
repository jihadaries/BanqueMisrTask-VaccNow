package com.jsabry.vaccNowjsabry.services.impl;

import com.jsabry.vaccNowjsabry.model.PaymentOptions;
import com.jsabry.vaccNowjsabry.repository.VaccinationRepository;
import com.jsabry.vaccNowjsabry.services.VaccinationService;
import com.jsabry.vaccNowjsabry.util.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class VaccinationServiceImpl implements VaccinationService {

	@Autowired
	VaccinationRepository vaccinationRepo;

	@Override
	public Integer schedulevaccination(int branchId, int vaccineId, String timeSlot, int userId) {
		return vaccinationRepo.schedulevaccination(branchId, vaccineId, timeSlot, userId);
	}

	@Override
	public List<String> choosepayment(@RequestParam("userId") int userId) {
		return PaymentOptions.getPaymentOptions();
	}

	@Override
	public String scheduleconfirmationemail(@RequestParam("userId") int userId) {
		return Utility.emailUtility();
	}
}
