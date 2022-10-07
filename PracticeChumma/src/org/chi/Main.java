package org.chi;

import java.util.Scanner;

class Person{
	String name;
	 int year;
	 Person(){
	     
	 }
	 Person(String name, int year){
	     this.name=name;
	     this.year=year;
	     System.out.println("Name : "+name);
	     System.out.println("BirthYear : "+year);
	 }
	 @Override
	public String toString() {
		return ("Name : "+name+"\nBirthYear : "+year);
	}
}
class Staff extends Person{
	float salary;
	Staff(){
	    
	}
	Staff(String name, int year,float salary){
	    super(name,year);
	    this.salary=salary;
	}
	@Override
	public String toString() {
		return ("\nOld Salary : "+salary);
	}
}
class Student extends Person{
    
        String Dept;
        int Atten_per;
        Student(String name,int year,String Dept,int Atten_per){
            super(name,year);
            this.Dept=Dept;
            this.Atten_per=Atten_per;
            
        }
  
        @Override
    	public String toString() {
        	if (Atten_per>=75){
        		return ("Department : "+Dept+"\nEligible : Yes");
            }
            else{
            	return ("Department : "+Dept+"\nEligble : No");
            }
    		
    	}
    }


class TeachingStaff extends Staff{
    String Subject;
    float res_per;
    TeachingStaff(String name,int year,float salary,String Subject,float res_per){
        super(name,year,salary);
        this.Subject=Subject;
        this.res_per=res_per;
        
    }
    float temp=0;
    float per;
    @Override
	public String toString() {
    	temp=res_per/10;
        per=((temp*salary)/100);
        per=per+salary;
		return ("\nSubject : "+Subject+"\nNew Salary : "+per);
	}
}


class NonTeachingStaff extends Staff{
	String Lab;
	int Exp;
	NonTeachingStaff(String name,int year,float salary,String Lab,int Exp){
	    super(name,year,salary);
	    this.Lab=Lab;
	    this.Exp=Exp;
	    
	}
	float per;
	
	@Override
	public String toString() {
		per=(Exp*salary)/100;
	    per=per+salary;
		return ("\nLab : "+Lab+"\nNew Salary : "+per);
	}
}
class Main{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	String name=sc.next();
	int year=sc.nextInt();
	if(a==1){
	    String Dept=sc.nextLine();
	    String D=sc.nextLine();
	    int peroo=sc.nextInt();
	    Student s1=new Student(name,year,D,peroo);
	    System.out.println(s1);
	}
	else if(a==2){
	    String Subject=sc.next();
	    float per=sc.nextFloat();
	    float salary=sc.nextFloat();
	    TeachingStaff t1=new TeachingStaff(name,year,salary,Subject,per);
	    System.out.println(t1);
	}
	else if(a==3){
	    String Lab=sc.nextLine();
	    String Lab1=sc.nextLine();
	    int exp=sc.nextInt();
	    float salary=sc.nextFloat();
	    NonTeachingStaff t1=new NonTeachingStaff(name,year,salary,Lab1,exp);
	    System.out.println(t1);
	}
    }
}
