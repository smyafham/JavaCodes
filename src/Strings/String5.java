package Strings;

import java.util.Scanner;

class Customers
{
	//ADKPU1234P
	public static boolean checkPan(String pan)
	{
		String p1="[A-Z]{5}[0-9]{4}[A-Z]{1}";
	boolean b=	pan.matches(p1);
	return b;
		
	}
	public static String  checkEmail(String email)
	{
		//Upad124123@gmail.com
		//abc123@gamil.co.in
		String p1="[A-Za-z0-9_-#]+[@]{1}[A-Za-z]{1,}[.]{1}[a-z]{2}[.]{1}[a-z]{2}";
		if(email.matches(p1))
		{
			return "Your mail id valid";
		}
		else
		{
			return "Invalid email id";
		}
	}
	
	
}
//client
public class String5 {

	public static void main(String[] args) {

  Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the pan number");
		String pan=scanner.next();
		System.out.println("Enter the email id");
		String email=scanner.next();
	boolean b1=	Customers.checkPan(pan);
	if(b1)
	{
		System.out.println("Your pan number is valid");
	}
	else
	{
		System.out.println("Invalid pan number");
	}
		
	String msg=	Customers.checkEmail(email);
		System.out.println(msg);
	}

}