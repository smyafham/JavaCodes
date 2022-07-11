package ExceptionHandlingprgms;

import java.util.Scanner;

class Error2 extends Exception{
	Error2(){
		System.out.println("Enter valid name");
	}
}
public class Excpex4 {

	public static void main(String[] args) throws Error2{
Scanner s =new Scanner(System.in);
System.out.println("Enter first name");
String fname =s.next();
System.out.println("Enter last name");
String lname=s.next();
if((fname == null)||(lname == null)) {
	new Error2();
}
else {
	System.out.println("Full name is "+fname +" "+lname);
}
	}

}
