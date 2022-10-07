package org.Csfdsgd;

import java.util.*;

public class Class1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		if(str1.length()!=str2.length()) {
			System.out .println("Invalid entry");
			System.exit(0);
		}
		String str3 = str1 + str1;
		if(str3.contains(str2)) {
			System.out.println("Its a rotation");
		}
		else {
			System.out.println("Its not a rotation");
		}
	}
}
