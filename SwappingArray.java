import java.util.Arrays;
class SwappingArray
{
	public static void main(String[] args) 
	{
	   int []a={2,4,1,3};
	   System.out.println(Arrays.toString(a));

	   for(int i=0;i<a.length;i++)
	   {
	   	for(int j=0;j<a.length;j++)
	   	{
	   		if(a[i]>a[j])
	   		{	
	   		int temp=a[i];
	   		a[i]=a[j];
	   		a[j]=temp;
	   	}
	   	}
	   }
	   System.out.println(Arrays.toString(a));	

	   System.out.println();
	    for(int i=0;i<a.length;i++)
	   {
	   	for(int j=0;j<a.length;j++)
	   	{
	   		if(a[i]<a[j])
	   		{	
	   		int temp=a[i];
	   		a[i]=a[j];
	   		a[j]=temp;
	   	}
	   	}
	   }
	   System.out.println(Arrays.toString(a));
	}
}