package org.night;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class calss {
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   int a= Integer.parseInt(sc.nextLine());
		   String[] str = new String [a];
		   for (int i = 0; i < str.length; i++) {
			str[i]=sc.nextLine();
		}
		   Arrays.toString(str);
		   Arrays.sort(str,Comparator.comparingInt(String::length));
		   for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]+" ");
		}
		   
	}
}
