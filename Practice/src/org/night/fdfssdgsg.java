package org.night;

import java.util.Scanner;

public class fdfssdgsg {
	public void clock(int m,int n,int mat[][]) {
		
	    
		System.out.println("Clock-wise direction");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}

	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int [][] mat = new int  [m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j]= s.nextInt();
			}
		}
		int rot = s.nextInt();
		if (m>0 && m<=10) {
			if (n>0 && n<=10) {
				if (rot>0 && rot<=10) {
					for (int i = 0; i < m; i++) {
						for (int j = 0; j < n; j++) {
							System.out.print(mat[i][j]+" ");
						}
						System.out.println();
					}
					System.out.println();
					fdfssdgsg g = new fdfssdgsg();
					g.clock(m,n,mat);
				}
			}
		}
	}
}
