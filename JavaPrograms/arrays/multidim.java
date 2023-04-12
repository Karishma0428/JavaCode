package arrays;
import java.util.Scanner;
public class multidim {
	public static void main(String args[])
	{
		//first bracket mention [ROW] and second [COL]
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[3][3];//row must be fixed or mention but col dont want to mention ,its our wish
       
     //   System.out.print(arr.length);
        for(int row=0;row<arr.length;row++)
        {
        	for(int col=0; col< arr[row].length;col++)
        	{
             arr[row][col]=sc.nextInt();
             
        	}
        }
        for(int row=0;row<arr.length;row++)
        {
        	for(int col=0; col< arr[row].length;col++)
        	{
             System.out.print(arr[row][col]+" ");
             
        	}
        	System.out.println();
        }
	
		
	}

}
