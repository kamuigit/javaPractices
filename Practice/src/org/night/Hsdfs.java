package org.night;

import java.util.Scanner;

public class Hsdfs {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int c;
		for (int i = 2; i <= n; i++) {
			c=0;
			for (int j = 2; j <= i/2; j++) {
				if(i%j==0) {
					c++;
				}
			}
			if(c==0) {
				System.out.println(i);
			}
		}
	}
}
