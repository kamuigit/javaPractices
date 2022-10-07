package org.pro;

import java.io.*;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
class Event {
	// Type your code
	String name;
	String detail;
	String type;
	String ownerName;
	double costPerDay;
	public Event(String name,String detail,String type,String ownerName, double costPerDay) {
		super();
		this.name=name;
		this.detail=detail;
		this.type = type;
		this.ownerName=ownerName;
		this.costPerDay=costPerDay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}
	
}
class Exhibition extends Event
{
	public Exhibition(String name, String detail, String type, String ownerName, double costPerDay) {
		super(name, detail, type, ownerName, costPerDay);

	}

	// Type your code
	int noOfStall;

	public int getNoOfStall() {
		return noOfStall;
	}

	public void setNoOfStall(int noOfStall) {
		this.noOfStall = noOfStall;
	}

	public double gst(Date StartDate,Date DueDate) {
		double gst;
		long diff =(DueDate.getDate()-StartDate.getDate());
		return gst = ((5*costPerDay)/100)*diff;
	}

}
class StageEvent extends Event 
{
	public StageEvent(String name, String detail, String type, String ownerName, double costPerDay) {
		super(name, detail, type, ownerName, costPerDay);
	}
	int noOfSeats;
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public double gst(Date StartDate,Date DueDate) {
		double gst;
		long diff = (DueDate.getDate()-StartDate.getDate());
		return gst = ((15*costPerDay)/100)*diff;
	}
}
class Main{
	public static void main(String[] args) throws ParseException{
		// Type your code
		Scanner s = new Scanner(System.in);
		int a = Integer.parseInt(s.nextLine());
		String name = s.nextLine();
		String detail = s.nextLine();
		String type = s.nextLine();
		String ownerName = s.nextLine();
		double costPerDay = Double.parseDouble(s.nextLine());
		int g = Integer.parseInt(s.nextLine());
		String h = s.nextLine();
		DateFormat i = new SimpleDateFormat("dd/MM/yyyy");
		Date startDate = i.parse(h);
		h = s.nextLine();
		Date dueDate = i.parse(h);
		DecimalFormat d =new DecimalFormat("0.0");
		if(a==1) {
			Exhibition eObj = new  Exhibition(name,detail,type,ownerName,costPerDay);
			eObj.setNoOfStall(g);
			double amt =eObj.gst(startDate, dueDate);
			System.out.println(d.format(amt));
		}
		else if (a==2) {
			StageEvent jObj = new  StageEvent(name,detail,type,ownerName,costPerDay);
			jObj.setNoOfSeats(g);
			double amt =jObj.gst(startDate, dueDate);
			System.out.println(d.format(amt));
		}
		else {
			System.out.println("Invalid Entry");
		}

	}
}
