package org.night;

import java.util.Scanner;

public class Gdsdf {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int t =s.nextInt();
		int a =s.nextInt();
		int b =s.nextInt();
		int c =s.nextInt();
		int count=0;
		
		while (t>0 ){
			if(a%25==0) {
				t=t+20;
			}
			a++;
			t--; 
			count++;
			if(t==0) {
				break;
			}
			
			if(b%120==0) {
				t=t+80;
			}
			b++;
			t--;
			count++;
			if(t==0) {
				break;
			}
			
			if(c%12==0) {
				t=t+8;
			}
			c++;
			t--;
			count++;
			if(t==0) {
				break;
			}
		}
		System.out.println(count);
	}
}
