import java.util.*;
class  SecondLargestNum
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
	  		if(arr[i]!=arr[0])
	  		{
             temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
	  		}
	  	}
	  	System.out.println(arr[i]);
	  }
	  
	
	}
}