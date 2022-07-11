package Strings;

import java.util.Scanner;

public class Stringprg5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
System.out.println("Enter String");
String str = s.nextLine();
//String str3="$";
String str2= str.replaceAll("[^aeiou^AEIOU]", "\\$");
System.out.println(str2);
	}

}
