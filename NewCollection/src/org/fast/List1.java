package org.fast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;



class CallLog  implements Comparable<CallLog>{
	
	private long dialledNumber;
	private int duration;
	private String dialledDate;
	
	CallLog(long dialledNumber, int duration, String dialledDate){
		this.dialledNumber = dialledNumber;
		this.duration = duration;
		this.dialledDate = dialledDate;
	}
	
	public int compareTo(CallLog log)
	{
		return this.duration - log.duration;
	}
	
	public long getNumber() {
		return dialledNumber;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public String getDate() {
		return dialledDate;
	}
	
	public String toString() {
		String s = ("DialledNumber : " + dialledNumber + "," + " Duration : " + duration + "," + " Date : " + dialledDate);
		return s;
	}
	
}

public class List1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<CallLog> a = new ArrayList<CallLog>();
		
		int n = sc.nextInt();
		while(n > 0) {
			long phNo = sc.nextLong();
			int duration = sc.nextInt();
			String date = sc.next();
			
			CallLog p = new CallLog(phNo, duration, date);
			a.add(p);
			n--;
		}
		
		
		Collections.sort(a);
		
		for(CallLog call : a)
		{
			System.out.println(call.toString());
			
		}
	}
}
