import java.util.*;
class NearestPrime
{
	public static void main(String[] args) 
	{
	   // Scanner sc=new Scanner(System.in);
	   // System.out.print("Enter the number ");
	   // int num=sc.nextInt();
       int before=0;
       int after=0;
       int num=9;
      
    //   for(int i=2 ;true;i++)
	// 	{
	// 		isPrime(i);
	// 	}
	  
    //     if(num<32)
    //     {
    //       count++;
    //       System.out.println(num);
    //     }
    //     else{
    //     	cnt++;
    //     	System.out.println(num);
    //     }

	// }
	// public static int isPrime(int num)
	// {
    //      boolean flag=true;
    //   for(int i=2;i<num;i++)
    // {
    // 	if(num/i==0)
    // 	{
    // 		flag=false;
    // 		break;
    // 	}

    // }

    // if(flag)
    //     System.out.println("is prime");

    //     return num;

       for(int i=2;true;i++)
       	{
       		if(isPrime(i))
       		{
       			if(i<num)
       			{
       				before=i;
       			}else{
       				after=i;
       				break;
       			}
       		}
       	}


    if(num-before==after-num)
    	System.out.println(before+" "+num+" "+after);

	}else if(num-before<after-num)
	System.out.println(before);
	else 
		System.out.println(after);
	public static void isPrime(int i)
	{
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				return false;
			}
		}
		return true;
	}

}