package org.paka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pracnew {
	public static void main(String[] args) {
		List<Integer> li = Stream.of(7,2,3,4,5).collect(Collectors.toList());
		
		li.add(12);
		li.add(13);
		li.add(14);
		li.add(15);
		
		System.out.println(li.stream());
		
		BiFunction<String,String, String> str = (a,b)->a+" "+b;
		String st1 = "sdas";
		String st2 = "asdasd";
		
		System.out.print(str.apply(st1, st2));
		
		System.out.println(Collections.frequency(li, 12));
		  
		
		int a[] = {1,2,2,1,2};
		
		li.stream().forEach(System.out::print);
		
		
		
		
		
	}
}
