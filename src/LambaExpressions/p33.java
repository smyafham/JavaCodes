package LambaExpressions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class p33 {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter name");
String name=s.nextLine();
System.out.println("Enter Pass");
String pass=s.nextLine();
Map<String,String> mp=new HashMap<String, String>();
mp.put("Afham", "password");
mp.put("test", "test@123");
mp.put("umme", "luv");

p3 p=(x,y)->{
	Set<Map.Entry<String, String>> entryset=mp.entrySet();

	for(Map.Entry<String, String> me: entryset)
	{
		if((x.equals(me.getKey()))&&(y.equals(me.getValue()))){
			return true;
		}
	}
	return false;
	
};
System.out.println(p.authentication(name, pass));
	}

}
