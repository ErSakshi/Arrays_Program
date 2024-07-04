import java.util.*;
class AnticlockwiseRotation
{
	public static void main(String[] args) 
	{
       int []a={4,3,5,6,2,1};
       int rt=2;
       System.out.println(clockwise(rt));
	}
	public static void clockwise(int rt)
	{
       for(int i=1;i<=rt;i++)
	    {
	    	 int temp=a[a.length-1];
           for(int j=1;j<a.length;j++)
           {
           	  a[j-1]=a[j];
           	  
           }
           a[a.length-1]=temp;
	    }
	    System.out.println(Arrays.toString(a));
	}
	public static void anticlockwise(int rt)
	{
      for(int i=1;i<=rt;i++)
	    {
	    	 int temp=a[];
           for(int j=1;j<a.length;j++)
           {
           	  a[j+1]=a[j];
           	  
           }
           a[a.length-1]=temp;
	    }
	    System.out.println(Arrays.toString(a));
	}
}