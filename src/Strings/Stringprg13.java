/*
 * 
 * Find the sum of the numbers in the given input string array
   Input{“2AA”,”12”,”ABC”,”c1a”}
   Output:6 (2+1+2+1)
   Note in the above array 12 must not considered as such
   i.e,it must be considered as 1,2
 */

package Strings;

import java.util.Scanner;



public class Stringprg13 {

	public static void main(String[] args) {
		String[] str= {"2AA","12","ABC","c1a"} ;
		
		int count=0;
		StringBuffer str1=new StringBuffer();
		for(int i=0;i<str.length;i++) {
			str1.append(str[i]);
		}
		String str3=str1.toString();
		String[] str4= str3.split("",str3.length());
		int[] arr=new int[str4.length];
		System.out.println(str3);
		String st="[0-9]{1,}";

		for(int j=0;j<arr.length-1;j++) {
			if(str4[j].matches(st)) {
					System.out.println(str4[j]); 
					arr[j]=Integer.parseInt(str4[j]);
					count = count+arr[j];
			}
			
		}
	
		System.out.println(count);
		

		 
		
	
	}

}
