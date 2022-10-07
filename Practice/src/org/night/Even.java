package org.night;

import java.util.Scanner;

public class Even {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();

		if(a==1 && b%2==0) {
			System.out.println("yes");
		} 
		else if(b==1 && a%2==0) {
			
			System.out.println("yes");
		}
		else if(a%2==0 && b%2==0) {
			double sqt= Math.sqrt(a);
			double sqt1= Math.sqrt(b);
			if(sqt ==Math.floor(sqt) && sqt1 ==Math.floor(sqt1)) {
				System.out.println("no");
				System.exit(0);
			}
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
}
