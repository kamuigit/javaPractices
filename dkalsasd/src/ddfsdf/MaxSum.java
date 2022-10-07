package ddfsdf;

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
		int sum=0,diff=0;
		for(int i =0;i<arr.length;i++){
			if(i%2==0){
				sum=sum+arr[i];
			}
			else{
				diff=diff+arr[i]; 
			}
		}
		System.out.println(sum+" "+diff);
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
