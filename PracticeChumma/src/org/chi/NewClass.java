package org.chi;

import java.util.Scanner;

public class NewClass {
	static String fun(String a) {
		String [] b = a.trim().split(" ");
		for (int i = 0; i < b.length; i++) {
			String c = new String();
			b[i]=b[i].toLowerCase();
			for (int j = b[i].length()-1; j >=0; j--) {
				c = c + b[i].charAt(j);
			}
			b[i] = c.substring(0,1).toUpperCase() + c.substring(1);
		}
		String d = new String();
		for (int i = 0; i < b.length; i++) {
			if(i==b.length-1) {
				d = d+b[i];
				break;
			}
			d = d+b[i]+ " ";
		}
		return d;
	}
	static String funny(String a) {
		  StringBuilder result = new StringBuilder();
		  for(String s : a.split(" ")) {
			  String rev = new StringBuilder(s).reverse().toString();
			  rev = Character.toUpperCase(rev.charAt(0)) + rev.substring(1);
			  result.append(rev).append(" ");
		  }
		  String b = result.toString();
		return b;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();

		System.out.println(funny(a));

	}
}
