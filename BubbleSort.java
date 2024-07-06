import java.util.Arrays;
class BubbleSort
{
	public static void main(String[] args) 
	{
	   int []a={2,1,4,6,3,8,9}; //arrange in decending order

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
	}
}
