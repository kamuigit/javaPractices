package dsdsfsdffdfs;

//You are using Java
import java.io.*;
import java.util.*;
class Kingdom {

};
class Jade
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    ArrayList<String> chola = new ArrayList<String>();
	    ArrayList<String> chera = new ArrayList<String>();
	    ArrayList<String> pallava = new ArrayList<String>();
	    ArrayList<String> pandya = new ArrayList<String>();
	    ArrayList<String> renou = new ArrayList<String>();
	    int x,y;
	    String name;
	    int n = sc.nextInt();
	    if(n<1000){
	    for(int i=0; i<n;i++){
	        name = sc.next();
	        x=sc.nextInt();
	        y=sc.nextInt();
	        
	        if(x>0 && y>0){
	            chola.add(name);
	        }
	        else if(x<0 && y<0){
	            pallava.add(name);
	        }
	        else if(x>0 &&y<0){
	            pandya.add(name);
	        }
	        else if (x<0 &&y>0){
	            chera.add(name);
	        }
	        else if(x==0 && y==0){
	            renou.add(name);
	        }
	    }
	    System.out.println("chola");
	    System.out.println(chola);
	    System.out.println("chera");
	    System.out.println(chera);
	    System.out.println("pallava");
	    System.out.println(pallava);
	    System.out.println("pandya");
	    System.out.println(pandya);
	    System.out.println("renounce");
	    System.out.println(renou);
	    
	}
}
}