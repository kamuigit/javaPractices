package org.ne;

import java.io.*;
import java.util.*;


class Hall{
	private String name;
	private String contactNumber;
	private Double costPerDay;
	private String ownerName;
	
	Hall(){
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getcontactNumber() {
		return contactNumber;
	}
	
	public void setcontactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public Double getcostPerDay() {
		return costPerDay;
	}
	
	public void setcostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}
	
	public String getownerName() {
		return ownerName;
	}
	
	public void setownerName(String ownerName) {
		this.ownerName = ownerName;
	}
	Hall(String name, String contactNumber, Double costPerDay, String ownerName){
		this.name = name;
		this.contactNumber = contactNumber;
		this.costPerDay = costPerDay;
		this.ownerName = ownerName;
	}
	
	void display() {
		System.out.printf("%-20s%-20s%-20s%-20s\n", name, contactNumber, costPerDay, ownerName);
	}
	
}

public class newhall {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Hall> hall = new ArrayList<Hall>();
		int n = sc.nextInt();
		
		
		sc.nextLine();
		
		if(n > 0) {
			while(n > 0) {
				//sc.nextLine();
				String name = sc.nextLine();
				String ctNo = sc.next();
				Double cPerDay = sc.nextDouble();
				String oName = sc.next();
				
				Hall h = new Hall(name, ctNo, cPerDay, oName);
				hall.add(h);
				
				n--;
				sc.nextLine();
			}
			
			int r = sc.nextInt();
			hall.remove(r);
			
			System.out.printf("%-20s%-20s%-20s%-20s\n", "Name", "Contact Number", "CostperDay", "Owner Name");
			Iterator<Hall> itr = hall.iterator();
			while(itr.hasNext()) {
				Hall h = (Hall)itr.next();
				h.display();
			}
		
		}
		else {
			int r = sc.nextInt();
			if(hall.isEmpty()) {
				System.out.println("The list is empty");
			}
		}
	}

}
