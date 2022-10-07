package ddfsdf;

//You are using Java
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
interface Airfare {
	// Type your code here
	public double calculateAmount();
}
class AirIndia implements Airfare {
	private int hours;
	private double costPerHour;

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getCostPerHour() {
		return costPerHour;
	}

	public void setCostPerHour(double costPerHour) {
		this.costPerHour = costPerHour;
	}

	@Override
	public double calculateAmount() {
		costPerHour =costPerHour*hours;
		return costPerHour;
	}

}
class KingFisher implements Airfare {

	private int hours;
	private double costPerHour;

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getCostPerHour() {
		return costPerHour;
	}

	public void setCostPerHour(double costPerHour) {
		this.costPerHour = costPerHour;
	}

	@Override
	public double calculateAmount() {
		costPerHour =costPerHour*hours;
		return (costPerHour*4);
	}
	// Type your code here
}
class Indigo implements Airfare {
	private int hours;
	private double costPerHour;

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getCostPerHour() {
		return costPerHour;
	}

	public void setCostPerHour(double costPerHour) {
		this.costPerHour = costPerHour;
	}

	@Override
	public double calculateAmount() {
		costPerHour =costPerHour*hours;
		return (costPerHour*8);
	}
	// Type your code here
}
class chumma {
	public static void main(String [] args) {
		// Type your code here
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		AirIndia ai = new AirIndia();
		KingFisher kf = new KingFisher();
		Indigo in = new Indigo();
		double amt ;
		DecimalFormat df = new DecimalFormat("0.00");
		if(a==1) {
			ai.setHours(sc.nextInt());
			ai.setCostPerHour(sc.nextDouble());
			amt =ai.calculateAmount();
			System.out.println(df.format(amt));
		}
		else if(a==2){
			kf.setHours(sc.nextInt());
			kf.setCostPerHour(sc.nextDouble());
			amt=kf.calculateAmount();
			System.out.println(df.format(amt));
		}
		else if(a==3){
			in.setHours(sc.nextInt());
			in.setCostPerHour(sc.nextDouble());
			amt =in.calculateAmount();
			System.out.println(df.format(amt));
		}
		else {
			System.out.println("Invalid Entry");
		}
	}
}

