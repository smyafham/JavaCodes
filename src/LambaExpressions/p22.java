package LambaExpressions;

import java.util.Scanner;

public class p22 {
	
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter String");
String str=s.nextLine();
p2 p=(x)->{
	//String strr=x.replaceAll("\\b|\\B", " ");
	StringBuffer carr=new StringBuffer();
	for (char c:x.toCharArray()) {
		carr.append(c).append(" ");
		
	}
	
	return carr.toString();
};
	System.out.println(p.stringSpace(str));
}

}
