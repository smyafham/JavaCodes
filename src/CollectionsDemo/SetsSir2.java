package CollectionsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetsSir2 {

	public static void main(String[] args) {
 
		List<Integer> list=new ArrayList();
		list.add(2);
		list.add(20);
		list.add(32);
		list.add(21);
		list.add(21);
		list.add(29);
		list.add(2);
		//System.out.println(list);
		
		Set<Integer> set1=new TreeSet(list);
		
		System.out.println("TreeSet1 "+set1);
		Set<Integer> set2=new TreeSet();
		set2.add(2);
		set2.add(7);
		set2.add(1);
		set2.add(32);
		System.out.println("TreeSet2 "+set2);
		//implementing union between two sets
		Set<Integer> set3=new TreeSet(set1);
		Set<Integer> set4=new TreeSet(set2);

		set1.addAll(set2);
		
		//for(Integer i: set1 )
		//{
		//	System.out.println(i);
		//}
		System.out.println("union"+set1);
		//intersection 
		
		set3.retainAll(set4);
		
		System.out.println("intersection , set3" + set3);
		//substraction
	set4.removeAll(set3);
		System.out.println("substraction" +set4);

	}

}