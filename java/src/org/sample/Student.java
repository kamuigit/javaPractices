package org.sample;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Student {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Map<Integer, Avengers> g = new LinkedHashMap<>();
		System.out.println("The number of student details to be input: ");
		int n = s2.nextInt();
		for (int i = 0; i <=(n-1); i++) {
			Avengers d = new Avengers();
			d.setStdid(s.nextInt());
			d.setStdname(s.next());
			d.setPhno(s2.nextLong());
			d.setAddress(s1.nextLine());
			d.setDob(s1.nextLine());
			d.setEmail(s.next());
			d.setGen(s.next().charAt(0));
			
			g.put(i, d);
			
		}
		Set<Entry<Integer, Avengers>> ent = g.entrySet();
		for (Entry<Integer, Avengers> a : ent) {
			System.out.println("\n");
			System.out.println("Student-details  no "+a.getKey());
			System.out.println("Student id: "+a.getValue().getStdid());
			System.out.println("Student name: "+a.getValue().getStdname());
			System.out.println("Ph.no: "+a.getValue().getPhno());
			System.out.println("Address: "+a.getValue().getAddress());
			System.out.println("D.O.B: "+a.getValue().getDob());
			System.out.println("E-Mail: "+a.getValue().getEmail());
			System.out.println("Gender: "+a.getValue().getGen());
			
			
		}
	}
}
