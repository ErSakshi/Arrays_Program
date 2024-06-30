//Reverse array  
import java.util.Arrays;

class Swapping
{
	public static void main(String[] args) 
	{
	   int []a={4,5,3,6,2};  //[2,5,3,6,4]

        int temp=0;
	   for(int i=0,j=a.length-1;i<a.length/2;i++,j--)
	   {
	   	   
	   	   temp=a[i];
	   	   a[i]=a[j];
	   	   a[j]=temp;
	   	  	   	   
	   }
	   System.out.println(Arrays.toString(a));
	  
	}
}