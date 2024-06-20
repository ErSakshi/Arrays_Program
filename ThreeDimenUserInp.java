import java.util.*;
class ThreeDimenUserInp
{
	public static void main(String[] args)
	 {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the Size of an Array : ");
	   int size=sc.nextInt();

	   System.out.println("Enter the Number of Rows : ");
	   int rows=sc.nextInt();

	   System.out.println("Enter the Number of Columns : ");
	   int cols=sc.nextInt();

	   System.out.println("Enter the Number of Diagonal : ");
	   int diagonal=sc.nextInt();
	   
	   System.out.println("Enter the Elements : ");

	   int [][][]arr=new int[rows][cols][diagonal];

	   for(int i=0;i<rows;i++)
	   {
	   	for(int j=0;j<cols;j++)
	   	{
	   		for(int k=0;k<diagonal;k++)
	   		{
	   			arr[i][j][k]=sc.nextInt();
	   		}
	   	}
	   }
	   System.out.println(Arrays.deepToString(arr));

	}
}