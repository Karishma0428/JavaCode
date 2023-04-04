package com.methods;

public class Overloading
{
 public static void main(String args[])
 {
	 //same method name with different data types is called method overloading
	 fun(28);
	 String name="karishmaQueen";
	 fun(name);
	// fun("karish");
	 int ans=sum(20,40);
	 System.out.println(ans);
	 
	 int ans1=sum(1,2,3);
    System.out.println(ans1);	 
 }
 
 static void fun(int a) {
	 System.out.println("First One");
	 System.out.println(a);
 }
 static void fun(String name)
 {
	 System.out.println(name);
 }
 static int sum(int a, int b)
 {
	return a+b;
 }
 static  int sum(int a, int b,int c)
 {
	 return a+b+c;
 }
}
