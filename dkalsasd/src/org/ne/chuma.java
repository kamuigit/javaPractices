package org.ne;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class chuma {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a =Integer.parseInt(sc.nextLine());
		Set<String> s = new TreeSet<String>();
		for(int i=0; i<a;i++){
			s.add(sc.nextLine());
		}
		System.out.println(s.size());
		for (String string : s) {
			System.out.println(string);
		}
	}

}
