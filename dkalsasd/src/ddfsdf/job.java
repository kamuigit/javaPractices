package ddfsdf;

import java.util.ArrayList;
import java.util.Scanner;

interface Product
{
	abstract void ProductDetails();
	abstract void show_Bill();
	// Fill your code

}
class Customer
{
	Scanner sc = new Scanner(System.in);
	int numOfcus = Integer.parseInt(sc.nextLine());
	int [] cusId = new int [numOfcus];
	String [] cusName = new String [numOfcus];
	int [] no_items = new int [numOfcus];
	ArrayList<String> prodname = new ArrayList<String>();
	ArrayList<Integer> cost  = new ArrayList<Integer>();
	void getdetails()
	{    

		for (int i = 0; i < numOfcus; i++) {
			cusId[i] =Integer.parseInt(sc.nextLine());
			cusName[i] = sc.nextLine();
			no_items [i]= Integer.parseInt(sc.nextLine());
			for (int j = 0; j < no_items[i]; j++) {
			prodname.add(sc.nextLine());
			cost.add(Integer.parseInt(sc.nextLine()));
			}
		}
		
		// Fill your code
		// to input details from customer
	}
	void showdetails(int i)
	{     
		System.out.println("ID:"+cusId[i]);
		System.out.println("NAME:"+cusName[i]);
		// Fill your code
		// to print details
	}

}

class OrderOnline extends Customer implements Product
{


	@Override
	public void ProductDetails()
	{
		super.getdetails();
		// Fill your code
		//no of items,name of the individual product,cost of individual prod ,cal totalbill

	}
	@Override
	public void show_Bill(){
		// Fill your code
		int prev=0;
		for (int i = 0; i < numOfcus; i++) {
			int price= 0;
			for (int j = 0; j < no_items[i]; j++) {
				int temp=i+j;
				if(temp==0 || prev<temp) {
				price = price + cost.get(temp);
				}
				else if(temp==prev) {
					temp=temp+1;
					price = price + cost.get(temp);
				}
				else if(prev>temp) {
					do{
					temp=temp+1;
					}while(temp>prev);
					price = price + cost.get(temp);
				}
				prev=temp;
			}
			if(price>10000 && price<=30000) {
				price = price +((price*5)/100);
			}
			else if(price>30000 && price<=50000) {
				price =price+((price*7)/100);
			}
			else if (price>50000) {
				price =price+((price*9)/100);
			}
			showdetails(i);
			System.out.println("Bill:" + price);
		}
		// total bill

	}
	public static void main(String []arg)
	{
		// Fill your code

		OrderOnline jo = new OrderOnline();
		jo.getdetails();
		jo.show_Bill();

	}
}
