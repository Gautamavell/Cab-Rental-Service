package com.wipro.cab.entity;

public class CabDepot {
	public static Cab[] cabs;
	public float rentAmount;
	public Cab bookedCab;
	
	public void calculateRent(String cabType,int days){
		for(Cab i: cabs) {
			if(i.cabType.equals(cabType)) {
				if(i.isAvailable) {
					this.rentAmount=getRatePerDay(cabType)*days;
					this.bookedCab=(i);
					i.isAvailable=false;
					this.bookedCab.isAvailable=false;
				}
			}
		}
	}
	
	public float getRatePerDay(String cabType) {
		float rent = 0;
		if(cabType.equals("micro")) {
			rent= (float) (2525.0f+(2525*0.1));
		}
		else if(cabType.equals("mini")) {
			rent=(float) (3110.0f+(3110.0f*0.12));
		}
		else if(cabType.equals("sedan")) {
			rent=(float)(3500.0f+(3500.0f*0.16));
		}
		return rent;
	}
	
	public String getBookedCabDetails() {
		return ("Cab Type:"+this.bookedCab.cabType+"\nCab No:"+this.bookedCab.regNo);
	}

	public static String getCabs() {
		for(Cab i: cabs) 
			System.out.println(i.toString());
		return ""; 
	}

	public static void setCabs(Cab[] cabs) {
		CabDepot.cabs = cabs;
	}

	public float getRentAmount() {
		return rentAmount;
	}

	public Cab getBookedCab() {
		return bookedCab;
	}

	@Override
	public String toString() {
		return "CabDepot [rentAmount=" + rentAmount + ", bookedCab=" + bookedCab + ", getBookedCabDetails()="
				+ getBookedCabDetails() + ", getRentAmount()=" + getRentAmount() + ", getBookedCab()=" + getBookedCab()
				+ "]";
	}
	
	
}
