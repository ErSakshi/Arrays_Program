import java.util.Arrays;
class Merging2DArray
{
	public static void main(String[] args) 
	{
	   int []a={{10,20,30},{40,50,60,70},{80,90}};

	   //getting the length of 2d array

	   int len=0;
	   for(int[]i:a)
	   len+=i.length;


      //creating an new array using len
	 int []narr=new int[len];
      
      //iterating 2d data to the new array
	 int indx=0;
	    
	   for(int []i:a)
	   	for(j:i)
          narr[indx++]=j;

      System.out.println(Arrays.toString(narr));
	}
}