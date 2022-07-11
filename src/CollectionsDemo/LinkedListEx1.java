package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class LinkedListEx1 {

	public static void main(String[] args) {
Scanner s =new Scanner (System.in);
System.out.println("Enter number of matches");
int n=s.nextInt();
ArrayList<Integer> list1=new ArrayList<Integer>(n);
System.out.println("Enter raid points");
for(int i=0;i<n;i++) {
	int num=  s.nextInt();
	list1.add(num);
}
List<Integer> list	= new LinkedList(list1);
Collections.sort(list);
System.out.println("Sorted raid points are");
for(Object j:list) {
	System.out.println(j);
}


}

}
