//write a java program to fetch all the factors in an array
//write a java program to find the factors of number and store all this factors in an array
import java.util.Scanner;
class ArrayFactors
{
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number ");
	  int num=sc.nextInt();
	  int []arr=new int[];

	  for(int i=1;i<=num;i++)
	  {
	  	if(num%i==0)
	  	{
	  		arr[]=i;
	  	}
	  }
	  System.out.println(arr[]);	
	}
}