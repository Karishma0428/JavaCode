package com.SimpleProgram;
import java.util.Scanner;
public class loops {
	public static void main(String arg[])
	{
	
		/*
		 for(int i=1;i<=10;i++)
		 
		{
			System.out.println(i);
		}
        */
	/*
	 * while loop	
	Scanner input= new Scanner(System.in);
	int n= input.nextInt();
	while(n<=10)
	{
		System.out.println(n);
		n++;
	}
	*/
		Scanner input= new Scanner(System.in);
		System.out.print("enter the value : ");
		int n= input.nextInt();
		do {
			System.out.println("hello world");
		    n++;	
		}
		while(n<=15);
	}
	

}
