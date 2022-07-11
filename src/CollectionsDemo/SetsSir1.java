package CollectionsDemo;
/*
 * Set
 * 1.Incase of set all the element should be unique
 * 
 * |
 * HashSet<class>
 * LinkedHashSet<class>
 * |
 * SortedSet<interface>
 *  |
 *  TreeSet<class>
 * 
 * 
 * 
 * 
 * 
 * 
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetsSir1 {

	public static void main(String[] args) {
		//HashSet()--It will create an empty set object with capcity 16 and load factor 0.75
		//HashSet(int capacity)---This create an hashset obj with explicit capcity and load 0.75
		//HashSet(Collection c)---HashSet(List)
		//HashSet(int capacity, float load factor)
    Set<Integer> set=new HashSet();
    /*
     * HashSet() 
     * {
     * 
     *HashMap m= new HashMap()
     * {
     * defualt 16
     * defult load factor 0.75
     *put(K as Object , Value as Object)--true
     * m.put(K,V)
     * {
     * String s="hello"
     *  1234%16=7
     *  int k=100
     *  k--
     * 
     * equals

     * 
     * }
     * 
     * 
     * }
     * 

     * []--0
     * []--
     * [hello]--7
     * []
     * []
     * []
     * []
     * [] -15
     * 
     * 
     * 
     * 
     * 
     */
    //add(Object obj)---boolean
    Scanner scanner=new Scanner(System.in);
	System.out.println("Enter elements into set");
	for(int i=0; i<5; i++)
	{
		int data=scanner.nextInt();
		//add(Object obj)--boolean true/false
	System.out.println(	set.add(data));
		
	}
	//345 234 1 678 45
	//1 678 345 234 45
Iterator<Integer> itr=	  set.iterator();	
	while(itr.hasNext())
	
	{
		System.out.println(itr.next());
	}

	//In case of linked hash set we will get data in insertion order
	set=new LinkedHashSet();
	set.add(30);
	set.add(70);
	set.add(1);
	set.add(30);
	set.add(43);
	System.out.println("LinkedHashSet"+set);
	//If you want to get data as ASC order then use treeset
	//TreeSet()--
	//TreeSet(Colletion c)
	//TreeSet(Comaparator obj)
	//TreeSet(SortedSet set)
	set=new TreeSet();
	set.add(30);
	set.add(88);
	set.add(5);
	set.add(20);
	System.out.println("TreeSet"+set);
	for(Object c:set) {
		System.out.println(c);
	}
	
	}

}