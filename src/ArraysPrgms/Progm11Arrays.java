package ArraysPrgms;
/*Consider the given matrix

 

0 1 0
1 1 0
1 1 1

 

Write a java program which will store all this element into two dimentional array

 

display all the element in the above given format

 

calculate the sum of all 1's from the given array
 * 
 * 
 */
import java.util.Scanner;

public class Progm11Arrays {

	public static void main(String[] args) {
int[][] arr=new int[3][3];
System.out.println("enter array elements");
Scanner s = new Scanner(System.in);
for (int i=0;i<arr.length;i++) {
	for (int j=0;j<arr.length;j++) {
		arr[i][j]=s.nextInt();
	}
}
for (int i=0;i<arr.length;i++) {
	for (int j=0;j<arr.length;j++) {
		System.out.print(arr[i][j]+" ");
	}
	System.out.println("");
}
int sum=0;
for (int i=0;i<arr.length;i++) {
	for (int j=0;j<arr.length;j++) {
		if(arr[i][j]==1)
		sum+=1;
	}
}
System.out.println("Sum="+sum);

	}

}
