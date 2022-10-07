package org.fast;

//You are using Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Student
{
	int rollno, rank;
	String name, address;

	public Student(int rollno, String name, String address, int rank)
	{
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		this.rank = rank;
	}
	
	@Override
	public String toString(){
		return this.rollno + " " + this.name + " " + this.address + " " + this.rank;
	}
}

class Sortbyroll implements Comparator<Student>
{

	public int compare(Student a, Student b){
		return 0;
		// Fill your code
	}
}

class Sortbyname implements Comparator<Student>
{

	public int compare(Student a, Student b)
	{
		return 0;
		// Fill your code
	}
}

class SortbyRank implements Comparator<Student>
{
 
 private boolean ascending;
 
 public boolean isAscending() {
	return ascending;
}

public void setAscending(boolean ascending) {
	this.ascending = ascending;
}

public SortbyRank(boolean ascending) {
     this.ascending = ascending;
 }

	public int compare(Student a, Student b)
	{
		return 0;
	// Fill your code
	}
}

class List3
{
	public static void main (String[] args)
	{
	// Fill your code
		Scanner sc = new Scanner(System.in);
		
	}
}

