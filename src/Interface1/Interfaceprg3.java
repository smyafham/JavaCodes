package Interface1;

//In class we can able to define constructors but in interface we can not able to define constructor
//in class the members are by default uses default access specifier
//but in interface all the members are by default public
//In class methods are not by default abstract but in interface methods are by default abstract
//in  class variables are not by default static and final but in interfcae the variables are by default final and static
//we are using interface keyword to create user defined interface
//we are using class keyword to create user defined class
//class is reponsable to implement the behaviours of interfaces

//provide service for customer data
interface Service1
{
	//public static and final
	long accountNumber=123456;
	
	//public and abstract
	void getService1();
	
	
}
//providing service on customer's order
interface Service2
{
	
	//double amt=10000.00;
	double doWithdraw(double amt);
	
	
}

//which wants to use those two services
//if the class will implements the interfaces then that class must have to override all the unimplemented method of interfaces
class MainServer implements Service1, Service2
{
	double amt=10000.00;
//In case method overriding the method name must be same
	//the method parameter type or sequence of parameter must be same
	// the return of the method must be same
	@Override
	public double doWithdraw(double amt) {
		this.amt=this.amt-amt;
		return this.amt;
	}

	@Override
	public void getService1() {

System.out.println("Your account number is" + " "+Service1.accountNumber);
	}
	
	
}


public class Interfaceprg3 {

	public static void main(String[] args) {

MainServer m=new MainServer();
System.out.println("Your balance is " + " "+m.doWithdraw(500));
m.getService1();


	}

}
