package Strings;

public class String7 {

	public static void main(String[] args) {
//A --65--01010
		 String str="Hi how are you";
		 
 char[] ch= str.toCharArray();
 for(int i=0; i<ch.length; i++)
 {
	 System.out.println(ch[i]);
 }
	byte[] b=str.getBytes();	
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
		

	}

}