import java.util.*;
class RotationArray
{
	public static void main(String[] args)
	 {
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter the input : ");
	   int inpt=sc.nextInt();

	    int []arr={4,2,1,3,5};

       
	    for(int i=1;i<=inpt;i++)
	    {
	    	 int temp=arr[0];
           for(int j=1;j<arr.length;j++)
           {
           	  arr[j-1]=arr[j];
           	  
           }
           arr[arr.length-1]=temp;
	    }
	    System.out.println(Arrays.toString(arr));	
	}
}