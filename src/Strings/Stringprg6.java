package Strings;

import java.util.Scanner;

class UserMainCode{
	public static boolean validestrings(String str) {
		String str1="[CTS]{3}[-]{1}[0-9]{3}";
		boolean b=str.matches(str1);
		
		return b;
	}
	
}
public class Stringprg6 {

	public static void main(String[] args) {
Scanner s =new Scanner(System.in);
System.out.println("Enter String");
String str =s.nextLine();
boolean b=UserMainCode.validestrings(str);
if(b) {
	System.out.println("Valid");
	
}
else {
	System.out.println("Invalid");
}
	}

}
