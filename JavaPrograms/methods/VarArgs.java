package com.methods;
import java.util.Arrays;
public class VarArgs {
	public static void main(String args[])
	{
		fun('k','a','r','i');
		multiplestring(6,4,"karish","nokia","aakash");
		demo(12,12,13,15);
	}

	static void fun(char...v)
	{
		System.out.println(Arrays.toString(v));	
		
	}

	static void multiplestring(int a,int b,String...v)
	{
		
		System.out.println(Arrays.toString(v));
	}

	static void demo(int ...v)
	 {
		 System.out.println(Arrays.toString(v));
	 }
	 static void demo(String...v)
	 {
		 System.out.println(Arrays.toString(v));
	 }
	 
}
