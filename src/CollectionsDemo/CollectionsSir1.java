package CollectionsDemo;


import java.util.ArrayList;

/*
 * 
 * int a=10 []
 * int[] a=new int[10]
 * Framework is the collection packages, classes , inetrfaces and methods
 * Collection framework provides the way to store multiple data in form of object
 *        java.util
 *           |
 *           Iterable<interface>
 *            |
 *            Collection<interface>
 *            a.add(Object obj)---boolean
 *            b. addAll(Collection collection)--boolean
 *            c. get(int index)---Object
 *            d. contains(Object obj)---boolean
 *            e.remove(Object obj)--boolean
 *            f.remove(int index)---Object
 *            g.size()---int
 *            h.set(int index, Object obj)
 *            i.toArray()--Object[]
 *            j.retain(Objec obj)
 *            1. List<interface>
 *            1. In list we can store data in form Object as insertion order
 *            2.List allowes duplicacy
 *             a. ArrayList<class>
 *               10
 *               15
 *             b. LinkedList<class>
 *             c.Stack<class>
 *             d.Vector<class>
 *              |
 *              
 *            
 *            
 *            2.Set<interface>
 *            3.Queue<interface>
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class CollectionsSir1 {

	public static void main(String[] args) {

   ArrayList list1=new ArrayList();
   /*
    * int ---Integer
    * parseInt(String )--int
    * int k
    * 
    * float---Float
    * double ---Double
    * long---Long
    * char---Charcter
    * boolean ----Boolean
    * byte----Byte
    * short---Short
    */
   
   String data="100";
   int k=10;
   //boxing
   //Object---primitive
   Integer i1=new Integer(k); //i1----10
   String s1=new String("abc"); //s1   -----> "abc"
   //TestCollection1 t1=new TestCollection1();
  // System.out.println(t1);
   //System.out.print(s1);
  // System.out.println(i1);
   //unboxing
   //primitive--Object
   int j=i1;
   System.out.println(j);
   list1.add(new Integer(500));
   list1.add(k);
   list1.add("xyz");
   list1.add(true);
   list1.add(345.889);
   //size() -- int
   System.out.println("The size of the list is" + " "+list1.size());
		
	//conatains(Object obj)---boolean	
		boolean b=list1.contains("xyz");
		if(b)
		{
			for(int i=0; i<list1.size(); i++)
			{
				System.out.println(list1.get(i));
			}
			System.out.println("Going for remove...");
			//remove(Object obj)---boolen 
			//remove(int index)---Object
			//Object obj=Integer obj
		Object obj= 	list1.remove(0);
		System.out.println("The remove object is"+ " "+obj);
		
		   boolean b1=list1.remove("dsd");
		   System.out.println(b1);
		   if(b1)
		   {
		System.out.println(list1.size());
		   }
		   else
		   {
			   System.out.println(list1);
		   }
		}

	}

}