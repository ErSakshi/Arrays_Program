//write a java program to fetch prime numbers in an arrays
class PrimeArrays
{
	public static void main(String[] args) 
	{
	  int []arr={2,8,5,4,7,9,13,14,15,16,17};

	  for(int i=0;i<arr.length;i++)
	  {
	  	int count=0;
	  	for(int j=1;j<=arr[i];j++)
	  	{
	  		if(arr[i]%j==0)
	  		{
	  			count++;
	  		}
	  	}
	  	if(count==2)
	  	{
	  		System.out.print(arr[i]+" ");
	  	}
	  }	
	}
}