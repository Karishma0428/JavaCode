package arrays;
import java.util.List;

import java.util.Scanner;
public class ArrayList {
	public static void main(String args[])
	{
		java.util.List<Integer> rollno = new java.util.ArrayList<Integer>(5);
		 Scanner sc=new Scanner(System.in);
		/* rollno.add(121);
		 rollno.add(152);
		 rollno.add(912);
		 rollno.add(112);
		 rollno.add(123);
		 rollno.add(121);
		 rollno.add(152);
		 rollno.add(912);
		 rollno.add(112);
		 rollno.add(123);
		 
		 rollno.set(0, 99999); // it set 0th index by 99999
		 rollno.remove(3);
		 
		 System.out.println(rollno.size()); // total length of the rollno 
		 System.out.println(rollno);  // print all given element
		 System.out.println(rollno.contains(121)); // print true or false*/
/*		 for(int i=0;i<3;i++)
		 {
			 rollno.add(sc.nextInt());
			 //System.out.println(rollno);
		 }
		 System.out.println(rollno);
	*/	 
		 
		 for(int i=0;i<=3;i++)
		 {
			 for(int j=0;j<=3;j++)
			 {
				 rollno.get(i);
				 rollno.add(sc.nextInt());
				
			 }
			 
		 }
	
		 
	}

}
