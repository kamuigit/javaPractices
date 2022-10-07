package org.prac;
import java.util.Scanner;

public class pr {
	public static int primefact(int n){
		if (n <= 1) {  
			return 0;  
		} 
		else {  
			int div = 2;  
			while (div < n) {  
				if (n % div != 0) {  
					div++;  
				} else {  
					n = n / div;  
					div = 2;  
				}  
			}  
			return n;  
		} 
	}
	public static int prime(int n) {
		int prime = 0;
		for(int i = 2; i < n; i++) {
			if((n % i) == 0) {
				prime = 1;
			}
		}
		return prime;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number ::");
		int n = s.nextInt();
		while(n!=0) {
			if(prime(n)==0) {
				n=n-1;
				System.out.println(n);
				System.exit(0);
			}
			else {
				System.out.println(primefact(n));
				System.exit(0);
			}

		}

	}
}