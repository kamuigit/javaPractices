package dsdsfsdffdfs;

//You are using Java
import java.util.*;
import java.io.*;

class Newnewclass {
 public static void printGrouped(char[] str)
 {
  // Fill your code 
 }
 
 public static void main(String args[] ) throws Exception {
   // Fill your code
   Scanner sc=new Scanner(System.in);
   String s=sc.nextLine();
   String d="";
   for (int i=0;i<s.length();i++){
       int flag=0;
       for (int j=0;j<i;j++){
           String current=Character.toString(s.charAt(i));
           if (d.contains(current)){
               flag=1;
               break;
           }
       }
       if (flag==0){
           d=d+s.charAt(i);
       }
   }
   String Grouped="";
   for (int i=0;i<d.length();i++){
       int count=0;
       for (char ch : s.toCharArray()){
           if (ch==d.charAt(i)){
               count++;
           }
       }
       for (int j=0;j<count;j++){
           Grouped +=d.charAt(i);
       }
   }
   System.out.println(Grouped);
 }
}
