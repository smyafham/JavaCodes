package ExceptionHandlingprgms;

import java.util.Scanner;

public class Excpprg2 {
  static String msg="hello";
  public static void display1(String msg)
  {
	  System.out.println(msg);  
  }
  
  
  
	public static void main(String[] args) {

		try
		{
			System.out.println(msg);
      Scanner scanner=new Scanner(System.in);
		System.out.println("enter the index to access an array");
		int pos=scanner.nextInt();//10
		int[] x= {12, 45, 89, 70, 50, 0, 23};//0 to 6
		x[pos]=100;//x[10]//ArrayIndexOutOfBounds
	char ch=	msg.charAt(0);//null pointer exception
		System.out.println(ch);
		
		System.out.println("Enter number");
		String number=scanner.next();//abc
		 int y=  Integer.parseInt(number);//number format exception
		 int res=100/y;//ArthmeticException
		System.out.println("result "+ " "+res);
		
		}
		
		
		
		
		catch(ArithmeticException ae )
		{
			display1("hello...");
			
			main(null);
		}
		catch(NullPointerException ne)
		{
			System.out.println("do not acceess any object , method or variable with null value");
			main(null);
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("Please give valid range of array from 0 to 6");
			main(null);
		}
		catch(Exception e)
		{
			System.out.println("I am handling all other exception "+ " "+e);
			main(null);
		}
		
		finally
		{
			System.out.println("Thanks for using my application");
		}
		
		

	}

}