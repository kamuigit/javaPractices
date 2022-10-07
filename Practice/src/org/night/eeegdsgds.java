package org.night;
import java.io.*;
import java.util.*;
class eeegdsgds {
	public static void main(String [] args) {
	    Scanner sc = new Scanner(System.in);
	    int num=0;
	    int n = sc.nextInt();
	    int k = sc.nextInt();
	    int [] arr = new int [n];
	    for(int i=0;i<arr.length;i++){
	        arr[i]= sc.nextInt();
	        num=num+(arr[i]/k);
	    }
	    System.out.println(num);
	    //Type your code here..
	}
}