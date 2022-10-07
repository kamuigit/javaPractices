package ddfsdf;


//You are using Java
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class Jade
{
 public static void main(String[] args) 
 {
     // Fill your code
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     String[] str = new String [a];
     for(int i=0;i<str.length;i++){
         str[i]=sc.next();
     }
     int l1,l2;
     String str2;
     for(int i=0;i<str.length;i++){
         for(int j=0;j<str.length;j++){
             l1=str[i].length();
             l2=str[j].length();
             if(l1<l2){
                 str2=str[i];
                 str[i]=str[j];
                 str[j]=str2;
             }
         }
     }
     
     for(int i=0;i<str.length;i++){
         System.out.print(str[i]+" ");
     }
 }
}