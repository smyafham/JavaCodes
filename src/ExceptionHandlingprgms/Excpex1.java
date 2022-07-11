package ExceptionHandlingprgms;

import java.util.InputMismatchException;
import java.util.Scanner;

class Arrayexception{
	public static String getPriceDetails(int n,int[] arr) {
		try {
			int arrr[]=new int[n];
			arrr=arr;
			//for (int j=0;j<n;j++) {
				//arrr[j]=arr[j];
			//}
			System.out.println("Enter the index element of the array element you want to access");
			Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
		String	 str="the array element is ";
		String	 str2=String.valueOf(arrr[x]);
		String	 str3= str.concat(str2);
				return str3;

		
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			return "Array index is out of range";
		}
		
	}
}
public class Excpex1 {

	public static void main(String[] args) {
		try {
			
		
System.out.println("Enter the number of elements in the array");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[] =new int[n];
System.out.println("Enter price details");
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
	String str = Arrayexception.getPriceDetails(n,arr);
	System.out.println(str);

	}
		catch(InputMismatchException ee) {
			System.out.println("Input was not in correct format");
		}

	}
	
}
