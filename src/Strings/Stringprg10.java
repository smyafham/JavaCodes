package Strings;

import java.util.Scanner;

public class Stringprg10 {

	public static void main(String[] args) {
Scanner s =new Scanner(System.in);
System.out.println("Enter number");
String str=s.nextLine();
String str1="[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}";
boolean b=str.matches(str1);
if(b){
	System.out.println("valid number format");
}
else {
	System.out.println("Invalid number format");
}
}

}
