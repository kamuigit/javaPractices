package org.night;

import java.util.regex.*;

public class Newclass {
	public static void main(String[] args) {
		String s = "gsdgg   dsdf     sfgsg      sgdf ";
		String s2 = s.replaceAll("\\s+", " ");
		System.out.println(s2);
	}

}
