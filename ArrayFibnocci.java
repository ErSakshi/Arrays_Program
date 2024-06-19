import java.util.*;
class ArrayFibnocci
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the term : ");
		int term=sc.nextInt();

	   int []arr=new int[term];
	  int num1=0;
	  int num2=1;

	  System.out.print(num1+" "+num2+" ");

	  for(int i=0;i<term;i++)
	  {
	  	int op=num1+num2;
	  	//System.out.print(op+" ");
	  	//System.out.println();
	  	num1=num2;
	  	num2=op;
	  	 
	  	arr[i]=op;
       
       }
       System.out.print(num1+num2);
       System.out.println(Arrays.toString(arr));	
	}
}