package com.Invoice_Generator_done;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.Cab_Invoice_Generator.CabInvoiceGenerator;

//import junit.framework.Assert;

public class CabInvoiceServiceTest {
	CabInvoiceGenerator distnctime = null;
	
	// using before to create the distnctime object every time before test runs
	// its upto us to write r not to write
	
	@Before
	public void setUp() throws Exception{
	distnctime	 = new CabInvoiceGenerator();
	}

	@Test
	public void DistanceTime()
	{
		CabInvoiceGenerator distnctime = new CabInvoiceGenerator();
		double distance = 2.0;
		int time = 5;
		double fare = distnctime.calculatefare(distance, time);
		Assert.assertEquals(25,fare,0.0);
	}
	@Test
	public void MinimumDistanceTime() {
	CabInvoiceGenerator distnctime = new CabInvoiceGenerator();
	double distance = 0.1 ;
	int time = 1;
	double fare = distnctime.calculatefare(distance, time);
	Assert.assertEquals(5,fare,0.0);
	} 
	
	// for monthly fare
	
//	@Test
//	public void Rides_per_month() {
//		CabInvoiceGenerator distnctime = new CabInvoiceGenerator();
//		Ride[] rides = {new Ride(2.0, 5),
//						new Ride(0.1, 1)
//						};
//		double fare = distnctime.calculatefare(rides);
//		Assert.assertEquals(30, fare,0.0);
//		
//		}
//	}
	
	@Test
	public void Rides_per_month_toReturnInvoiceSummary() {
		CabInvoiceGenerator distnctime = new CabInvoiceGenerator();
		Ride[] rides = {new Ride(2.0, 5),
						new Ride(0.1, 1)
						};
		InvoiceSummary summary = distnctime.calculatefare(rides);
		InvoiceSummary expectedInvoice = new InvoiceSummary(2,30.0);
		Assert.assertEquals(expectedInvoice, summary);
		
		}
	}