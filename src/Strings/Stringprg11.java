package Strings;

import java.util.Scanner;

public class Stringprg11 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter String");
		String str=s.nextLine();
		System.out.println("Enter number");
		int n=s.nextInt();
		int len=str.length();
		String str2,str3;
		//for(int i=0;i<1;i++) {
	     str2=str.substring(0, n);
	     str3=str.substring(len-n,len);
	    // System.out.println(str2);
	   //  System.out.println(str3);
	     StringBuffer str4=new StringBuffer(str2);
	     str4.append(str3);
	     System.out.println(str4);
		//}
		
	}

}