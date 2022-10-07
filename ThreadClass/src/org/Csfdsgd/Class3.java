package org.Csfdsgd;

import java.util.Scanner;

public class Class3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {3,4,5,6,7,8,1,2};
		int a = sc.nextInt();
		int b=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==a) {
				System.out.println("the key is at index :"+i);
			}
			else if(arr[i]!=a) {
				b++;
			}
		}
		if(b==arr.length) {
			System.out.println("the key "+a+" does not exist." );
		}
	}
}
