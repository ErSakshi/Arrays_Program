import java.util.Arrays;
class Merging2dDifferntArray
{
	public static void main(String[] args) 
	{
	   int [][]a={{1,2},{4,5}};
	   int []b= {10,20};

	  

	   int len=0;
	   for(int i=0;i<a.length;i++)
	   {
	   	 len+=len+a.length;
	   }
	   
	    int [] c=new int[len];
	   int indx=0;

	   for(int i=0;i<a.length;i++)
	   {
	   	 for(int j=0;j<a.length;j++)
	   	 {
	   	 	c[indx++]=a[i][j];
	   	 }

	   }
	   for(int i=0;i<b.length;i++)
	   {
	   	c[indx++]=b[i];
	   }

	   System.out.println(Arrays.toString(c));
	  	}
}