package org.cgvnb;

import java.util.Scanner;

public class myclass6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		char[] a = s.toCharArray();
		String b = new String();
		for (int i = 0; i < a.length; i++) {
			int c =0;
			for (int j = 0; j <= i; j++) {
				if(a[i]==a[j]) {
					c++;
				}
			}
			if(c==1) {
				b=b+a[i];
			}
		}
		System.out.println(b);
	}
}
