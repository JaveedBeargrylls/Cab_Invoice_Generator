package com.Cab_Invoice_Generator;

import com.Invoice_Generator_done.InvoiceSummary;
import com.Invoice_Generator_done.Ride;

public class CabInvoiceGenerator {
	
	private static final double cost_per_KM = 10.0;
	private static final int  wage_per_Minute = 1;
	private static final double Minimum_Fare = 5;
	
	// Step1 Distance and Time
	public double calculatefare(double distance, int time){
		
		double totalFare = distance * cost_per_KM + time * wage_per_Minute;
		
//		if(totalFare < Minimum_Fare)
//		{
//			return Minimum_Fare;
//		}
//		else
//			return totalFare;
//	} // we can reduce by using Math.max of total and minimum
		
		return Math.max(totalFare, Minimum_Fare);
	}

	public InvoiceSummary calculatefare(Ride[] rides) {
		double totalFare = 0;
		for (Ride ride : rides) {
			totalFare += this.calculatefare(ride.distance, ride.time);	
		}
		return new InvoiceSummary(rides.length, totalFare);
	}
}
