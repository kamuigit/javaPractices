package org.sample;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class days {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String dateString = sc.nextLine();

		 DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		 Date startDate = f.parse(dateString);
		 
		 dateString = sc.nextLine();
		 Date dueDate = f.parse(dateString);  
		 
		Calendar c = Calendar.getInstance();
		c.setTime(dueDate);
		long d1 = c.getTimeInMillis();
		c.setTime(startDate);
		long d2 = c.getTimeInMillis();
		int diff =Math.abs((int)((d1-d2)/(1000*3600*24)));
		System.out.println(diff);
	}
}
