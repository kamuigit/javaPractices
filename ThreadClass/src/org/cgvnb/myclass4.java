package org.cgvnb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Stall{
	private String name;
	private String detail;
	private String type;
	private String ownerName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Stall(String name, String detail,String type,String ownerName) {
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.ownerName = ownerName;	
	}

}
public class myclass4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		ArrayList<Stall> st = new ArrayList<Stall>();
		while(a>0){
			st.add(new Stall(sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine()));
			a--;
		}

		Iterator it = st.iterator();
		while(it.hasNext()){
			Stall s = (Stall) it.next();
			System.out.println(s.getName()+" "+s.getDetail()+" "+s.getType()+" "+s.getOwnerName());
		}

	}
}


