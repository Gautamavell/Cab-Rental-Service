package com.wipro.cab.main;

import com.wipro.cab.entity.Cab;
import com.wipro.cab.entity.CabDepot;
import com.wipro.cab.service.CabRentalService;
import java.util.Scanner; 

public class MainClass {
	public static void main(String[] args) throws Exception{
		Scanner input=new Scanner(System.in);
		
		Cab cabs[] = new Cab[3];
		cabs[0]=new Cab(601, "mini", "TN37AP0007", true); 
		cabs[1]=new Cab(602,"micro","TN06CX7536",false); 
		cabs[2]=new Cab(603, "sedan", "TN28JA1234", true); 
		CabDepot.setCabs(cabs); 
		
		
		System.out.println(CabDepot.getCabs());
		
		CabRentalService carService = new CabRentalService(); 
		
		
		System.out.println("Please enter the details for booking :-");
		System.out.println("From : ");
		String from=input.next();
		System.out.println("To : ");
		String to=input.next();
		System.out.println("Cab type : ");
		String CabType=input.next();
		System.out.println("No.of Days :");
		int days=input.nextInt();

		
		System.out.println(carService.bookCab(from, to, CabType, days));
	
	}
}
