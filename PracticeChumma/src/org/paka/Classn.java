package org.paka;

import java.util.*;
import java.text.*;

public class Classn {
	public static void main(String[] args){
		int n,i,j,k;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k=(n*2)-1;
		for(i=0;i<n;i++)
		{
			for(j=0;j<k;j++)
			{
				if((i==0)||(i==j)||(j==k-i-1)) { 
					System.out.print("*");
				}
				else if((j<i)||(j>=k-i))
				{
					System.out.print("b");
				}
				else
				{
					System.out.print("i");
				}
			}
			System.out.println();
		}


	}
}
