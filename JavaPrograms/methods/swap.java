package com.methods;

public class swap {
	public static void main(String args[])
	{
	   method();
	   
	   int c=method1(30,50);
	   System.out.println(c);
		
	   int a=methods();
		System.out.println(a);

	   int A=10;
	   int B=20;
	   swap(A,B);
	  // System.out.println(A+" "+B);
	   
	   
	   
	
	
	}
	static int methods() //here we use int return type which is return the value 
	{
	   	int a=10;
	   	int b=20;
	   	int c=a+b;
	   	return c;
	}

   static void method()
   
   {
	int a,b,c;
	a=10;
	b=10;
	c=a+b;
	System.out.println(c);
	   	   
   }

   static int method1(int a,int b)
   {
	int c=a+b;
	return c;
   }
  static void swap(int a, int b)
  {
	int temp=a;
	a=b;
	b=temp;
	//System.out.println(a+""+b);
	//System.out.println(a+" "+b); this will only be valid in this function scope only if you print through main function it doesnt swap
  }

}
