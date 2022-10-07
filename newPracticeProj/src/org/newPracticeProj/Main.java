package org.newPracticeProj;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

class Event{
	static int checkEventAvailable(Date date) {
		Calendar c1 = new GregorianCalendar();
		c1.setTime(date);
		int a = c1.get(c1.MONTH)+1;
		if(a%2 == 0) {
			return a;
		}
		else {
			return 0;
		}
	}	
	static Double getAmountWithDiscount(Double amount,Date date) {
		int val = checkEventAvailable(date);
		if(val!= 0) {
			amount = amount - ((amount *  val )/ 100 );
			return amount;
		}
		else {
			System.out.println(val);
			return amount;
		}
	}
}
class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc= new Scanner(System.in);
		String dat = sc.nextLine();
		double amount = Double.parseDouble(sc.nextLine());
		
		SimpleDateFormat ds = new SimpleDateFormat("dd/MM/yyyy");
		Date date = ds.parse(dat);
		
		Double value = Event.getAmountWithDiscount(amount, date);
		
		if(value == amount) {
			System.out.println("Not for BIGBASH  event");
		}
		else {
			System.out.println(value);
		}
		
	}
	
	
}
