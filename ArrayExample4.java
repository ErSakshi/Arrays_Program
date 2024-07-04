import java.util.*;
class ArrayExample4
{
	public static void main(String[] args) 
	{
		 int []arr=new int[30];
		 for(int i=10,j=0;i<=30;i+=10,j++)
		 	arr[j]=i;
		 System.out.println(Arrays.toString(arr));
	}
}