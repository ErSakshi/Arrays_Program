import java.util.*;
class Practice2
{
	public static void main(String[] args)
	 {

	 	//EXAMPLE 1:
	   // String name[]={"sakshi","sonakshi","meenakshi","Pranakshi","satakshi"};
	   // System.out.println(name.length); //5
	   // //System.out.print(name[2]);	//meenakshi

	   // for(int i=0;i<name.length;i++)
	   // {
	   // 	System.out.println(name[i]);
	   // }

        //EXAMPLE2;
	 	// int []arr={1,3,2,4,6,8,5};
	 	// System.out.println("Odd number");
	 	// for(int i=0;i<arr.length;i++)
	 	// {
	 	// 	if(arr[i]%2!=0)
	 	// 	{
	 	// 		System.out.println(arr[i]);
	 	// 	}

	 	// }

	 	//EXAMPLE 3:

       // int []a={12,34,99,44,23,50};

       // for(int i=a.length-1;i>=0;i++)
       // {
       //  System.out.println(a[i]+" ");
       // }

	 	//EXAMPLE 4:

	 	// int []a={1,-2,-3,-4,5,6,7};

	 	// for(int i=0;i<a.length;i++)
	 	// {
	 	// 	if(a[i]<0)
	 	// 	{
	 	// 		System.out.println(a[i]+"is an negative number");
	 	// 	}
	 	// }

	 	int []a={12,4,6,3,21,45};
	 	int key=12;
	 	boolean flag=true;
	 	for(int i=0;i<a.length;i++)
	 	{
	 		if(key==a[i])
	 		{
             System.out.println("The position of an element is "+(i+1));
             flag=false;
             break;
	 		}

	 	}
	 	if(flag)
	 	{
	 		System.out.println("Element is not found");
	 	}

	}
}