package dsdsfsdffdfs;

import java.util.Scanner;

public class Newclass {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int lineno =0;
		while (sc.hasNextLine()){
			if(sc.nextLine().equals("q")){
				break;
			}
			lineno++;
		}
		System.out.println(lineno);
	}
}


