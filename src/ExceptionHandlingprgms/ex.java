package ExceptionHandlingprgms;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
class ArrayIndex
{
	public String getPriceDetails()
	{
	
		try
		{
			String result;
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the size of the Array");
			int n=input.nextInt();
			int[] price;
			int[] p=new int[n];
			System.out.println("Enter the price of the products");
			for(int i=0;i<n;i++)
			{
				p[i]=input.nextInt();
				//System.out.println("You have entered " + p[i]);
			}
			System.out.println("enter the index of the array element you want to access");
			int index = input.nextInt();
			result=String.valueOf(p[index]);
			return result;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			return "Array Index is out of range";
		}
		catch(InputMismatchException e)
		{
			return "The Input type you have enter is wrong";
		}
		
		
	}
}
public class ex
{
	public static void main(String[] args) 
	{
		ArrayIndex ai=new ArrayIndex();
	String string=	ai.getPriceDetails();
	System.out.println(string);
	}
}
