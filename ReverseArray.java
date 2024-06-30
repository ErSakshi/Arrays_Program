//Reverse Printing Array
import java.util.Arrays;
class ReverseArray
{
	public static void main(String[] args) 
	{
	   int[]arr={1,2,4,5,6,7,8};   //[8,7,6,5,4,3,2,1]
	   System.out.println(Arrays.toString(arr));

	   for(int i=arr.length-1;i>=0;i--)
	   {
	   	System.out.print(arr[i]+" ");
	   }	
	}
}