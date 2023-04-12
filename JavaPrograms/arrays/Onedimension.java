package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Onedimension
{
 public static void main(String args[])
 {
	 // syntax 
	 //datatype[] variable_name=new Datatype[SIze];
	 // int[] rolno=new rolno[5];
	 
	 //datatype[] varible_name={elements}
	 // int[] rolno={1,2,3,4,5};
	 
         Scanner sc=new Scanner(System.in);
         //System.out.println("enter the elements:");
        // int n=sc.nextInt();
         
         int[]arr=new int[5];
         
      /*   for(int i=0;i<arr.length;i++) {
        	 
        	arr[i]=sc.nextInt();
           // System.out.print(Arrays.toString(arr));
         }
         System.out.print(Arrays.toString(arr));
        
         */
         
     /*    for(int i=0;i<arr.length;i++)
         {
        	arr[i]=sc.nextInt();
        	 System.out.println("  OUTPUT "+ arr[i]+" ");
         }
	 */
         for(int num:arr)
         {
        	 arr[num]=sc.nextInt();
        	 System.out.println(arr[num]);
         }
 }
}
