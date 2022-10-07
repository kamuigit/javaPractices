package org.pro;


import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
class Shape {
	// Type your code here
	public double area ;
	public void computeArea(){
		area = 0;
	}
}
class Circle extends Shape {
	// Type your code here
	private double radius;

	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	public void computeArea(){
		DecimalFormat d = new DecimalFormat("0.00");
		this.area =(3.14)*(radius*radius);
		System.out.println(d.format(area));
	}
}
class Rectangle extends Shape {
	// Type your code here
	private double length;
	private double breadth;

	public double getLength(){
		return length;
	}
	public double getBreadth(){
		return breadth;
	}
	public void setLength(double length){
		this.length = length;
	}
	public void setBreadth(double breadth){
		this.breadth = breadth;
	}
	public void computeArea(){
		DecimalFormat d = new DecimalFormat("0.00");
		this.area =(length*breadth);
		System.out.println(d.format(area));
	}

}
class Triangle extends Shape {
	// Type your code here
	private double base;
	private double height;

	public double getBase(){
		return base;
	}
	public double getHeight(){
		return height;
	}
	void setBase(double base){
		this.base = base;
	}
	 void setHeight(double height){
		this.height = height;
	}
	public void computeArea(){
		DecimalFormat d = new DecimalFormat("0.00");
		this.area =(0.5)*(base*height);
		System.out.println(d.format(area));
	}
}
class Dssf {
	public static void main(String [] args) {
		// Type your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n==1){
			Circle c = new Circle();
			c.setRadius(s.nextDouble());
			c.computeArea();
		}
		else if(n==2){
			Rectangle r = new Rectangle();
			r.setLength(s.nextDouble());
			r.setBreadth(s.nextDouble());
			r.computeArea();
		}
		else if(n==3){
			Triangle t = new Triangle();
			t.setBase(s.nextDouble());
			t.setHeight(s.nextDouble());
			t.computeArea();
		}
		else{
			System.out.println("Invalid Input");
		}

	}
}




