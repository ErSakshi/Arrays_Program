//write a java program to find the count of number in array
import java.util.*;
class ArrayNumCount
{
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the Size :");
	  int size=sc.nextInt();

	  System.out.println("Enter the Elements :");

	  int []arr=new int[size];

	  for(int i=0;i<size;i++)
	  {
	  	arr[i]=sc.nextInt();
	  }	
	  System.out.println("Enter the number : ");
	  int num=sc.nextInt();

	  int count=0;
	  for(int i=0;i<size;i++)
	  {
        if(arr[i]==num)
        	count++;
	  }
	  System.out.println("Count : "+count);
	  
	}
}