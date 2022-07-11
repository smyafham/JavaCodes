package ExceptionHandlingprgms;

import java.util.Scanner;

/*
 * Exception: abnormal situation of our program
 * Runtime error
 * divided by zero
 * array index out of bounds --we are trying to access an array beyond of range
 * when we are accessing any field or any method with null value.
 *                             java.lang
 *                                 |
 *                                 Throwable<class>
 *                                 |
 *                                 1.Exception<class>
 *                                    |
 *                                    i. Compile time exception or checked exception
 *                                    "D:/abc.txt"
 *                                    a. File(String filepath)throws FileNotFoundException
 *                                    b.Class.forName(String compiledClassname)throws ClassNOtFoundException
 *                                    c.SQLException
 *                                    d.IOException
 *                                    ii. Runtime Exception or unchecked exception
 *                                    1.Arithmatic Exception
 *                                    2.ArrayIndexOutOfBounds Exception
 *                                    3.NullPinterException
 *                                    4.NumberFormatException
 *                                    5.
 *                                    
 *                                 
 *                                 2.Error<class>
 *                                 stackmemoryoverflow
 *                                 
 * 
 * 
 * 
 * 
 */
class Calculator
{
	
	public static void getDivision(int a, int b)
	{
		/*
		 * try
		 *   {
		 *   
		 *   //BL code to extract data fromDB Srver
		 *    line 1--registered driver
		 *    line 2--estabilished connection
		 *    line 3--extracting data--SQLException
		 *    line 4--printing data
		 *    
		 *   
		 *   
		 *   }//p=new SQLException()
		 *   catch(Exception p)
		 *   {
		 *   System.out.println(e)
		 *   }
		 *   finaly
		 *   {
		 *   line 5--db.close() for database
		 *   }
		 *   
		 *   throw-- throw Throwable instance
		 *   
		 *   min=20000
		 *   if(30000)
		 *   {
		 *   thorw Userdefined Exception
		 *   }
		 *   
		 *   throws
		 *   
		 *   public boolean checkPan(String pan)throws InvalidPan, IOException,SQLExceotion
		 * 
		 * 
		 */
		try
		{
		int result=0;
		result=a/b;
		System.out.println("The divison is "+ " "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Give valid input for second number" + " "+e);
		}
	}
	
	
}

public class Excpprg1 {

	public static void main(String[] args) {

Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number for a");
	int a=scanner.nextInt();
	System.out.println("Enter the number for b");
	int b=scanner.nextInt();
	Calculator.getDivision(a, b);
		
		

	}

}
