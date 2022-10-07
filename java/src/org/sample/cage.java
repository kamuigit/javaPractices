package org.sample;

import java.text. *;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class cage {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner (System.in);
		String dateString = sc.nextLine();
		DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		Date startDate = f.parse(dateString);

		dateString = sc.nextLine();
		Date endDate = f.parse(dateString);

		Calendar c1 = new GregorianCalendar();
		c1.setTime(startDate);
		Calendar c2 = new GregorianCalendar();
		c2.setTime(endDate);
		int ans = (c2.get(c2.YEAR) - c1.get(c1.YEAR));
		
		System.out.println(ans);

	}
}
