package ddfsdf;

import java.util.Scanner;

public class Statue {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		String b = sc.next();
		sc.close();
		if(a!=b.length()) {
			System.exit(0);
		}
		int[] st = new int [b.length()];
		for (int i = 0; i < b.length(); i++) {
			st[i]=(int)b.charAt(i);
		}
		String c= new String();
		for (int i = 0; i < st.length-1; i++) {
			
			if(st[i]>=65 && st[i]<=90) {
				if(st[i]==st[i+1]-1) {
					c=c+((char)st[i]);
				}
				else {
					c=c+((char)st[i]);
					System.out.println(c);
					break;
				}
			}
		}
		String c1 = new String();
		for (int i = st.length-1; i>0 ; i--) {
			if(st[i]>=65 && st[i]<=90) {
				if(st[i]==st[i-1]+1) {
					c1=c1+((char)st[i]);
				}
				else {
					c1=c1+((char)st[i]);
					System.out.println(c1);
					break;
				}
			}
		}
		String c2= new String();
		for (int i = 0; i < st.length-1; i++) {	
			if(st[i]>=97 && st[i]<=122) {
				if(st[i]==st[i+1]-1) {
					c2=c2+((char)st[i]);
				}
				else {
					c2=c2+((char)st[i]);
					System.out.println(c2);
					break;
				}
			}
		}
		String c3= new String();
		for (int i = st.length-1; i > 0; i--) {	
			if(st[i]>=97 &&st[i]<=122) {
				if(st[i]==st[i-1]+1) {
					c3=c3+((char)st[i]);
				}
				else {
					c3=c3+((char)st[i]);
					System.out.println(c3);
					break;
				}
			}
		}
	}
}
