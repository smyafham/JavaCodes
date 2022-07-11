package ExceptionHandlingprgms;

import java.util.Scanner;


class Error extends Exception{
	Error(){
		System.out.println("Age of the person should be above 15");
	}
}
public class Excpex3 {
public static void method(int age)throws Error{
	if (age>15) {
		System.out.println("Valid age");
	}
	else {
		throw new Error();
	}
}
	public static void main(String[] args)  {
		Scanner s=new Scanner(System.in);
System.out.println("enter Age");
int age=s.nextInt();
 try {
	method(age);
} catch (Error e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
