//write the java program to check it si palindrome or not
import java.util.*;
class ArrayPalindrome
{
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the size of array :");
	  int size=sc.nextInt();
	  System.out.println("Enter the elements :");

	  char []arr=new char[size];
      for(int i=0;i<size;i++)
      {
      	arr[i]=sc.next().charAt(0);
      }

      char []revArr=new char[size];
      int temp=0;
      for(int i=arr.length-1;i>=0;i--)
      {
      	revArr[temp]=arr[i];
      	temp++;
      }

      if(Arrays.equals(arr,revArr))
      {
      	System.out.println("It is Palindrome");
      }
      else{
      	System.out.println("Not a Palindrome");
      }

	}
}