package ddfsdf;

//You are using Java
import java.util.Scanner;
interface Case{
	// Type your code
	public String move(String str);
}
class chum implements Case { 

	public String move(String str) 
	{
		String str1 = new String();
		String str2 = new String();
		for (int i = 0; i < str.length(); i++) {
			int a =(int)str.charAt(i);
			if(a>=65 && a<=90) {
				str1=str1+str.charAt(i);
			}
			else if(a>=97 && a<=122) {
				str2=str2+str.charAt(i);
			}
		}
		str = str2 +str1;
		return str; 
		// Type your code
	} 

	public static void main(String args[]) 
	{ 
		// Type your code
		Scanner sc = new Scanner(System.in);
		chum c = new chum();
		String str = c.move(sc.nextLine());
		sc.close();
		System.out.println(str);
	} 
} 
