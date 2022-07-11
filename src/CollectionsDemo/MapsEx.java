package CollectionsDemo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapsEx {
	public static List<String> votersList(Map m) {
		List<String> arr1=new ArrayList<String>();
		Set<Map.Entry<String, Integer>> entryset=m.entrySet();

		for(Map.Entry<String, Integer> me: entryset)
		{
             if(me.getValue()>18) {
            	 arr1.add(me.getKey());
             }
		}
		return arr1;
		
	}

	public static void main(String[] args) {
      System.out.println("Enter total number of people");
      Scanner s =new Scanner(System.in);
      int n=Integer.parseInt(s.nextLine());
      Map<String, Integer> map=new LinkedHashMap<String,Integer>(n);
      for(int i=0;i<n;i++) {
    	  System.out.println("Enter ID");
    	  String id=s.nextLine();
    	  System.out.println("Enter Age");
    	  int age=Integer.parseInt(s.nextLine());
    	  map.put(id, age);
      }
      List<String> arrayList= votersList(map);
      System.out.println(arrayList);
      
      
	}

}
