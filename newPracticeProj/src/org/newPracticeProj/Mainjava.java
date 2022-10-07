package org.newPracticeProj;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Mainjava {
	public static void main(String[] args) throws ParseException {
		
		Arrays.stream(new int[] {1,5,3,4})
		.map(x-> x*x*x)
		.forEach(System.out::println);
		
		ArrayList<String> as = new ArrayList<>();
		System.out.println(as.getClass());
		
		Scanner sc = new Scanner(System.in);
		String dat = sc.nextLine();
		
		SimpleDateFormat ds = new SimpleDateFormat("dd/MM/yyyy");
		Date dates = ds.parse(dat);
		
		int b = dates.getMonth()+1;
		System.out.println(b);
		
		Calendar c1 = new GregorianCalendar();
		c1.setTime(dates);
		
		int a = c1.get(c1.MONTH)+1;
		System.out.println(a);
		
		 
	}
}
