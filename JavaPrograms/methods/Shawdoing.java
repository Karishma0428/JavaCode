package com.methods;

public class Shawdoing {
	static int x=30;
	public static void main(String args[])
	{
		System.out.println(x); //30
		int x;
        x=50;
		System.out.println(x); //50
		fun();
	}
	 static void fun() {
		// TODO Auto-generated method stub
		System.out .println(x);  //30
	}

}
