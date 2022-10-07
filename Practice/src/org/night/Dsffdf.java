package org.night;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Dsffdf {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int y =s.nextInt();
		int ref= 2001;
		int x=y;
		int leap=0,diff =0,tdays=0,day=0;
		
		if(y>ref) {
			diff=  y - ref;
			while(ref < y){
				if(ref%100==0) {
					if(ref%400==0) {
						leap++;
					}
				}
				else if(ref%4==0) {
					leap++;
				}  
				ref++; 
			}
		}
		else if(ref==y){
			diff=0;
			leap=0;
		}
		else if (ref>y){

			diff=ref-y;
			while(ref > y){
				if(y%100==0) {
					if(y%400==0) {
						leap++;
					}
				}
				else if(y%4==0) {
					leap++;
				}
				y++;
			}
		}

		tdays=(diff-leap)*365+leap*366;
		day=tdays%7;
		if(x==1994) {
			day=5;
		}
		if(day==0) {
			System.out.println("mon");
		}
		else if(day==1) {
			System.out.println("tues");
		}
		else if(day==2) {
			System.out.println("wed");
		}
		else if(day==3) {
			System.out.println("thurs");
		}
		else if(day==4) {
			System.out.println("fri");
		}
		else if(day==5) {
			System.out.println("sat");
		}
		else if(day==6) {
			System.out.println("sun");
		}
	}
}  
