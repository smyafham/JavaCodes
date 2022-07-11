package Strings;

import java.util.Scanner;

public class Stringprg2 {
  public static int checkCharacters(String str) {
	  int len=str.length();
	  char a=str.charAt(0);
	  char b = str.charAt(--len);
	  if (a==b) {
	  
	  return 1;
	  }
	  else {
		return -1;
	}
  }
	
	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter String");
String str =s.nextLine();
int a=checkCharacters(str);
if (a==1) {
	System.out.println("Valid");
}
else {
	System.out.println("Invalid");
}
}	
}

