package org.cgvnb;

import java.util.Scanner;

public class myclass5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char [] c = str.toCharArray();
		int len = c.length;

		for (int i = 0; i < len; i++) {
			if (i==len-1) {
				if(c[i-1]+1==c[i] || c[i-1]-1==c[i]+1) {
					System.out.print(c[i]);
				}
				else {
					System.out.println(c[i]);
				}
			}
			else if(c[i]==c[i+1]-1 || c[i]==c[i+1]+1) {
				System.out.print(c[i]);
			}
			else {
				System.out.println(c[i]);
			}
		}
	}
}
