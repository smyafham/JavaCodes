package Strings;

public class String3 {

	public static void main(String[] args) {

   String msg="hello world";
   //charAt(int index)---char
   
 char ch=  msg.charAt(msg.indexOf('o'));
System.out.println(ch);
String str="Hi everyone how are you. Good morning";
//["Hi everyone how are you' "Good morning]
//split(String regex)---String[]
//split(String regex, int limit)
String[] s=str.split(" ", 4);
for(int i=0; i<s.length; i++)
{
	System.out.println(s[i]);
}

	}
}
