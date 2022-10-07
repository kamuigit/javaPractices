package org.Csfdsgd;

import java.util. *;

public class Class5 {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer();
		TreeSet<String> t = new TreeSet<>();
		t.add("17");
		t.add("12");
		t.add("13");
		t.add("14");
		t.add("16");
		
		Iterator itr = t.iterator();
		while(itr.hasNext()) {
			String it = (String) itr.next();
			System.out.println(it);
		}
	}
}
