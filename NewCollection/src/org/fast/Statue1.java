package org.fast;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Statue1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		String b = sc.next();
		sc.close();
		if(a!=b.length()) {
			System.exit(0);
		}
		LinkedList<Integer> l = new LinkedList<Integer>();
		for (int i = 0; i < b.length(); i++) {
			l.add((int)b.charAt(i));
		}
		ListIterator itr = l.listIterator();
		while(itr.hasNext()) {
			Integer j = (Integer)itr.next();
			
		}
	}
}