package org.afasd;

import java.text.DecimalFormat;
import java.util.Scanner;

class Person{
	String name;
	int birthYear;
	public Person(String name,int birthYear) {
		this.name=name;
		this.birthYear=birthYear;
	}
	@Override
	public String toString() {
		return ("Name : "+name+"\n"+"BirthYear : "+birthYear);
	}
}
class Staff extends Person{

	public Staff(String name, int birthYear) {
		super(name, birthYear);
	}
	@Override
	public String toString() {
		return ("Name : "+name+"\n"+"BirthYear : "+birthYear);
	}
	double salary;
	 
}
class Student extends Person{
	
	public Student(String name, int birthYear) {
		super(name, birthYear);
	}
	@Override
	public String toString() {
		return ("Name : "+name+"\n"+"BirthYear : "+birthYear);
	}
	String department;
	int attendancePercent;
	public void eligible(String department,int attendancePercent) {
		System.out.println("Name : " +name);
		System.out.println("BirthYear : " +birthYear);
		System.out.println("Department : " +department);
		if (attendancePercent>=75) {
			System.out.println("Eligible : Yes");
		}
		else {
			System.out.println("Eligible : No");
		}
	}
}

class TeachingStaff extends Staff{

	public TeachingStaff(String name, int birthYear,double salary) {
		super(name, birthYear);
		this.salary=salary;
	}
	@Override
	public String toString() {
		return ("Name : "+name+"\n"+"BirthYear : "+birthYear);
	}
	String subject;
	int resultPercentage;

	public void newSal(String subject,int resultPercentage) {
		DecimalFormat d = new DecimalFormat("0.0");
		double percent = (resultPercentage/10);
		percent = (((salary*percent)/100)+salary);
		System.out.println("Old Salary : "+salary);
		System.out.println("Subject : "+subject);
		System.out.println("New Salary : "+d.format(percent));
	}
}


class NonTeachingStaff extends Staff{
	
	public NonTeachingStaff(String name, int birthYear,double salary) {
		super(name, birthYear);
		this.salary=salary;
	}
	@Override
	public String toString() {
		return ("Name : "+name+"\n"+"BirthYear : "+birthYear);
	}
	String Lab;
	int experience;
	
	public void newSal(String Lab,int experience) {
		DecimalFormat d = new DecimalFormat("0.0");
		System.out.println("Old Salary : "+salary);
		System.out.println("Lab : "+Lab);
		double percent = (((salary*experience)/100)+salary);
		System.out.println("New Salary : "+d.format(percent));

	}
	
}


class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int code = Integer.parseInt(sc.nextLine());
		String name = sc.nextLine();
		int birthYear = Integer.parseInt(sc.nextLine());
		if(code ==1) {
			Student sud = new Student(name, birthYear);
			sud.eligible(sc.nextLine(), sc.nextInt());
		}
		else if(code==2) {
			String a =sc.nextLine();
			int b = Integer.parseInt(sc.nextLine());
			double c= sc.nextDouble();
			TeachingStaff ts = new TeachingStaff(name,birthYear,c);
			System.out.println(ts);
			ts.newSal(a,b);
		}
		else if(code==3) {
			String a =sc.nextLine();
			int b = Integer.parseInt(sc.nextLine());
			double c= sc.nextDouble();
			NonTeachingStaff nts = new NonTeachingStaff(name, birthYear,c);
			System.out.println(nts);
			nts.newSal(a, b);
		}
		else {
			System.out.println("Invalid Entry");
		}
 }
}

