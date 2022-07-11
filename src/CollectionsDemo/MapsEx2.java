package CollectionsDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapsEx2 {
public static HashMap<String,String> getStudents(Map<String, Integer> map) {
	HashMap<String, String> mpMap1=new HashMap<String, String>();
	Set<Map.Entry<String,Integer>> entryset=map.entrySet();

	for(Map.Entry<String,Integer> me: entryset)
	{
		if((me.getValue()>=50)&&(me.getValue()<60)) {
			mpMap1.put(me.getKey(), "Bronze Medal");	
		}
		else if((me.getValue()>=60)&&(me.getValue()<80)) {
			mpMap1.put(me.getKey(),"Silver Medal");
		}
		else if(me.getValue()>=80){
			mpMap1.put(me.getKey(),"Gold Medal");
		}
		else{
			mpMap1.put(me.getKey(),"No Medal");
	}
	}
	return mpMap1;
	
}
	public static void main(String[] args) {
		  System.out.println("Enter total number of Students");
	      Scanner s =new Scanner(System.in);
	      int n=Integer.parseInt(s.nextLine());
	      Map<String, Integer> map=new HashMap<String,Integer>(n);
	      for(int i=0;i<n;i++) {
	    	  System.out.println("Enter Registration Number");
	    	  String Rnum=s.nextLine();
	    	  System.out.println("Enter Marks out of 100");
	    	  int marks=Integer.parseInt(s.nextLine());
	    	  map.put(Rnum, marks);
	      }
	     Map<String, String> mpMap=getStudents(map);
	     System.out.println(mpMap);
	}

}
