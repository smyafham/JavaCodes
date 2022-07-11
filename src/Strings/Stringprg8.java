package Strings;

import java.util.Scanner;

class Usermaincodess{
	static String removieCharater(String str,char c) {
		String str1=str.replaceAll(String.valueOf(c),"");
		return str1 ;
	}
	
}
public class Stringprg8 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter string");
		String str =s.nextLine();
		System.out.println("enter character");
	    char c =s.next().charAt(0);
String str1=Usermaincodess.removieCharater(str, c);
System.out.println(str1);

	}

}
