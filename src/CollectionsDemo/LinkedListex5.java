package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class LinkedListex5 {

	public static void main(String[] args) {
		String[] input={"01","01010","1000","10","011"};
		
		List<String> str=new ArrayList<String>();
		List<String> str2=new ArrayList<String>();
		List<String> str3=new ArrayList<String>();
		for (int i=0;i<input.length;i++) {
			
			str.add(input[i]);
		/*	if((str.get(i).startsWith("100"))||(str.get(i).startsWith("010"))||(str.get(i).startsWith("011"))||(str.get(i).startsWith("101")))     {
				str2.add(str.get(i));
				//input[i].length()>2
			}*/
			if(((str.get(i).startsWith("10"))||(str.get(i).startsWith("01")))&&(str.get(i).length()>2)) {
				str3.add(str.get(i));
			}
			
		}
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println("The number of strings having prefix 10,01 are = "+str2.size());

	}

}
