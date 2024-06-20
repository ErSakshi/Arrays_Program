import java.util.*;
class TwoDimenUserInp
{
	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter the Size of Array : ");
	   int size=sc.nextInt();

	   System.out.println("Enter the number of Rows : ");
	   int rows =sc.nextInt();

	   System.out.println("Enter the number of Columns : ");
	   int cols=sc.nextInt();

	   System.out.println("Enter the Elements of Array : ");

	   int [][]arr=new int[rows][cols];	

	   for(int i=0;i<rows;i++)
	   {
	   	for(int j=0;j<cols;j++)
	   	{
	   		arr[i][j]=sc.nextInt();
	   	}

	   }
	   	System.out.println(Arrays.deepToString(arr));
	}
}