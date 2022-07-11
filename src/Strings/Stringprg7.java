package Strings;

import java.util.Scanner;

class UserMainCodes{
	static String nameFormatter(String str) {
		int len=str.length();
		String[] str1=str.split(" ");	
		StringBuffer sBuffer=new StringBuffer();
		sBuffer.append(str1[1]).append(",").append(str1[0].substring(0, 1).toUpperCase());
		String strr=sBuffer.toString();
		return strr;
	}
}
public class Stringprg7 {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter FirstName LastName");
String str =s.nextLine();
String str1=UserMainCodes.nameFormatter(str);
System.out.println(str1);
	}

}
