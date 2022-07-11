package ArraysPrgms;

import java.util.Scanner;

public class Progm9Arrays {

	public static void main(String[] args) {
		/*
		 * 10 20
		 * 20 50
		 * 60 80
		 * 
		 */
   //int[][] a= {{10,20},{20,50},{60,80}};
		int[][] a=new int[3][2];
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the elements into array");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<2; j++)
			{
				a[i][j]=scanner.nextInt();
			}
		}
		
		
		
   System.out.println("rows in array"+a.length);
for(int i=0; i<3; i++)
{
	for(int j=0; j<2; j++)
	{
		System.out.print(a[i][j] + " ");
	}
	System.out.println();
}
	}

}
