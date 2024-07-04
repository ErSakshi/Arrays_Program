import java.util.Arrays;
class BinarySearch
{
	public static void main(String[] args) 
	{
	   int []a={5,4,6,3,7,2,8,1,9,10};
	   Arrays.sort(a);
	   int target=8;

	   int indx=binarySearch(a,target);
	   if(indx==-1)
	   {
	   	System.out.println("Element is not found");
	   }else {
	   	System.out.println("Element found at index : "+indx);
	   }

	}
	private static int binarySearch(int[]a,int target)
	{
		int min=0;
		int max=a.length-1;
		while(min<=max)
		{
			int mid=min+(max-min)/2;
			int middle=a[mid];
			if(middle>target)max=min-1;
			else if(middle<target)min=mid+1;
			else return mid;
		}
		return -1;
	}
}