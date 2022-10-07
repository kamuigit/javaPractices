package org.ne;

import java.io.*;
import java.util.*;

public class Hashmap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> set = new HashSet<>();
		int n = sc.nextInt();
		while(n > 0) {
			String name = sc.next();
			set.add(name);
			n--;
			
		}
		
		String Search = sc.next();
		if(set.contains(Search)) {
			System.out.println(Search + " is in the hash set.");
		}
		else {
			System.out.println(Search + " is not in the hash set.");
		}
	}
}