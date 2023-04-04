package com.methods;
import java.util.Scanner;
public class StringExample 
{
	public static void main(String args[])
	{
	String name=greet();
	System.out.println(name);
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name1=sc.next();
		String Name =mygreet();
		System.out.println(name1);
	}
      
	    static String mygreet() 
	    {
		    String naam= "hello";
            return naam ;
	    }

	static String greet()
	   {
		 String name="karishma";
		return name; 
		   
	   }
	   

}