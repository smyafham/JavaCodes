package CollectionsDemo;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class gk
{
	public static HashMap<String, String> getStudents(HashMap<String, Integer>map1)
	{
		HashMap<String, String> map2=new HashMap<String, String>();
		Set<HashMap.Entry<String, Integer>> entrySet=map1.entrySet();
		for(Entry<String, Integer> su:entrySet)
		{
			if(su.getValue()>=80)
			{
				map2.put(su.getKey(),"Gold Medal");
			}
			else if(su.getValue()>=60 && su.getValue()<80)
			{
				map2.put(su.getKey(),"Silver Medal");
			}
			else if(su.getValue()>=50 && su.getValue()<60)
			{
				map2.put(su.getKey(), "Bronze Medal");
			}
			else 
			{
				map2.put(su.getKey(), "No Medal");
			}
		}
		return map2;	
	}
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		HashMap<String, Integer> map1=new HashMap<String, Integer>();
		
		System.out.println("How many students you want to enter");
		int n=Integer.parseInt(input.nextLine());
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter students registration ID");
			String id=input.nextLine();
			System.out.println("Enter marks of the student");
			int marks=Integer.parseInt(input.nextLine());
			map1.put(id, marks);
		}
		System.out.println(map1);
		System.out.println(getStudents(map1));
	}
}