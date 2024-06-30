import java.util.Arrays;
class ZigZagArrayMerging
{
	public static void main(String[] args)
	 {
	    int []a={1,2,3};
	    int[]b={4,5,6,7,8};

	    //creating new array using both array length
	    int[]c=new int[(a.length)+(b.length)];

   //creating a loop which will iterate till largest arrays length
	    for(int i=0,j=0;i<b.length;i++)
	    {
	    	//check index is less than i or else AIOOBE
	    	 if(i<a.length)
	    	 {
	    	 	
	    	 	c[j++]=a[i];
	    	 	//storing length directly from bigger length array
	    	 	c[j++]=b[i];
	    	 }
	    }
	    System.out.println(Arrays.toString(c));	
	}
}