package org.night;

import java.util.Scanner;

public class First {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int pow=0,sum=0;
		int [] a = new int [n];
		for (int i = 0; i < n ;i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0;i <n; i++) {
			pow=(int)Math.pow(2,i);
			for (int j = 0; j < a.length; j++) {
				if(pow == (a[j]+1)) {
					sum =sum+a[j];
				}
			}
		}
		System.out.println(sum);
	}
}

