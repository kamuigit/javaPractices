package org.prac;

//You are using Java
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

abstract class Account{
 
 // Type your code
 String name;
 int number;
 int balance;
 Date StartDate;
	
	public Account(String name ,int number,int balance, Date startDate){
	    super();
	    this.name=name;
	    this.number=number;
	    this.balance=balance;
	    this.StartDate=startDate;
	}
	abstract double calculateInterest(Date dueDate);
}

class CurrentAccount extends Account{
	
 // Type your code
 public CurrentAccount(String name ,int number,int balance, Date startDate){
     super(name,number,balance,startDate);
 }
 
 @Override
 double calculateInterest(Date dueDate){
     double interest;
     interest = balance*5*(diff(StartDate ,dueDate)/12)/100;
     return interest;
 }
 
 public int diff(Date startDate,Date dueDate){
     int diff = (dueDate.getYear()-startDate.getYear())*12;
     diff = diff + (dueDate.getMonth()-startDate.getMonth());
     return diff;
 }
 

}

class SavingsAccount extends Account{

 // Type your code
 public SavingsAccount(String name ,int number,int balance, Date startDate){
     super(name,number,balance,startDate);
 }
 
 @Override
 double calculateInterest(Date dueDate){
     double interest;
	interest = balance*12*(diff(StartDate ,dueDate)/12)/100;
     return interest;
 }
 
 public int diff(Date startDate,Date dueDate){
     
	int diff = (dueDate.getYear()-startDate.getYear())*12;
     diff = diff + (dueDate.getMonth()-startDate.getMonth());
     return diff;
 }
 

}

class Main{
	public static void main(String args[]) throws ParseException {
	 // Type your code	
	 Scanner sc = new Scanner (System.in);
	 int type = Integer.parseInt(sc.nextLine());
	 String name = sc.nextLine();
	 int number =Integer.parseInt(sc.nextLine());
	 int balance =Integer.parseInt(sc.nextLine());
	 String dateString = sc.nextLine();

	 DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
	 Date startDate = f.parse(dateString);
	 
	 dateString = sc.nextLine();
	 Date dueDate = f.parse(dateString);
	 
	 if(type==1){
	     SavingsAccount sObj = new SavingsAccount(name,number,balance,startDate);
	     System.out.println(sObj.calculateInterest(dueDate));
	 }
	 else if(type==2){
	     CurrentAccount cObj = new CurrentAccount(name,number,balance,startDate);
	     System.out.println(cObj.calculateInterest(dueDate));
	 }
	 else {
	     System.out.println("Invalid Entry");
	 }
	 
	}
}