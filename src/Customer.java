import java.util.Scanner;

public class Customer {
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
	static int custId;
	String custName;
	long custPhone;
	public int getCustId() {
		return custId;
	}

	//write the data to the object
	//this is auto generated keyword which holds the address or refrence of currently running object
	//this is use to resolve the ambiguity between instance variable and parameterized variable when they have the same name
	
   public void setCustId(int id) {
		custId = id;
	}
  public String getCustName() {
		return custName;
	}


public void setCustName(String custName) {
		this.custName = custName;
	}

public long getCustPhone() {
		return custPhone;
	}

public void setCustPhone(long custPhone) {
		this.custPhone = custPhone;
	}


public static void main(String[] args) {

	     Scanner s=new Scanner(System.in);
	     
		Customer obj1=new Customer();
		System.out.println("Enter customer name");
		String name=s.next();
		System.out.println("Enter customer phone");
		long ph=s.nextLong();
		obj1.setCustName(name);
		obj1.setCustPhone(ph);
		
		System.out.println(++obj1.custId +" "+obj1.getCustName()+ " "+obj1.getCustPhone());
		
	 Customer obj2 =new Customer();
	  System.out.println("Enter customer name");
		String name1=s.next();
		System.out.println("Enter customer phone");
		long ph1=s.nextLong();
		obj2.setCustName(name1);
		obj2.setCustPhone(ph1);
		
		System.out.println(++obj2.custId +" "+obj2.getCustName()+ " "+obj2.getCustPhone());
		
		
		
		Customer obj3=new Customer();
		System.out.println("Enter customer name");
		String name2=s.next();
		System.out.println("Enter customer phone");
		long ph2=s.nextLong();
		obj3.setCustName(name2);
		obj3.setCustPhone(ph2);
		
		System.out.println(++obj3.custId +" "+obj3.getCustName()+ " "+obj3.getCustPhone());
		
		


		
		
		

	}

}