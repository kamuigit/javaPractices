package org.paka;

import java.util.Scanner;

public class joker {
	public static void main(String[] args) {
		int i,j,n,m,k,l,c=0,cc=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt();
		int a[] = new int[m];
		int b[] = new int[k];
		for(i=0;i<m;i++) {
			a[i] = sc.nextInt();
		}
		for(i=0;i<k;i++) {
			b[i] = sc.nextInt();
		}
		for(i=0;i<m;i++)
		{
			for(j=0;j<k;j++)
			{
				if(a[i]==b[j]){c++;}
			}
		}
		for(i=1;i<=n;i++)
		{
			for(j=0;j<m;j++)
			{
				if(a[j]==i)
				{
					break;
				}
				if(j==m-1)
				{
					for(l=0;l<k;l++)
					{
						if(b[l]==i)
						{
							break;
						}
						if(l==k-1){cc++;}
					}
				}
			}
		}
		System.out.println(c+" "+cc);
	}
}
