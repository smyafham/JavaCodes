package CollectionsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinkedListEx2 {

	public static void main(String[] args) {
Scanner s = new Scanner (System.in);
System.out.println("Enter number of matches");
int x=Integer.parseInt(s.nextLine());
List<String> list=new ArrayList<String>(x);
System.out.println("Enter Venue");
String str=s.nextLine();
System.out.println("Enter venues of "+x+" matches played");
for (int i=0; i<x ;i++) {
	list.add(s.nextLine());
}

int count=0;
for (int i=0; i<x ;i++) {
	if(list.get(i).equalsIgnoreCase(str)) {
		count++;
	}
}
System.out.println(count);


	}

}
