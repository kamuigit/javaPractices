package org.afasd;

//You are using Java
import java.util.Scanner;
class InvalidAgeForDrivingLicenseException extends Exception {

// Fill your code
public InvalidAgeForDrivingLicenseException(String s){
  super(s);
}
}


class InvalidMarkForDrivingLicenseException extends Exception {
//Fill your code
public InvalidMarkForDrivingLicenseException(String s){
 super(s);
}
}


class RegisterForDrivingLicenseDemo {
	public static void main(String[] args) {
	// Fill your code
	String name;
	int age,marks;
	Scanner sc = new Scanner (System.in);
	name = sc.nextLine();
	age = Integer.parseInt(sc.nextLine());
	marks = Integer.parseInt(sc.nextLine());
	try{
	if(age<0){
	    throw new InvalidAgeForDrivingLicenseException("InvalidAgeForDrivingLicenseException: Invalid age");
	}
	if(age<18){
	    throw new InvalidAgeForDrivingLicenseException("InvalidAgeForDrivingLicenseException: Age should be more than 18 years old");
	}
	if(marks<0){
	    throw new InvalidMarkForDrivingLicenseException("InvalidMarkForDrivingLicenseException: Invalid mark");
	}
	if(marks<80){
	    throw new InvalidMarkForDrivingLicenseException("InvalidMarkForDrivingLicenseException: Mark should be more than 80");
	}
	if(age>18 && marks>80){
	    System.out.println("Approved");
	}
	}
	catch(Exception e){
	    System.out.println(e.getMessage());
	}
	}
}