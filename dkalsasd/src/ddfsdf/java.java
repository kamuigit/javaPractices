package ddfsdf;

//You are using Java
import java.io. *;
import java.util.*;
class Hall implements Comparable<Hall>{
 private String name;
 private double costPerDay;
 private String owner;
 
 public String getName(){
     return name;
 }
 
 public void setName(String name){
     this.name =name;
 }
 
 public double getCostPerDay(){
     return costPerDay;
 }
 public void setCostPerDay(double costPerDay){
     this.costPerDay=costPerDay;
 }
 public String getOwner(){
     return owner;
 }
 public void setOwner(String owner){
     this.owner=owner;
 }
 public Hall(String name,double costPerDay,String owner){
     this.name =name;
     this.costPerDay=costPerDay;
     this.owner=owner;
 }

@Override
public int compareTo(Hall o) {
	return 0;
}
 

 
}
class java {
public static void main(String [] args) {
 
   ArrayList<Hall> list = new ArrayList<Hall>();
   Scanner sc = new Scanner(System.in);
   int n = Integer.parseInt(sc.nextLine());
   while(n>0){
       String name = sc.nextLine();
       double costPerDay = Double.parseDouble(sc.nextLine());
       String owner = sc.nextLine();
       list.add( new Hall (name,costPerDay,owner));
       n--;
   }
   list.sort((o1,o2) -> o1.getOwner().compareTo(o2.getOwner()));
   for(Hall ty: list){
       System.out.println(ty.getName()+" "+ty.getCostPerDay()+" "+ty.getOwner());
   }
 
 }
}
 
 