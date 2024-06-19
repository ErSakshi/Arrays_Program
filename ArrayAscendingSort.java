//write a java program to sort elements in ascending order
import java.util.*;
class ArrayAscendingSort
{
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the Size :");
	  int size=sc.nextInt();

	  System.out.println("Enter the Elements : ");

	  int []arr=new int[size];
	  for(int i=0;i<size;i++)
	  {
	  	arr[i]=sc.nextInt();
	  }	

      int temp=0;
	  for(int i=0;i<size;i++)
	  {
	  	for(int j=i+1;j<size;j++)
	  	{
	  		if(arr[i]>arr[j])
	  		{
             temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
	  		}
	  	}
	  }
	  System.out.println(Arrays.toString(arr));
	}
}

