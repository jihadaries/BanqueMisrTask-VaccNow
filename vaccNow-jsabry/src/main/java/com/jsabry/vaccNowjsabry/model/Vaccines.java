package com.jsabry.vaccNowjsabry.model;

public class Vaccines {
    private int vaccineId;
    private String vaccineName;

    public Vaccines() {
    }

    public Vaccines(int vaccineId, String VaccineName) {
        this.vaccineId = vaccineId;
        this.vaccineName = VaccineName;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

	public int getVaccineId() {
		return vaccineId;
	}

	public void setVaccineId(int vaccineId) {
		this.vaccineId = vaccineId;
	}


}
