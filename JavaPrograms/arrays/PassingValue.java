package arrays;
import java.util.Arrays;
import java.util.List;
public class PassingValue {
public static void main(String args[])
{
	int[] num= {2,2,3,4,5};
	System.out.println(num);
	change(num);
	System.out.println(Arrays.toString(num));
}

static void change(int[] arr)
{
	arr[0]=1;
	
}
}
