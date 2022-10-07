package dsdsfsdffdfs;

import java.util.ArrayList;
import java.util.Collections;
//You are using Java
import java.util.Scanner;

interface Growing{
	// Type your code here
	abstract void isGrowing();
}

class GrowingNumber implements Growing{

	
	int i;
	int k =0;
	public GrowingNumber(int i) {
		// Type your code
		this.i=i;
		String c =Integer.toString(i);
		int[] num =new int[c.length()];
		for (int j = 0; j < num.length; j++) {
			num[j]=c.charAt(j)-'0';
			System.out.println(num[j]);
			if(num[j] % num[0] == 0)
				k=k+1;
		}
	}

	@Override
	public void isGrowing(){
		String c =Integer.toString(i);
		if(k == c.length()) {
			System.out.println("Growing number");
		}
		else {
			System.out.println("Not growing number");
		}
		// Type your code here
	}
}

class GrowingString implements Growing{

	String string;
	ArrayList<Character> ch = new ArrayList<Character>();

	public GrowingString(String string) {
		// Type your code
		this.string = string;
		for (int i = 0; i < string.length(); i++) {
			ch.add(string.charAt(i));
		}
		Collections.sort(ch);
	}

	@Override
	public void	isGrowing(){
		for (int i = 0; i < string.length(); i++) {
			if(ch.get(i)!=string.charAt(i)) {
				System.out.println("Not growing string");
				System.exit(0);
			}
		}
		System.out.println("Growing string");
		// Type your code
	}  
}


class Statue{
	public static void main(String args[]) {
		// Type your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str =sc.nextLine();
		str.toUpperCase();
		sc.close();
		GrowingNumber gn = new GrowingNumber(n);
		GrowingString gs = new GrowingString(str);
		gn.isGrowing();
		gs.isGrowing();

	}
}
