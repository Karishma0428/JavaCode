package com.SimpleProgram;
import java.util.Scanner;
public class calculator {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int ans=0;
		while(true)
		{
			System.out.print("enter the operator:");
			char op=sc.next().trim().charAt(0);
			if(op=='+'|| op=='-'|| op=='*'|| op=='%'|| op=='/')
			{
				System.out.print("enter the two value:");
				int num1=sc.nextInt();
				int num2=sc.nextInt();
				
				if(op=='+')
				{
					ans=num1+num2;
				}
				
				if(op=='-')
				{
					ans=num1-num2;
				}
				if(op=='*')
				{
					ans=num1*num2;
				}
				if(op=='%')
				{
					ans=num1%num2;
				}
				if(op=='/')
				{
					ans=num1/num2;
				}
		
		}
			else if(op=='X'||op=='x')
			{   
				break;
				
			}
			else
			{
				System.out.println("invalid operation");
					
		}
			System.out.println(ans);		
 	}

}
}