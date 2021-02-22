package com.jsabry.vaccNowjsabry.model;

public class TimeSlot {

    private int slotId;
    private int branchId;
    private String timeSlot;

    public TimeSlot() {
    }

    public TimeSlot(int branchId, int slotId, String timeSlot) {
        this.branchId = branchId;
        this.slotId = slotId;
        this.timeSlot = timeSlot;
    }


	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public int getSlotId() {
		return slotId;
	}

	public void setSlotIid(int slotId) {
		this.slotId = slotId;
	}

	public String getTimeslot() {
		return timeSlot;
	}

	public void setTimeslot(String timeSlot) {
		this.timeSlot = timeSlot;
	}



}
