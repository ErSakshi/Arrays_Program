class LeadersInArray
{
	public static void main(String[] args) {
		int []a={16,17,4,3,5,2};

       int max=Integer.MIN_VALUE;
       int indx=0;


		for(int i=0;i<a.length;i++)
		{
			for(int j=indx;j<a.length;j++)
			{
               if(max<a[i])
               {
               	indx=i;
               	max=a[i];
              } 
               
			}
			System.out.println(max+" "+indx);
		}
	}
}

