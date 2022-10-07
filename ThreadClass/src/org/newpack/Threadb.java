package org.newpack;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
class details{
	static List<Double> a=new ArrayList<Double>();
	static List<Double> i=new ArrayList<Double>();
}
class Account extends Thread {
	String accountNmber,acccountHolderName;
	double balance;
	Account(String accountNmber,double balance,String acccountHolderName){
		this.accountNmber=accountNmber;
		this.balance=balance;
		this.acccountHolderName=acccountHolderName;
	}
	public void run(){
		if(balance>=10000){
			details.i.add(0.08 * balance);
			details.a.add(0.08 * balance + balance);
		}
		else if(balance>0 && balance<10000){
			details.i.add(0.05 * balance);
			details.a.add(0.05 * balance + balance);
		}
	}
	public static void main(String[] agf){
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++){
			String accountNmber=sc.nextLine();
			double balance=Double.parseDouble(sc.nextLine());
			String acccountHolderName=sc.nextLine();
			Account acc=new Account(accountNmber,balance,acccountHolderName);
			acc.run();
		}
		Collections.reverse(details.i);
		Collections.reverse(details.a);
		for(double d : details.i)
			System.out.printf("%.2f\n",d);
		for(double d : details.a)
			System.out.printf("%.2f\n",d);
	}
}