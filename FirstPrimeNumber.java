import java.util.Arrays;
class FirstPrimeNumber
{
	public static void main(String[] args) 
	{
		int []arr=new int[10];
		int cnt=0;
	
	    for(int i=2;i<=30;i++)
	 
	  {   
	     
	 	 boolean flag=true;
        for(int j=2;j<i;j++)
        {
        	if(i%j==0)
        	{
        		flag=false;
        		break;
        	}

        }
        if(flag)
        {
  
           arr[i]=i; 
           cnt++;  	
        }
       
    }
     System.out.println(Arrays.toString(arr));
	}

}

	
        
