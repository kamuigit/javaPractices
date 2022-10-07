package ddfsdf;

//You are using Java
import java.util.Scanner;
class Person{
	private String name;
	private String emailId;
	private String mobileNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return ("Name : "+name+"\n"+"Email : "+emailId+"\n"+"Mobile Number : "+mobileNumber);
	}

}
class chuma1{
	public static void main(String args[]) {

		// Type your code here..
		Scanner sc = new Scanner (System.in);
		Person p = new Person();
		p.setName(sc.nextLine());
		p.setEmailId(sc.nextLine());
		p.setMobileNumber(sc.nextLine());
		sc.close();
		System.out.println(p);


	}
}