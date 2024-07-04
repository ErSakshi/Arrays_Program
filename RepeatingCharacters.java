import java.util.*;
class RepeatingCharacters
{
	public static void main(String[] args) 
	{
	  //  Scanner sc=new Scanner(System.in);
	  //  System.out.print("Enter the size of an Array : ");
	  //  int size=sc.nextInt();
	  //  System.out.println("Enter the elements of an Array : ");


      // int []a=new int[size];
	  //  for(int i=0;i<size;i++)
	  //  {
	  //  	 a[i]=sc.nextInt();
	  //  }

     
	  //  for(int i=0;i<size;i++)
	  //  {
	  //  	int count=0;
	  //  	for(int j=i+1;j<size;j++)
	  //  	{
      //      if(a[i]==a[j])
      //      {
      //      	a[j]=0;
      //      	count++;
      //      	}
        
	  //  	}
	  //  	if(count>1)
      //    {
	  //  	System.out.println(a[i]);
	  //  }	
	   	
	  //  }
	    
     
//Repeated elements
     // int []a={1,3,4,5,3,2,1,6,};
     // System.out.println(Arrays.toString(a)); 

     // for(int i=0;i<a.length;i++)
     // { 
     // 	int count=1;
     // 	for(int j=i+1;j<a.length;j++)
     // 	{
     //      if(a[i]==a[j]  && a[i]!=0)
     //      {
     //      	a[j]=0;
     //      	count++;
     //      }
     // 	}
     // 	if(count>1)
     // 	{
     // 		System.out.println(a[i]);
     // 	}
     // } 

     //distinct element
     //  int []a={1,3,4,5,3,2,1,6,};
     // System.out.println(Arrays.toString(a)); 

     // for(int i=0;i<a.length;i++)
     // { 
     // 	int count=1;
     // 	for(int j=i+1;j<a.length;j++)
     // 	{
     //      if(a[i]==a[j]  && a[i]!=0)
     //      {
     //      	a[j]=0;
     //      	count++;
     //      }
     // 	}
     // 	if(count==1 && a[i]!=0)
     // 	{
     // 		System.out.println(a[i]);
     // 	}
     // }

     //Frequency
      int []a={1,3,4,5,3,2,1,6,};
     System.out.println(Arrays.toString(a)); 

     for(int i=0;i<a.length;i++)
     { 
     	int count=1;
     	for(int j=i+1;j<a.length;j++)
     	{
          if(a[i]==a[j]  && a[i]!=0)
          {
          	a[j]=0;
          	count++;
          }
     	}
     	if( a[i]!=0)
     	{
     		System.out.println(a[i]+" "+count);
     	}
     }  
	}
}