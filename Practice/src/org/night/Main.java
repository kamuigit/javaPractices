package org.night;

//You are using Java
import java.io.*;
import java.util.*;
class Event {
	// Type your code here
	String name;
	String detail;
	String type;
	String organiserName;
	public Event(String name,String detail,String type,String organiserName) {
		super();
		this.name=name;
		this.detail=detail;
		this.type = type;
		this.organiserName=organiserName;
	}
}
class Exhibition extends Event {

	public Exhibition(String name, String detail, String type, String organiserName,Integer noOfStalls) {
		super(name, detail, type, organiserName);
		this.noOfStalls =noOfStalls;
	}
	int noOfStalls;
	// Type your code here
}
class StageEvent extends Event {

	public StageEvent(String name, String detail, String type, String organiserName,Integer noOfSeats) {
		super(name, detail, type, organiserName);
		this.noOfSeats=noOfSeats;
	}
	// Type your code here
	int noOfSeats;
}
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		String[] line = sc.nextLine().trim().split(",");
		if(a==1) {
			Exhibition ex =new Exhibition(line[0], line[1], line[2], line[3], Integer.parseInt(line[4]));
			for (int i = 0; i < line.length; i++) {
				System.out.print(line[i]+" ");
			}
		}
		else if(a==2) {
			StageEvent se =new StageEvent(line[0], line[1], line[2], line[3], Integer.parseInt(line[4]));
			for (int i = 0; i < line.length; i++) {
				System.out.print(line[i]+" ");
			}
		}
		
	}
}
