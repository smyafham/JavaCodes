package CollectionsDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 * Map: Map is a interface which allowes to store objects in form key and value pair
 *    java.util
 *      |
 *     Map<interface>
 *     |
 *     HashMap<class>
 *     LinkedHashMap<class>
 *     |
 *     SoretdMap
 *     |
 *     TreeMap<class> 
 * 
 * 
 * 
 */


public class MapsSir1 {

	public static void main(String[] args) {
//Key can be any valid object
		//value can be any valid object
		//Map<Object key, Object value>
Map<Integer, String> map;
//map=new HashMap<Integer, String>();
//map=new LinkedHashMap<Integer, String>();
map=new TreeMap<Integer, String>();
//If you want insert any obejct in form of key and value 
//put(obejct key, objeect value)----boolean
	/*map.put(102, "abc");
	map.put(110, "abc");
	map.put(102, "xyz");
	map.put(105, "a");
	map.put(107, "pqr");*/
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the size of map");
int size=Integer.parseInt(scanner.nextLine());
//int size=scanner.nextInt();
for(int i=0; i<size; i++)
{
	System.out.println("Enter employee code");
	int code=Integer.parseInt(scanner.nextLine());//      5\n
	//int code=scanner.nextInt();
	//scanner.nextLine();
	System.out.println("Enter the employee name");
	String empName=scanner.nextLine();
	//put(K,V)
	map.put(code,  empName);
	
}

System.out.println(map);
//containsKey(Object obj)--boolean
//conatinsValue(Object value)
if(map.containsKey(111)) {
	System.out.println(map.size());
}


//keySet() ---Set<Key>--This
 /*Set<Integer> keyset=   map.keySet();
   Iterator<Integer> itr=keyset.iterator();
//hasNext()--
while(itr.hasNext())
{
	int key=itr.next();
	//Incase of list ---get(int index)--Object
	//incase of map---get(Object key)---Object
	//key---Object value--Object
	String value=map.get(key);
	System.out.println(key + "--->"+ " "+value);
}*/

//k V
//102 abc
/*
 * interface Map
 *   {
 *    ineterface Entry
 *    {
 *    getKey()
 *    getValue()
 *    }
 *    }
 * 
 * Map.Entry
 * 
 * 
 */
Set<Map.Entry<Integer, String>> entryset=map.entrySet();

for(Map.Entry<Integer, String> me: entryset)
{
	
	System.out.println(me.getKey() + " "+me.getValue());
}
 
//remove(Obejct key)---String
 //remove(Object key, Object value)--boolean
 //replace(Object key, Ovbject value)
//replace(Obejct key, Obejct oldVlue, Object newValue)
//putAll(Map m)
//get(Object key)

		
		
	}

}