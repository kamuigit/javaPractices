package org.paka;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();

		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			map.put(sc.nextLine(),Integer.parseInt(sc.nextLine()));
		}
		System.out.println(map);
		map.replace(sc.nextLine(),Integer.parseInt(sc.nextLine()));
		System.out.println(map);
		for(Entry<String, Integer> ent : map.entrySet()) {
			System.out.println(ent.getKey() +" "+ ent.getValue());
		}
	}
}
