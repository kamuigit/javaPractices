package org.newpack;

import java.io.*;
import java.util.*;

class Threadf
{
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<HallBooking> list = new ArrayList<HallBooking>();
        for(int i=0;i<n;i++)
        {
            String hallName = sc.nextLine();
            Double cost = Double.parseDouble(sc.nextLine());
            int hallCapacity = Integer.parseInt(sc.nextLine());
            int seatsBooked = Integer.parseInt(sc.nextLine());
            HallBooking hb = new HallBooking(hallName,cost,hallCapacity,seatsBooked);
            list.add(hb);
        }
        for(HallBooking h:list)
        {
            Thread th = new Thread(h);
            th.start();
        
        }
    }
}
class HallBooking implements Runnable {
    private String hallName;
    private double cost;
    private int hallCapacity;
    private int seatsBooked;
	public HallBooking(String hallName, double cost, int hallCapacity, int seatsBooked)
	    {
	        this.hallName =hallName;
	        this.cost = cost;
	        this.hallCapacity = hallCapacity;
	        this.seatsBooked = seatsBooked;
	        
	    }
	    @Override 
	    public void run()
	    {
	        if((this.seatsBooked*100)>this.cost)
	        {
	            System.out.println("Profit");
	        }
	        else
	        {
	            System.out.println("Loss");
	        }
	    }
	    
	  
}
