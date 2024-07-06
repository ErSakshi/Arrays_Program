import java.util.Arrays;
class SelectionSort
{
	public static void main(String[] args) 
	{
	  int []arr={4,2,1,3};
	  System.out.println(Arrays.toString(arr));

	  selectionSort(arr);
      System.out.println(Arrays.toString(arr));

	 	
	}
	private static void selectionSort(int []arr)
	{
		 for(int i=0;i<arr.length;i++)
	  {
	  	int min=arr[i];
	  	
	  	for(int j=i;j<arr.length;j++)
	  	{
	  		if(arr[min]>arr[j])
	  		{
	  			min=arr[j];

	  		}
	  	}
	  	int temp=arr[min];
	  	arr[min]=arr[i];
	  	arr[i]=temp;
	  }
	  	}
}