package dsdsfsdffdfs;

//You are using Java
import java.io.*;
import java.util.*;
class ItemType implements Comparable<ItemType>{
 private String name;
 private double deposit;
 private double costPerDay;
 
 public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getDeposit() {
	return deposit;
}

public void setDeposit(double deposit) {
	this.deposit = deposit;
}

public double getCostPerDay() {
	return costPerDay;
}

public void setCostPerDay(double costPerDay) {
	this.costPerDay = costPerDay;
}

public ItemType(String name,double deposit,double costPerDay) {
	 this.name=name;
	 this.deposit=deposit;
	 this.costPerDay=costPerDay;
}

@Override
public int compareTo(ItemType o) {
	return (int) (this.getCostPerDay()-o.getCostPerDay());
}
}
class chumma {
public static void main(String [] args) {
 
   ArrayList<ItemType> list = new ArrayList<ItemType>();
   Scanner sc = new Scanner(System.in);
   int n = Integer.parseInt(sc.nextLine());
   while(n>0) {
	   String name=sc.nextLine();
	   double deposit=Double.parseDouble(sc.nextLine());
	   double costPerDay=Double.parseDouble(sc.nextLine());
	   list.add(new ItemType(name, deposit, costPerDay));
	   n--;
   }
   Collections.sort(list);
   for (ItemType ty : list) {
	System.out.println(ty.getName()+" "+ty.getDeposit()+" "+ty.getCostPerDay());
}
 
 }
}
