package org.fast;

import java.io.*;
import java.util.*;


class Hall implements Comparable<Hall> {

	private String name;
	private String contactNumber;
	private double costPerDay;
	private String owner;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public double getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Hall(String name,String contactNumber,double costPerDay,String owner){
		this.name =name;
		this.contactNumber=contactNumber;
		this.costPerDay=costPerDay;
		this.owner=owner;
	}
	// Fill your code

	@Override
	public int compareTo(Hall o) {
		return (int) (this.costPerDay -o.getCostPerDay());
	}
	@Override
	public String toString() {
		return (name+" "+contactNumber+" "+costPerDay+" "+owner);
	}
}
class ListOf {
	public static void main(String [] args) {
		// Fill your code
		ArrayList<Hall> list = new ArrayList<Hall>();
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		while(n>0){
			String name =sc.nextLine();
			String contactNumber = sc.nextLine();
			double costPerDay=Double.parseDouble(sc.nextLine());
			String owner=sc.nextLine();
			list.add(new Hall(name, contactNumber, costPerDay, owner));
			n--;
		}
		sc.close();
		Collections.sort(list);
		for(Hall ha: list){
			System.out.println(ha);
		}

	}
}
