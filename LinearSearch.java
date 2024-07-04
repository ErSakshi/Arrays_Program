class LinearSearch
{
	public static void main(String[] args)
	 {
	    int [] a={5,6,7,2,3,9,8};
	    int target=7;
	    int indx=getIndex(a,target);

	    if(indx==-1)
	    {
	    	System.out.println("Element is not found ");
	    }	else {
	    	System.out.println("Element is found at index : "+indx);
	    }
	}
	private static int getIndex(int[] a ,int target)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==target)
				return i;
		}
		return -1;
	}
}