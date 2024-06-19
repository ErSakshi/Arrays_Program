import java.util.*;
class ZigZagArray
{
	public static void main(String[] args) 
	{
	  int []b={1,2,3,4,5};
	  int []a={6,7,8,9};
	  int max=((a.length)>(b.length))?a.length:b.length;
      System.out.println(max);
	  int []c=new int[(a.length)+(b.length)];

	  int indx=0;
	  for(int i=0;i<max;i++) //
	  {
	  	c[indx++]=b[i];
	  	if(i<a.length)
	  		c[indx++]=a[i];
	  	    
	  }	
	  System.out.println(Arrays.toString(c));
	}
}