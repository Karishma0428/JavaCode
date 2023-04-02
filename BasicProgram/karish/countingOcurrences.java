package com.karish;
import java.util.Scanner;
public class countingOcurrences {
 public static void main(String args[])
 {
	// Scanner sc=new Scanner(System.in);
	 //System.out.println("Enter The value ");
	 //int n=sc.nextInt();
	 //System.out.println("enter the count value: ");
	 //int c=sc.nextInt();
	 int n=234353;
	 int count=0;
	 while(n>0)
	 {
		 int rem=n%10;
		 if(rem==3)
		 {
			 count++;
		 }
		
			 n=n/10;
	 }
 
     System.out.println(count);
 }
 
}
