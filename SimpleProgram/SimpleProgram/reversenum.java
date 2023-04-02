package com.SimpleProgram;

public class reversenum {
	public static void main(String args[])
	{
		int n=456789;
		int ans=0;
		while(n>0)
		{
		 int rem=n%10; //we get the rem value
		 n=n/10; // we get the quotient value
		 ans=ans*10+rem; //initially we multiple by 0*10+9=9 then 9*10+8=98 its go on
		}
	System.out.println(ans);
	}

}
