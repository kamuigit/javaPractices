package org.night;

import java.util.Scanner;

public class Fir {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int k = s.nextInt();
		int d = 0;
		while(m>=k || n>=k){
			m=m-1;
			n=n-1;
		} 
		if(m>n){
			d=m-n-k;
		}
		else if(n>m){
			d=n-m-k;
		}
		else if(m==n) {
			d=m-k;
		}
		System.out.println(d);
	}
}
