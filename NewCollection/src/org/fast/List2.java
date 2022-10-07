package org.fast;

import java.io.*;
import java.util.*;

class Test<T, U>
{
	T obj1;
	U obj2;
	
	Test(T obj1, U obj2)
	{
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	public void print()
	{
		System.out.println(obj1);
		System.out.println(obj2);
	}
	
}

public class List2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = sc.nextInt();
		
		Test <String, Integer> t = new Test<String, Integer>(str, n);
		
		t.print();
		
	}

}
