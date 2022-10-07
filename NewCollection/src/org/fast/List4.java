package org.fast;

//You are using Java
import java.util.*;
import java.lang.*;
import java.io.*;


class Q03Easy_Collections1
{
	static class Card {

		// Fill your code
		private char symbol;
		private int number;

		public char getSymbol() {
			return symbol;
		}

		public void setSymbol(char symbol) {
			this.symbol = symbol;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public Card(char symbol,int number) {
			this.symbol=symbol;
			this.number=number;
		}
	}

	static class CardComp implements Comparator<Card>{

		@Override
		public int compare(Card e1, Card e2) {
			if(e1.getSymbol()>e2.getSymbol())
				return 1;
			else if(e1.getSymbol()<e2.getSymbol())
				return -1;
			else
				return 0;
		}
	}   

	public static void main (String[] args) throws java.lang.Exception
	{
		// Fill your code
		Scanner sc = new Scanner (System.in);
		TreeSet<Card> ts = new TreeSet<Card>(new CardComp());
		int n=5;
		while(n>0) {
			char symbol = sc.next().charAt(0);
			int number = sc.nextInt();
			ts.add(new Card(symbol, number));
			n--;
		}
		sc.close();
		System.out.println("Four symbols gathered in 5 cards");
		System.out.println("Cards in Set are: ");
		for (Card card : ts) {
			System.out.println(card.getSymbol()+" "+card.getNumber());
		}
		

	}
}
