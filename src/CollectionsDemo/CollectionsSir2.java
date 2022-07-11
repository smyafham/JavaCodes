package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class CollectionsSir2 {

	public static void main(String[] args) {

   List<String> list1=new ArrayList<String>();
   /*list1=new LinkedList<String>();
   list1=new Stack();
   list1=new Vector();*/

   Scanner scanner=new Scanner(System.in);
   System.out.println("Enter the customer names into list");
   for(int i=0; i<5; i++)
   {
	   String customerName=scanner.nextLine();
	   list1.add(customerName);
   }
   List<String> list2=new ArrayList<String>();
   for(int i=0; i<list1.size(); i++)
   {
	  if( list1.get(i).startsWith("Dr."))
	  {
		  list2.add(list1.get(i));
		 // list1.remove(list1.get(i));
	  }
   }
   System.out.println(list2.size() + " "+"Doctors are there");
   // iteartor() method on list which returns Iterator
   /*
    * interface Iterator
    * {
    * next() ---Object
    * hashNext()--boolean
    * remove()---void
    * }
    * class ABC implements Iterator
    * {
    * next()
    * {
    * }
    * hashNext()
    * {
    * }
    * public Iteator iterator()
    * {
    * Iterator itr=new ABC();
    * new ABC();
    * }
    * 
    * 
    * 
    */
   Iterator<String> itr=  list1.iterator();
   while(itr.hasNext())
   {
	 // String str= (String)itr.next();
	 String str=  itr.next();
	  if(str.startsWith("Dr."))
	  {
		  itr.remove();
	  }
	  System.out.println(str);
   }
   System.out.println(list1);
	}

}
