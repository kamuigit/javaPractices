package org.pro;

import java.util.Scanner;

public class Calander {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int  n =s.nextInt();
		int k = s.nextInt();
		int c =0;
		if(n>=1 && n<=100) {
			if(k>=1 && k<=100) {
				int [] a = new int [n];
				for (int i = 0; i < n; i++) {
					a[i] = s.nextInt();
				}
				for (int i = 0; i < a.length; i++) {
					if(a[i]>=k) {
						do{
							a[i]=a[i]-k;
							c++;
						}while(a[i]>=k);
					}
					else if(a[i]<k) {
						break;
					}
				}
			}
		}

		System.out.println(c);
	}
}
