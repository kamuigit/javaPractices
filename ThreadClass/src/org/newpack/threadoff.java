package org.newpack;

//You are using Java
import java.io.*;
import java.util.*;

class Main {
public static void main(String [] args){
 
 // Type your code here
 Scanner sc = new Scanner(System.in);
 int n = Integer.parseInt(sc.nextLine());
 List<Stall> list = new ArrayList<Stall>();
 for(int i=0;i<n;i++)
 {
     String stallName = sc.nextLine();
     String details = sc.nextLine();
     double stallArea = Double.parseDouble(sc.nextLine());
     String owner = sc.nextLine();
     Stall stall = new Stall(stallName,details,stallArea,owner);
     list.add(stall);
 }
 sc.close();
 for(Stall st:list)
 {
     Thread th = new Thread(st);
     th.start();
 }
 
}
}
class Stall extends Thread
{
 private String stallName;
 private String details;
 private double stallArea;
 private String owner;
 private double stallCost;
 Stall(String stallName,String details,double stallArea,String owner)
 {
     this.stallName = stallName;
     this.details = details;
     this.stallArea = stallArea;
     this.owner = owner;
 }
 public void run()
 {
     this.stallCost = this.stallArea*150.0;
     System.out.println(stallCost);
 }
}