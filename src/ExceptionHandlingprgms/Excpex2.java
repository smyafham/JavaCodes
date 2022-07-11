package ExceptionHandlingprgms;

import java.util.Scanner;

import Interface1.interfaceprg1;

class Division{
	public  void divideTwoNumbers(int a,int b) {
		try {
			int div=a/b;
			System.out.println("The answer is "+div);
			
		}
		catch (ArithmeticException e) {
			System.out.println("division by zero is not Possible");
			// TODO: handle exception
		}
		finally {
			System.out.println("Thanks for using the application");
		}
	}
}
public class Excpex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter number1");
Scanner s =new Scanner(System.in);
int num1=s.nextInt();
System.out.println("Enter number2");
int num2=s.nextInt();
Division d=new Division();
d.divideTwoNumbers(num1,num2);

	}

}
