package Bonus;

public class Employee {
	
	String name;
	int hours;
	double totalPay;
	final int MAXHOUR =40;
	final double HOURLY_RATE1 = 15;
	final double HOURLY_RATE2 = 16.5;

	public Employee() {
		
		this.name ="";
		this.hours = 0;
		this.totalPay = 0;		
	}
	
	public void setTotalPay( int hours, String name) {
		
		int extHours;
		
		this.name = name;
		this.hours = hours;
		
		if (hours>40)
		{
			extHours = hours - MAXHOUR;   
			this.totalPay = (MAXHOUR * HOURLY_RATE1) + (extHours * HOURLY_RATE2);
		}
		else {
			this.totalPay = HOURLY_RATE1;
		}
		
	}
	
	public double getTotalPay() {
		return this.totalPay;
	}
	public void display() {
		System.out.println("Nme: " + this.name);
		System.out.println("Hours: " + this.hours);
		System.out.println("Total Pay: " + this.totalPay);
	}
}
