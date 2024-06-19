import java.util.Scanner;
import java.util.Arrays;
class SumOfEvenArray
{
	public static void main(String[] args)
	 {
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter the Size : ");
	   int size=sc.nextInt();

       int sum=0;
	   System.out.println("Enter the Elements : ");

	   int[]arr=new int[size];

	   for(int i=0;i<size;i++)
	   {
         arr[i]=sc.nextInt();
     
      }
     System.out.println(Arrays.toString(arr));

        for(int j=0;j<size;j++)
	   {
          sum=sum+arr[j++];
	   	
	   }
	   System.out.println("Sum of Even Number  : "+sum);
	}
}