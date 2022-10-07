package org.Csfdsgd;

import java.util.Scanner;

public class Class4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		int count [] = new int[256];
		for (int i = 0; i < str2.length(); i++) {
			count[str2.charAt(i)]++;
		}
		char [] c = str1.toCharArray();
		int j=0;
		for (int i = 0; i < c.length; i++) {
			char temp = str1.charAt(i);
			if(count[temp]==0) {
				c[j] = c[i];
				j++;
			}
		}
		String str3 = new String(c);
		System.out.println(str3.substring(0,j));
	}
}
