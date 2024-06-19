
class Prime1
{
	public static void main(String[] args) 
	{
		
	   int []arr={3,4,2,1,6};

	   for(int i=0;i<arr.length;i++)
	   {
	   	  boolean flag=true;
	   	  for(int j=2;j<arr[i];j++)
	   	  {
	   	  	if(arr[i]%j==0)
	   	  	{
	   	  		flag=false;
	   	  		break;
	   	  	}

	   	  }
	   	  if(flag)
	   	  {
	   	  	System.out.println("Prime : "+arr[i]);
	   	  }else 
	   	  {
	   	  	System.out.println(" Not Prime :"+arr[i]);
	   	  }

	   }

	  
	}
}