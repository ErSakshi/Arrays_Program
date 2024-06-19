import java.util.*;

class Practice1
{
	public static void main(String[] args) 
	{

		//Example 1
	  // int [][]a=new int[3][3];

	  // a[0][0]=10;
	  // a[0][1]=20;
	  // a[0][2]=30;

	  // a[1][0]=40;
	  // a[1][1]=50;
	  // a[1][2]=60;

	  // a[2][0]=70;
	  // a[2][1]=80;
	  // a[2][2]=90;

	  // System.out.println(Arrays.deepToString(a));

	  //Example 2
      // int [][]a=new int[3][];
      // a[0]=new int[2];
      // a[1]=new int[1];
      // a[2]=new int[2];

      // a[0][0]=10;
      // a[0][1]=20;

      // a[1][0]=30;
      
      // a[2][0]=40;
      // a[2][1]=50;

      // System.out.println(Arrays.deepToString(a));


   //Example 3
		// int [][][]a=new int[2][2][2];
		// a[0][0][0]=10;
		// a[0][0][1]=20;

		// a[0][1][0]=30;
		// a[0][1][1]=40;

		// a[1][0][0]=50;
		// a[1][0][1]=120;
		

		// a[1][1][0]=60;
		// a[1][1][1]=70;

		
		// System.out.println(Arrays.deepToString(a));

		// int[][][]a=new int[2][2][];
		// a[0][0]=new int[1];
		// a[0][1]=new int[2];

		// a[1][0]=new int[1];
		// a[1][1]=new int[3];

		// a[0][0][0]=10;

		// a[0][1][0]=20;
		// a[0][1][1]=30;

		// a[1][0][0]=40;

		// a[1][1][0]=50;
		// a[1][1][1]=60;
		// a[1][1][2]=70;

		// System.out.println(Arrays.deepToString(a));


     // int[][][]a=new int [2][][];
     // a[0]=new int[3][1];
     // a[1]=new int[2][];
     // a[1][0]=new int[2];
     // a[1][1]=new int[3];


     // a[0][0][0]=10;
     // a[0][1][0]=20;
     // a[0][2][0]=30;

     // a[1][0][0]=40;
     // a[1][0][1]=50;

     // a[1][1][0]=60;
     // a[1][1][1]=70;
     // a[1][1][2]=80;

     // System.out.println(Arrays.deepToString(a));

	// 	int [][][]a=new int[3][][];
	// 	a[0]=new int[1][2];
	// 	a[1]=new int[2][2];
	// 	a[2]=new int[3][2];

		
     // a[0][0][0]=10;

     // a[0][0][1]=20;

     // a[1][0][0]=25;
     // a[1][0][1]=30;

     // a[1][1][0]=40;
     // a[1][1][1]=50;

     // a[2][0][0]=60;
     // a[2][0][1]=70;

     // a[2][1][0]=80;
     // a[2][1][1]=60;

     // a[2][2][0]=70;
     // a[2][2][1]=80;

     // System.out.println(Arrays.deepToString(a));
 

int [][][][]a=new int[2][][][];
		a[0]=new int[2][1][1];
		a[1]=new int[3][][];
		
		a[1][0]=new int[1][1];
		a[1][1]=new int[2][1];
		a[1][2]=new int[3][1];

		
     a[0][0][0][0]=10;

     a[0][1][0][0]=20;

     a[1][0][0][0]=25;
     a[1][1][0][0]=30;

     a[1][1][0][0]=40;
     a[1][1][1][0]=50;

     a[1][2][0][0]=60;
     a[1][2][1][0]=70;

     a[1][2][2][0]=80;
    
     System.out.println(Arrays.deepToString(a));




	}
}