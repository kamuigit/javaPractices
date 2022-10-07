package org.newpack;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
class ItemType extends Thread{
    
    // Type your code here  
    String name1;
    double deposit,costPerItem;
    int noOfItems;
    ItemType(String name1,double deposit,double costPerItem,int noOfItems)
    {
        this.name1 =name1;
        this.deposit = deposit;
        this.costPerItem =costPerItem;
        this.noOfItems = noOfItems;
        
    }
    @Override
    public void run()
    {
        System.out.format("%.2f",costPerItem*noOfItems);
        System.out.println();
    }
}
 class ThreadA
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++)
        {
            String name1 = sc.nextLine();
            double deposit = Double.parseDouble(sc.nextLine());
            double cost = Double.parseDouble(sc.nextLine());
            int items = Integer.parseInt(sc.nextLine());
            ItemType it = new ItemType(name1,deposit,cost,items);
            it.run();
        }
    }
}