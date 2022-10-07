package dsdsfsdffdfs;

//You are using Java
import java.util.Scanner;
interface Total{
 // Type your code
 public void main(int[] arr);
}
class Coin implements Total
{ 
 // Type your code here
 public void main(int[] arr){
     int i, odd = 0, even = 0;
     int n = arr.length;
     for(i=0; i<n; i += 2)
     {
         even += arr[i];
     }
     for(i=1; i<n; i+=2)
     {
         odd += arr[i];
     }
     if(odd>=even)
     {
         for(i=1; i<n; i+=2)
         {
             System.out.print(arr[i]+" ");
         }
         
     }
     else{
         for(i=0; i<n; i+=2)
         {
             System.out.print(arr[i]+" ");
         }
     }
     
 }
 
}
class MaxSum extends Coin implements Total{
public static void main(String[] args) 
{ 
// Type your code here
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int[] arr = new int[a];
Coin c = new Coin();
if(a%2==0){
    for(int i=0;i<a;i++){
        arr[i]=sc.nextInt();
    }
    c.main(arr);
}
else{
    System.out.println("Enter valid number");
    System.exit(0);
}
} 
}