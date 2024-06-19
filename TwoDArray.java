import java.util.*;
class TwoDArray
{
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row of Array :");
		int rows=sc.nextInt();
		System.out.println("Enter the cols Elements :");
		int cols=sc.nextInt();

		System.out.println("Enter the Elements of Array :");
        int [][]arr=new int[rows][cols];

		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
			arr[i][j]=sc.nextInt();
		   }
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	  	

	}
}