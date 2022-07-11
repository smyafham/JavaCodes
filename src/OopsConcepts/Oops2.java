package OopsConcepts;
import java.util.Scanner;

//service component
//will run duffernet servcer
//ip-10.20.56.80
class CustomerServices
{
	static String[] userList= {"amit", "ravi", "xyz","abc"};
	static String[] pinCode= {"ABC123", "XYZ345", "123445", "789"};
	public boolean doLogin(String username, String pinCode)
	{
		for(int i=0; i<4; i++)
		{
			if(userList[i].equalsIgnoreCase(username) && this.pinCode[i].equals(pinCode))
			{
				return true;
			}
		}
		return false;
	}
	
}
class Customers
{
	/*
	 * constructor is one of the special member of the class which has same name as the class name
	 *defination of default constructor or non -parameterized cosntructor
	 *constructor does not have any return type
	 *main use of the constructor to initialize the object of a class into heap memory
	 *we can also cosntructor explicitly to initialize the properties of the class
	 *we can diplay messages from the block of constructor
	 *constructor can use any access specifier
	 *public, private, protected , default
	 * Customer()
	 * {
	 * 
	 * }
	 * 
	 * Customer(int a, int b)
	 * {
	 * this.a=a;
	 * this.b=b;
	 * }
	 * 
	 * 
	 * 
	 */
	
	
	String customerName;
	String pincode;
	long phone;
	String emailId;
	//HAS-A relationship
	//Customer has refernce of Customer service
	//Custeomr class is responsable to initialize the object of CustomerService into service reference
	CustomerServices service;
	
	public Customers()
	{
		System.out.println("Welcome to Customer Portal");
	}
	
	
	
	
	
	
	public Customers(String customerName, String pincode, long phone, String emailId, CustomerServices service) {
		
		this.customerName = customerName;
		this.pincode = pincode;
		this.phone = phone;
		this.emailId = emailId;
		this.service = service;
	}




/*

	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public CustomerService getService() {
		return service;
	}
	public void setService(CustomerService service) {
		this.service = service;
	}
	
	*/
	public void checkCustomer()
	{
	
		boolean b=service.doLogin(customerName, pincode);
		if(b)
		{
			System.out.println("You are valid customer ");
			System.out.println(customerName + " "+emailId + " "+phone);
		}
		else
		{
			System.out.println("You are not valid");
		}
	}
	
	
	
	
}

//Driver class
public class Oops2 {

	public static void main(String[] args) {
		Customers c1=new Customers();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter customer name");
		String cName=scanner.next();
		System.out.println("Enter customer pincode");
		String pin=scanner.next();
		System.out.println("Enter customer email");
		String cEmail=scanner.next();
		System.out.println("Enter customer phone");
	    long ph=scanner.nextLong();
	   
	    
	    
	    
	   /* c1.setCustomerName(cName);
	    c1.setEmailId(cEmail);
	    c1.setPincode(pin);
	    c1.setPhone(ph);*/
		
	    CustomerServices cs=new CustomerServices();
	    Customers c2=new Customers(cName, pin, ph, cEmail, cs);
	    //c1.setService(cs);
	    c2.checkCustomer();
		
	}

}