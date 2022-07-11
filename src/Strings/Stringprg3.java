package Strings;

import java.util.Scanner;

class Customer{
	public static boolean checkpan(String pan) {
		//ASbas1234A
		String p1="[A-Z]{5}[0-9]{4}[A-Z]{1}";
				boolean b=pan.matches(p1);
		return b ;
	}
	
	public static String checkmail(String mail) {
		String p1= "[A_Za-z0-9-#]+[@]{1}[A-Za-z]{1,}[.]{1}[A-Za-z]{3}";
		if(mail.matches(p1)) {
			return "Your mail is valid" ;
		}
		else {
			return "Invalid mail id" ;
		}
	}
}
public class Stringprg3 {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("enter pan numner");
String pan=s.nextLine();
System.out.println("enter mail");
String mail=s.nextLine();
boolean b1 =Customer.checkpan(pan);
if (b1) {
	System.out.println("Your pan number is valid");
}
else {
	System.out.println("Invalid pan number");
}
String msg= Customer.checkmail(mail);
System.out.println(msg);
	}

}
