package ExceptionHandlingprgms;


import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * Exception()
 * Exception(String errorMasg)
 * 
 * 
 */
class MyError extends Exception
{
	public MyError()
	{
		System.out.println("Invalid");
	}
	public MyError(String msg)
	{
		//super(msg);
		System.out.println(msg);
	}
	
}
class PanValidator
{
	//if I will give wrong pan format
	//IOException if I will try to access a file which not available
	//SQLException will occur due to some sql syntax
	public boolean checkPan(String panNo)throws MyError,IOException, SQLException
	{
		String panPattern="[A-Z]{5}[0-9]{4}[A-F]{1}";
		if(panNo.matches(panPattern))
		{
			return true;
		}
		else
		{
			//throw Throwable instance
			
			throw new MyError();


		}
		
		
	}
}



public class Excpprg3 {

	public static void main(String[] args) {

		PanValidator pv=new PanValidator();
		System.out.println("Enter pan num");
		Scanner scanner=new Scanner(System.in);
		String input=scanner.next();
				
					try {
						pv.checkPan(input);
					} catch (MyError | IOException | SQLException e) {
						// TODO Auto-generated catch block
						System.out.println("hi");
				
				

	}

}
}