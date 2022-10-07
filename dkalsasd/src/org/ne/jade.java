package org.ne;

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
	try{
	Scanner sc = new Scanner (System.in);
	String name = sc.nextLine();
	int age = Integer.parseInt(sc.nextLine());
	int marks = Integer.parseInt(sc.nextLine());
	
	if(age<0){
	    throw new InvalidAgeForDrivingLicenseException("InvalidAgeForDrivingLicenseException:"+" Invalid age");
	}
	else if(age>=0 && age<=18){
	    throw new InvalidAgeForDrivingLicenseException("InvalidAgeForDrivingLicenseException:"+" Age should be more than 18 years old");
	}
	else if(marks<0 || marks>100 ){
	    throw new InvalidMarkForDrivingLicenseException("InvalidMarkForDrivingLicenseException:"+" Invalid mark");
	}
	if(marks>=0 && marks<=80){
	    throw new InvalidMarkForDrivingLicenseException("InvalidMarkForDrivingLicenseException:"+" Mark should be more than 80");
	}
	else {
	    System.out.println("Approved");
	}
	}
	catch(Exception e){
	    System.out.println(e.getMessage());
	}
	}
}