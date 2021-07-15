package com.Invoice_Generator_done;

public class InvoiceSummary {

	private int NumOfrides;
	private double totalFare;
	private double averageFare;

	public InvoiceSummary(int NumOfrides, double totalFare) {
		this.NumOfrides = NumOfrides;
		this.totalFare = totalFare;
		this.averageFare = this.totalFare/this.NumOfrides;
	}

  	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceSummary other = (InvoiceSummary) obj;
		if (NumOfrides != other.NumOfrides)
			return false;
		if (Double.doubleToLongBits(averageFare) != Double.doubleToLongBits(other.averageFare))
			return false;
		if (Double.doubleToLongBits(totalFare) != Double.doubleToLongBits(other.totalFare))
			return false;
		return true;
	}
	
}
