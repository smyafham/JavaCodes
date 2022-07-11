package Strings;

import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
  
		/*
		 * equals(String str)---boolean
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter user name");
		String uname=scanner.nextLine();
		System.out.println("Enter the phone");
		String phone=scanner.nextLine();
		//if the user name is admin and phone is 456
		/*
		 * == opeartor checks the equality of two references in case of object
		 * 
		 */
		/*int a=10;
		int b=10;
		if(a==b)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
		String s1=new String("hi");//105
		String s2=new String("hi");//106
		if(s1==s2)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
		if(s1.equals(s2))
		{
			System.out.println("both values are equals");
		}
		else
		{
			System.out.println("both values are not equal");
		}*/
		
		//Admin and admin
		//equalsIgnoreCase(String str)--boolean
		
		
		
		if(uname.equalsIgnoreCase("admin") && phone.equals("8147117572"))
		{
			System.out.println("you are valid customer");
			
			  //indexOf(char ch)---int
			//{'a', 'd', 'm'., 'i', 'n'}
			
			
			int n1=uname.indexOf('d');
			int n2=uname.indexOf("admin");
			
			
			
		int k=	phone.lastIndexOf("1");
		System.out.println(k);
			System.out.println(n1 + " "+n2);
			
			
			
			  String s1=String.valueOf(n1);
			  char ch='p';
			String s3=  String.valueOf(ch);
			  String s2=String.valueOf(n2);
			//subString(8)---String
			  
			  
			  
			String str1= phone.substring(5,8);
			System.out.println(str1);
			
			
	String otp=		s1.concat(s2).concat(str1).concat("hi").concat("#");
			System.out.println(otp);
			
		}
		else
		{
			System.out.println("Invalid login");
		}
		

	}

}