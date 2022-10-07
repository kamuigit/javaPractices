package org.dkalsasd;

//You are using Java
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
class VISACard {
	// Type your code
	private String holderName;
	private String ccv;
	public VISACard(String holderName,String ccv){
	    this.holderName=holderName;
	    this.ccv=ccv;
	}
	public Double computeRewardPoints(String purchaseType,Double amount){
	    return amount/100;
	}
	
}
class HPVISACard extends VISACard {
 // Type your code
 private String holderName;
	private String ccv;
	public HPVISACard(String holderName,String ccv){
	    super(holderName,ccv);
	    this.holderName=holderName;
	    this.ccv=ccv;
	}
	public Double computeRewardPoints(String purchaseType,Double amount){
	    super.computeRewardPoints(purchaseType,amount);
	    if(purchaseType.equalsIgnoreCase("fuel")){
	        return((amount/100)+10);
	    }
	   else{
	    return amount/100;
	   }
	}
}


class Main {
	public static void main(String [] args) {
	// Type your code
	Scanner sc = new Scanner(System.in);
	String holderName,ccv,purchaseType;
	Double amount,points;
	holderName = sc.nextLine();
	ccv = sc.nextLine();
	amount = sc.nextDouble();
	purchaseType = sc.next();
	int choice = sc.nextInt();
	VISACard v = new VISACard(holderName,ccv);
	HPVISACard h = new HPVISACard(holderName,ccv);
	DecimalFormat d = new DecimalFormat("0.0");
	if(choice==1){
	    points = v.computeRewardPoints(purchaseType,amount);
	    System.out.println(d.format(points));
	}
	else if (choice==2){
	    points = h.computeRewardPoints(purchaseType,amount);
	    System.out.println(d.format(points));
	}
	else{
	    System.out.println("Invalid Choice");
	}
	}
}

