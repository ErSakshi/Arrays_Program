//write a java program to find the counts of vowels and consonts in given array
import java.util.*;
class ArrayVowCons
{
	public static void main(String[] args)
	 {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the Size : ");
	  int size=sc.nextInt();

	  System.out.println("Enter the elements : ");

	  char []arr=new char[size];

	  for(int i=0;i<size;i++)
	  {
	  	arr[i]=sc.next().charAt(0);  // we can also add here to lowerCase() to convert input into lowerCase
	  }	

	  int vCount=0;
	  int cCount=0;

	  for(int i=0;i<size;i++)
	  {
	  	if(arr[i]=='a'||arr[i]=='i'||arr[i]=='e'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')
	  	{
	  		vCount++;
	  	}else 
	  	{
	  		cCount++;
	  	}
	  }
	  System.out.println("Vowels Count :"+vCount);
	  System.out.println("Consonts Count :"+cCount);
	}
}