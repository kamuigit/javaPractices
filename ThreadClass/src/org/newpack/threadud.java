package org.newpack;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.concurrent.*;

 class threaddud{
    public static void main(String [] args)
    {
        for(int i =1;i<=20;i++)
        {
            EvenAndOdd e = new EvenAndOdd(i);
            Thread th = new Thread(e);
            th.run();
        }
    }
}
class EvenAndOdd extends Thread
{
    int num;
    EvenAndOdd(int num)
    {
        this.num = num;
    }
    public void run()
    {
        if(this.num%2==0)
        {
            System.out.println("Thread even: "+this.num);
        }
        else
        {
            System.out.println("Thread Odd: "+this.num);
        }
    }
    class Odd extends Thread
    {
        public void run()
        {
            System.out.println("Thread Odd: ");
        }
    }
}