package org.newpack;

import java.util.Scanner;
import java.util.*;

class MatrixMultiplication extends Thread
{
    static int a[][],b[][],c[][],r1,r2,c1,c2;
    public static void main(String [] args)
    {
        int i,j,rv,cv;
        Scanner sc = new Scanner(System.in);
        String d[];
        d = sc.nextLine().split(" ");
        r1 = Integer.parseInt(d[0]);
        c1 = Integer.parseInt(d[1]);
        a = new int[r1][c1];
        d = sc.nextLine().split(" ");
        r2 = Integer.parseInt(d[0]);
        c2 = Integer.parseInt(d[1]);
         b = new int[r2][c2];
         c=new int[r1][c2];
         for(i=0;i<r1;i++)
         {
             d = sc.nextLine().split(" ");
             for(j =0;j<c1;j++)
             {
                 a[i][j]=Integer.parseInt(d[j]);
             }
         }
         for(i=0;i<r2;i++)
         {
             d = sc.nextLine().split(" ");
             for(j=0;j<c2;j++)
             {
                 b[i][j]=Integer.parseInt(d[j]);
                 
             }
         }
         MatrixMultiplication m = new MatrixMultiplication();
         m.run();
    }
    
    public void run()
    {
        for(int i=0;i<r1;i++)
        {
            for(int j =0;j<c2;j++)
            {
                c[i][j] =0;
                for(int k =0; k<r2;k++)
                {
                    c[i][j] += a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
