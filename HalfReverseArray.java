import java.util.Arrays;
class HalfReverseArray
{
	public static void main(String[] args) 
	{
	   int []arr={1,2,3,4,5,6,7,8};
	   int []narr=new int[arr.length];

       int indx=0;
       
       
	   for(int i=(arr.length/2)-1;i>=0;i--)
	   {
	   	 narr[indx++]=arr[i];
	   	
	   }
	    for(int i=arr.length-1;i>=(arr.length/2);i--)
	   {
	   	 narr[indx++]=arr[i];
	   	
	   }

	
	   System.out.println(Arrays.toString(narr));

	  
	}
}