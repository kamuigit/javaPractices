package org.ne;

import java.io.*;
import java.util.*;

public class Frequency {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>=0) {
			String name = sc.nextLine();
			list.add(name);
			n--;
		}
		String search = sc.nextLine();
		System.out.println(Collections.frequency(list, search));
	}
}

