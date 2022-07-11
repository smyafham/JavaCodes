package Strings;

import java.util.Scanner;
public class Stringprg1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

System.out.println("Enter venue 1");
String str1=s.nextLine();
System.out.println("Enter venue 2");
String str2=s.nextLine();
if(str1.equalsIgnoreCase(str2))
{
	System.out.println("Both the venues are same");
}
else {
	System.out.println("Both the venues are different");

}
	}

}
