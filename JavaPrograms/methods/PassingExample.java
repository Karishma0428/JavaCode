package com.methods;

public class PassingExample 
{
	public static void main(String args[])
	{
	
		
		String name="karish";
		greet(name); //greet method was calling ,here i was pass value
	
	String name1="Sanju";
	changename1(name1);
	System.out.println(name1);
	}

	static void  greet(String naam) //pass by value ,not by reffrences 
	{
		//naam="karishma"; 
		System.out.println(naam);
	}
	static void changename1(String NAA)
	{
	   NAA="KASAN";// ans will display sanju ,bcoz NAA does not the name it creating new object
	  // System.out.println(NAA);
	}

}
