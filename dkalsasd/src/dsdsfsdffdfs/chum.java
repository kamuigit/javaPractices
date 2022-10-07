package dsdsfsdffdfs;

//You are using Java
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


abstract class Account{

	// Fill your code
	String name;
	int number;
	int balance;
	Date StartDate;

	public Account(String name ,int number,int balance, Date startDate){
		super();
		this.name=name;
		this.number=number;
		this.balance=balance;
		this.StartDate=startDate;
	}
	abstract double calculateInterest(Date endDate);
}

class CurrentAccount extends Account{


	public CurrentAccount(String name, int number, int balance, Date startDate) {
		super(name, number, balance, startDate);

	}
	
	 @Override
	public double calculateInterest(Date endDate) {
		// Fill your code double interest;
		double interest;
	     interest = balance*5*(monthsDifference(StartDate, endDate)/12)/100;
	     return interest;

	}

	public int monthsDifference(Date startDate, Date endDate) {
		// Fill your code
		Calendar c1 = new GregorianCalendar();
		c1.setTime(startDate);
		Calendar c2 = new GregorianCalendar();
		c2.setTime(endDate);
		int ans = (c2.get(c2.YEAR) - c1.get(c1.YEAR))*12;
		ans += (c2.get(c2.MONTH)-c1.get(c1.MONTH));
		return ans;
	}
}

class SavingsAccount extends Account{


	public SavingsAccount(String name, int number, int balance, Date startDate) {
		super(name, number, balance, startDate);

	}
	
	 @Override
	public double calculateInterest(Date endDate) {
		// Fill your code
		double interest;
		interest = balance*12*(monthsDifference(StartDate, endDate)/12)/100;
	     return interest;

	}

	public int monthsDifference(Date startDate, Date endDate) {
		// Fill your code
		Calendar c1 = new GregorianCalendar();
		c1.setTime(startDate);
		Calendar c2 = new GregorianCalendar();
		c2.setTime(endDate);
		int ans = (c2.get(c2.YEAR) - c1.get(c1.YEAR))*12;
		ans += (c2.get(c2.MONTH)-c1.get(c1.MONTH));
		return ans;
	}

}

class chum{
	public static void main(String args[]) throws ParseException {
		// Fill your code	 	
		Scanner sc = new Scanner (System.in);
		int type = Integer.parseInt(sc.nextLine());
		String name = sc.nextLine();
		int number = Integer.parseInt(sc.nextLine());
		int balance =Integer.parseInt(sc.nextLine());
		String dateString = sc.nextLine();

		 DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		 Date startDate = f.parse(dateString);
		 
		 dateString = sc.nextLine();
		 Date endDate = f.parse(dateString);

		 sc.close();
		 
		 if(type==1){
		     SavingsAccount sObj = new SavingsAccount(name,number,balance,startDate);
		     System.out.println(sObj.calculateInterest(endDate));
		 }
		 else if(type==2){
		     CurrentAccount cObj = new CurrentAccount(name,number,balance,startDate);
		     System.out.println(cObj.calculateInterest(endDate));
		 }
		 else {
		     System.out.println("Invalid Entry");
		 }
	}
}