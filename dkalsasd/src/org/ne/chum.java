package org.ne;

import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
class VISACard {
     private String holderName;
     private String ccv;
     public VISACard(String holderName, String ccv){
         this.holderName = holderName;
         this.ccv = ccv;
     }
     public Double computeRewardPoints(String purchaseType,Double amount){
         return amount/100;
     }
   }
class HPVISACard extends VISACard {
       private String holderName;
       private String ccv;
       public HPVISACard(String holderName, String ccv){
         super(holderName,ccv);
     }
      public Double computeRewardPoints(String purchaseType, Double amount){
          super.computeRewardPoints(purchaseType,amount);
          if(purchaseType.compareTo("fuel")==0){
            return ((amount/100)+10);
          }
            else{
          return amount/100;
            }
      }
    }

class chum {
	public static void main(String[] args) {
	// Type your code
	Scanner sc = new Scanner(System.in);
	String holderName,ccv,purchaseType;
	Double points;
	int choice;
	holderName=sc.next();
	ccv = sc.next();
	Double amount = sc.nextDouble();
	purchaseType = sc.next();
	choice = sc.nextInt();
	VISACard vc = new VISACard(holderName,ccv);
	DecimalFormat d = new DecimalFormat("0.0");
	HPVISACard hvc = new HPVISACard(holderName,ccv);
	switch(choice){
	    case 1:
	        points = vc.computeRewardPoints(purchaseType,amount);
	        System.out.println(d.format(points));
	        break;
	        case 2:
	            points = hvc.computeRewardPoints(purchaseType,amount);
	            System.out.println(d.format(points));
	            break;
	            default:System.out.println("Invalid Choice");
	 }
	}
}