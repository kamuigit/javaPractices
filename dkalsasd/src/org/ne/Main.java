package org.ne;

//You are using Java
import java.util.Scanner;
interface Rotate{
	// Fill your code
	void leftRotate(int arr[],int d,int n);//d=1
	void leftRotatebyOne(int arr[],int n);
	void printArray(int arr[],int n);
} 
class Main implements Rotate { 
	public void leftRotate(int arr[], int d, int n) 
	{ 
		// Fill your code
		while(d>0) {
			leftRotatebyOne(arr, n);
			d--;
		}
	} 

	public void leftRotatebyOne(int arr[], int n) 
	{ 
		// Fill your code
		int c = arr[0];
		for(int i =0 ; i<n-1 ; i++){
			arr[i] = arr[i+1];
		}
		arr[n-1] = c;
	} 

	/* utility function to print an array */
	public void printArray(int arr[], int n) 
	{ 
		// Fill your code
		for(int i =0; i< n;i++){
			System.out.print(arr[i]+" ");
		}
	} 

	public static void main(String[] args) 
	{ 
		// Fill your code
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int arr[]= new int [n];
		for(int i =0;i<arr.length;i++){
			arr[i]=Integer.parseInt(sc.nextLine());
		}
		sc.close();
		int d =1;
		Main m = new Main();
		m.leftRotatebyOne(arr, n);
		m.leftRotate(arr, d, n);
		m.printArray(arr, n);
	} 
} 
