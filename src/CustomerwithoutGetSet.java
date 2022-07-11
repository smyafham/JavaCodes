import java.util.Scanner;
public class CustomerwithoutGetSet {
	/*
	 * 1. instance varaiables dependent on the objcet of the class
	 * 2. instance variable declares inside the class block
	 * 3. The scope of the instance variable are available for the entire class
	 * 4.instance variables can take default value of it's type
	 * 
	 * obj1----heap(103)---id=1 name=a ph=123
	 * obj2-----heap(104)----id=1 name=b ph=3456
	 * [obj1, obj2 , obj3]
	 */
	/*
	 * public --we can access from same class, outside of the class, sub class,from different package
	 * private --we can access only from within class not from any where
	 * <no-keyword>--default access specifier--we can anywhere from same package
	 * protected ---can be access within the class, outside of the class, sub class and from different package only by sub class object
	 * 
	 */
 static int custId;
	   String custName;
    long custPhone;
   
	


public static void main(String[] args) {

	     Scanner s=new Scanner(System.in);
	     /*nextInt()\
	      * next()
	      * nextLine()
	      * nextFloat()
	      * nextDouble()
	      * 
	      * 
	      */
	     CustomerwithoutGetSet obj1;
		obj1=new CustomerwithoutGetSet();
		
		System.out.println(obj1.custId + " "+obj1.custName+ " "+obj1.custPhone);
		System.out.println("Enter customer name");
		String name=s.next();//"Ravi"
		System.out.println("Enter customer phone");
		long ph=s.nextLong();//123
		obj1.custName=name;
		obj1.custPhone=ph;
		/*obj1.setCustName(name);
		obj1.setCustPhone(ph);*/
		// 1 ravi 123
		System.out.println(++obj1.custId + " \t"+ obj1.custName+"\t "+obj1.custPhone);
		//System.out.println(++obj1.custId +" "+obj1.getCustName()+ " "+obj1.getCustPhone());
		
		CustomerwithoutGetSet obj2 =new CustomerwithoutGetSet();
	  System.out.println("Enter customer name");
		String name1=s.next();//ankit
		System.out.println("Enter customer phone");
		long ph1=s.nextLong();//678
		obj2.custName=name1;
		obj2.custPhone=ph1;
		System.out.println(++obj2.custId + " \t"+ obj2.custName+"\t "+obj2.custPhone);
	/*	obj2.setCustName(name1);
		obj2.setCustPhone(ph1);*/
		
		//System.out.println(++obj2.custId +" "+obj2.getCustName()+ " "+obj2.getCustPhone());
		
		
		
		CustomerwithoutGetSet obj3=new CustomerwithoutGetSet();
		System.out.println("Enter customer name");
		String name2=s.next();//subham
		System.out.println("Enter customer phone");
		long ph2=s.nextLong();//345
		obj3.custName=name2;
		obj3.custPhone=ph2;
		System.out.println(++obj3.custId + " \t"+ obj3.custName+"\t "+obj3.custPhone);
		/*obj3.setCustName(name2);
		obj3.setCustPhone(ph2);*/
		
		//System.out.println(++obj3.custId +" "+obj3.getCustName()+ " "+obj3.getCustPhone());
		
		


		
		
		

	}

}