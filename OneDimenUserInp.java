import java.util.*;
class OneDimenUserInp
{
	public static void main(String[] args)
	 {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the Size of Arary : ");
	    int size=sc.nextInt();
	    System.out.println("Enter the Elements of Array : ");

	    int []arr=new int[size];

	    for(int i=0;i<size;i++)
	    {
	    	arr[i]=sc.nextInt();
	    }	
	    System.out.println(Arrays.toString(arr));
	}
}