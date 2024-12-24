package com.wipro.cab.service;

import java.util.Arrays;

import com.wipro.cab.entity.CabDepot;
import com.wipro.cab.exception.InvalidDataException;
import com.wipro.cab.exception.ServiceUnavailableException;

public class CabRentalService {
	public String validateRoute(String source, String destination) {
		String[] validRoutes={"CBE","MAD","TEN","KDL","OTY"};
		if(source==null || destination==null||source.isEmpty()||destination.isEmpty()||destination.equals(source)) {
			return "Invalid Route";
		}
		boolean isSourceValid = Arrays.asList(validRoutes).contains(source);
        boolean isDestinationValid = Arrays.asList(validRoutes).contains(destination);
        if (isSourceValid && isDestinationValid) {
            return "Available";
        }
        else {
        	try {
        		throw new ServiceUnavailableException("Service Unavailable");
        	}
        	catch (ServiceUnavailableException e) {
        		return e.toString();
        	}
        }
		
	}
	
	public String validateData(String source, String destination, String cabType, int days) {
		String isValidRoute = validateRoute(source,destination);
		if(isValidRoute=="Available") {
			String[] validCab= {"micro","mini","sedan"};
			boolean isValidCab=Arrays.asList(validCab).contains(cabType);
			if(isValidCab && days>=1) {
				return "Valid";
			}
			else {
				try {
					throw new InvalidDataException("Invalid Data");
				}
				catch(InvalidDataException e){
					return e.toString();
				}
			}
		}
		else {
			return isValidRoute;
		}
	} 
	
	public String bookCab(String source, String destination, String cabType, int days) {
		String isValidData=validateData(source,destination,cabType,days);
		if(isValidData.equals("Valid")) {
			CabDepot cab=new CabDepot();
			cab.calculateRent(cabType, days);
			if(cab.getRentAmount()!=0.0) {
				return (cab.getBookedCabDetails()+"\nAmount:Rs."+cab.getRentAmount()+"\nCAB BOOKED !");
			}
			else {
				
				return "Car Not Available";
			}
		}
		else {
			return  (isValidData);
		}
	
	}
}
