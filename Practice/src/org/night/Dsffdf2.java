package org.night;

//You are using Java
import java.util.*;
import java.io.*;
class Dssdf2 {
	public static void main(String [] args) {
	   //Type your code here.. 
	   Scanner sc = new Scanner(System.in);
	   int dd=01,mm=01;
	   int year = sc.nextInt();
	   // jan,feb,march,april,may,jun,july,august,sep,oct,nov,dec-for normal year
	   int month [] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	   String day [] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	   if(year%400 ==0){
	       if(year%100==0){
	           month[2]=29;
	       }
	   }
	   else if(year%4==0){
	       month[2]=29;
	   }
	   int days = dd;    // first day
	   for(int i=1;i<mm;i++){
	       days = days+month[i];
	   }
	   int yy =year-1;
	   days=days+(yy*365);
	   days=days+(yy/400)+(yy/4)-(yy/100);
	   
	   int da =days%7;
	   System.out.println(day[da]);
	}
}
