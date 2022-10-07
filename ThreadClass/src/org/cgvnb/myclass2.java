package org.cgvnb;

import java.util.Scanner;

public class myclass2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] c = str.toCharArray();
		int[] n = new int[str.length()];
		for (int i = 0; i < c.length; i++) {
			int b=0;
			for (int j = 0; j < c.length; j++) {
				if(c[i]==c[j]) {
					b++;
				}
			}
			n[i]= b;
		}
		for (int i = 0; i < c.length; i++) {
			int b=0;
			for (int j = 0; j <= i; j++) {
				if(c[i]==c[j]) {
					b++;
				}
			}
			if(b==1)
			System.out.println(c[i] +" "+n[i]);	
		}
	}
}

