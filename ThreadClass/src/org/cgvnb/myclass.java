package org.cgvnb;

import java.text. *;
import java.util. *;
public class myclass {
	public static void main(String[] args) throws ParseException {
		Scanner sc= new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] c = new String[n];
		String[] st = new String[n];
		int[] k = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextLine();
			st[i] = sc.nextLine();
			Date date = null;
			String format ="dd/MM/yyyy";
			try {
				SimpleDateFormat sdf = new SimpleDateFormat(format);
				date = sdf.parse(st[i]);
				if(!st[i].equals(sdf.format(date))){
					date=null;
				}
			}
			catch(ParseException ex) {
				System.out.println("Invalid date format");
				System.exit(0);
			}
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			Date joindate = sdf.parse("01/01/2009");
			Calendar c1 = new GregorianCalendar();
			c1.setTime(date);
			Calendar c2 = new GregorianCalendar();
			c2.setTime(joindate);

			int diff=0;
			diff = c2.get(c2.YEAR) - c1.get(c2.YEAR);
			k[i] = diff;
		}
		int w=0;
		for (int i = 0; i < n; i++) {
			if(k[i]>=5) {
				w++;
			}
		}
		if(w==0) {
			System.out.println("No one is eligible.");
			System.exit(0);
		}
		for (int i = 0; i < n; i++) {
			if(k[i]>=5) {
				System.out.println(c[i]);
			}
		}
	}
}
