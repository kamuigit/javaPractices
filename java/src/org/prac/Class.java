package org.prac;

import java.util.Scanner;

public class Class {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int []t = new int [n];
		for (int i = 0; i < n; i++) {
			t[i] = s.nextInt();
		}
		for (int i = 0; i < t.length; i++) {
			int a=0,b=1;
			System.out.print(a+" "+b+" ");
			for (int j = 2; j < t[i]; j++) {
				int c= a+b;
				System.out.print(c+" ");
				a=b;
				b=c;
			}
			System.out.println();
		}
	}
}
