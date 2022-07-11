package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSir1 {

	public static void main(String[] args) {

ArrayList<Integer> list1=new ArrayList();
list1.add(10);
list1.add(50);
list1.add(1);
list1.add(10);
list1.add(70);

/*List list=new ArrayList();
	list=new LinekdList();
	list=new Stack();
	list=new Vector(); */
//LinkedList()
//LinkedList(Collection c)
//LinekdList list2=new LinkedList();
	LinkedList list2=new LinkedList(list1);	
	System.out.println("First element is list is" + " "+list2.getFirst());
	System.out.println("Last element in list is"+ " "+ list2.getLast());
int removedObject=	(int) list2.removeFirst();
//removeList()--Object

Iterator<Integer> itr=list2.descendingIterator();
while(itr.hasNext())
{
int result=	 itr.next();
System.out.println(result);
}

Collections.sort(list2);
System.out.println("after sorting");
for(Object i:list2)
{
	System.out.println(i);
}
	
	

	}

}