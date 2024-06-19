//1.write a java program to fetch all the factors in an array
//2.write a java program to find the factors of number and store all this factors in an 
//3.Find sum of all elements at even indexes 
//4.WAJP to find sum of all arrays indices
//5.WAJP to store first 10 prime numbers in the new array
//6.WAJP to store the fibnocci series of any terms in an array





import java.util.Scanner;
import java.util.Arrays;
class ArrayFactors
{
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number ");
	  int num=sc.nextInt();
	  int count=0;
	  
	  for(int j=1;j<=num;j++)
	  {
        if(num%j==0)
        {
           count++;
        }
	  }

	  int[]factorArray =new int[count];
	  int temp=0;

	  for(int i=1;i<=num;i++)
	  {
	  	if(num%i==0)
	  	{
	  		factorArray[temp++]=i;
	  	}
	  }
	  System.out.println(Arrays.toString(factorArray));
	}

}