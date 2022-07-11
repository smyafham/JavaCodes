/*
 * Write a program to read a string and validate whether the given string is a valid color code based on the following rules:
- Must start with "#" symbol
- Must contain six characters after #
- It may contain alphabets from A-F or digits from 0-9
 
Include a class UserMainCode with a static method validateColorCode which accepts a string. The return type (integer) should return 1 if the color is as per the rules else return -1.
Create a Class Main which would be used to accept a String and call the static method present in UserMainCode.
 
Input and Output Format:
Input consists of a string.
Output consists of a string (Valid or Invalid).
Refer sample output for formatting specifications.
Sample Input 1:
#FF9922
Sample Output 1:
Valid
 
Sample Input 2:
#FF9(22
Sample Output 2:
Invalid
 * 
 */

package Strings;

import java.util.Scanner;

public class Stringprg12 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter String");
		String str=s.nextLine();
		String str2="[#]{1}[A-F0-9]{6}";
		if(str.matches(str2)) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
	}

}
