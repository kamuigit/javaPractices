package org.night;

import java.util.Scanner;
import java.util.regex.Pattern;

class Matrot{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int kid = 0;
        int type = sc.nextInt();
        int min = sc.nextInt();
        int arr[] = new int [type];
        for (int i=0;i<type;i++)
        {
            arr[i]=sc.nextInt();
            kid=kid+arr[i]/min;
        }
        System.out.println(kid);
	}
}

