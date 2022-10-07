package org.newpack;

import java.util.Scanner;
import java.util.Vector;

class Attendance extends Thread{
    static int a[],n;
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        for(int i=0;i<n;i++)
        a[i] = sc.nextInt();
        Attendance d = new Attendance();
        d.run();
    }
    public void run()
    {
        int c=0;
        for(int i:a)
        if(i==100)
        c++;
        System.out.println("Winners : "+c);
    }
    
    
    
}