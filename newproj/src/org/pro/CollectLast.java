package org.pro;

import java.util.*;
import java.lang.*;
import java.io.*;

class Student
{
	int rollno, rank;
	String name, address;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student(int rollno, String name, String address, int rank)
	{
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		this.rank = rank;
	}

	public String toString()
	{
		return this.rollno + " " + this.name + " " + this.address + " " + this.rank;
	}
}

class Sortbyroll implements Comparator<Student>
{

	public int compare(Student a, Student b)
	{
		return a.getRollno() -b.getRollno();
		// Fill your code
	}
}

class Sortbyname implements Comparator<Student>
{

	public int compare(Student a, Student b)
	{
		return a.getName().compareTo(b.getName());
		// Fill your code
	}
}

class SortbyRank implements Comparator<Student>
{

	private boolean ascending;

	public SortbyRank(boolean ascending) {
		this.ascending = ascending;
	}

	public int compare(Student a, Student b)
	{
		if(ascending==true) {
			return  b.getName().compareTo(a.getName());
		}
		else {
			return  a.getName().compareTo(b.getName());
		}
		// Fill your code

	}
}

class CollectLast
{
	public static void main (String[] args)
	{
		// Fill your code
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		int n= Integer.parseInt(sc.next());
		do {
			System.out.println("Student Interactive Console : ");
			System.out.println("1). Add User");
			System.out.println("2). Sort Student List by Roll no");
			System.out.println("3). Sort Student List by Name");
			System.out.println("4). sort Students by Rank");
			System.out.println("5). Exit from System");
			System.out.println();
			System.out.println("Enter your choice : ");
			if(n>=1 && n<=5){
			if(n==1) {
				System.out.println("Enter the rollno, name, address and rank (separated by comma)");
				String [] arr = sc.next().trim().split(",");
				list.add(new Student(Integer.parseInt(arr[0]), arr[1], arr[2],Integer.parseInt(arr[3])));
			    
			}
			if(n==2) {
			    System.out.println();
			     System.out.println("Students List sorted by rollno");
				Sortbyroll so = new Sortbyroll();
				Collections.sort(list,so);
				for (Student st : list) {
					System.out.println(st);
				}
			    
			}
			if(n==3) {
			    System.out.println();
			    System.out.println("Students List sorted by rollno");
				Sortbyname sn = new Sortbyname();
				Collections.sort(list,sn);
				for (Student st : list) {
					System.out.println(st);
				}
			
			}
			if(n==4) {
			    System.out.println("Sort by ascending or descending ( asc / des)");
				
				String as = sc.next();
				System.out.println();
				as.toLowerCase();
				if(as.contains("asc")) {
				    System.out.println("Students List sorted by Rank");
					SortbyRank sr = new SortbyRank(true);
					Collections.sort(list,sr);
					for (Student st : list) {
						System.out.println(st);
					}
					
				}
				else if(as.contains("dsc")){
				    System.out.println("Students List sorted by Rank");
					SortbyRank sr = new SortbyRank(false);
					Collections.sort(list,sr);
					for (Student st : list) {
						System.out.println(st);
					}
					
				}
				
			}
			if(n==5) {
				System.out.println("Exiting ...");
				System.exit(0);
			}
		}
			else{
			    System.out.println();
				System.out.println("Invalid Input try again !!!");
				System.out.println();
			}
			n=1;
			n= Integer.parseInt(sc.next());
		} while (n>0 && n<10);

	}
}
