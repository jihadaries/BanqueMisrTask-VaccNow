package com.jsabry.vaccNowjsabry.model;

import java.util.Date;

public class Vaccination {

	private int appliedId;
    private int vaccineId;
    private int branchId;
    private int userId;
    private String timeSlot;
    private boolean confirmed;
    private Date appliedTime;
    
    public Vaccination() {
    }

    public Date getAppliedTime() {
		return appliedTime;
	}

	public void setAppliedTime(Date appliedTime) {
		this.appliedTime = appliedTime;
	}

	public Vaccination(int appliedId,int vaccineId,int branchId,int userId, String timeSlot, boolean confirmed, Date appliedTime) {
        this.appliedId = appliedId;
        this.vaccineId = vaccineId;
        this.branchId = branchId;
        this.userId = userId;
        this.timeSlot = timeSlot;
        this.confirmed = confirmed;
        this.appliedTime = appliedTime;
    }


	public int getVaccineId() {
		return vaccineId;
	}

	public void setVaccineId(int vaccineId) {
		this.vaccineId = vaccineId;
	}

	public int getAppliedId() {
		return appliedId;
	}

	public void setAppliedId(int appliedId) {
		this.appliedId = appliedId;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTimeslot() {
		return timeSlot;
	}

	public void setTimeslot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public boolean isConfirmed() {
		return confirmed;
	}

	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}


}
