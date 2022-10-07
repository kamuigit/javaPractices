package org.newpack;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Thread1 extends Thread{
	// Type your code here  
	String word;
	Thread1(String w){
		this.word = w;
	}
	@Override
	public void run(){
		char a[] = word.toCharArray();
		List<Character> un = new ArrayList<Character>();
		for(char i:a)
			if(!(un.contains(i)))
				un.add(i);
		for(char i:un){
			int c=0;
			for(char j:a){
				if(i==j)
					c++;
			}
			System.out.println(i+""+c);
		}
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++){
			Thread1 s = new Thread1(sc.nextLine());
			s.run();
			System.out.println();
		}
	}
}