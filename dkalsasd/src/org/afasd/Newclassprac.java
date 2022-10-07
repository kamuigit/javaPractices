package org.afasd;


import java.util.ArrayList;
import java.util.Scanner;


public class Newclassprac {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int i=0;i<a;i++){
        list.add(sc.nextInt());
    }
    sc.close();
    list.stream().filter(n -> n%2==0).forEach(n->System.out.print(n +" "));
}
}
