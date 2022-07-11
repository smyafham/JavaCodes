package AbstractClassprgms;

//If a class will contain atleast one method as abstract then that class will became a abstrcat class
//we are declaring abstract class using abstrcat keyword
//The abstrcat class dependent on the sub classes to implement it's unimplemented or abstract method
//we can not able to instantiate the abstract class
class A33
{
double pin[]= {123,456,678};	
}
interface Ser1
{
 void show();
	default void getStart()
	{
		System.out.println("start server....");
	}
	
}

interface Serv2 extends Ser1
{
	default void shutDown()
	{
		System.out.println("shut down server....");
	}
	
}
//one abstract class can implement many interfaces
//interface can not able to implement any class or abstract class
abstract class RBI  extends A33 implements Serv2 
{
	//varible
	double amount=5000.00;
	//defining one constructor to print welcome msg
	public RBI()
	{
		System.out.println("Welcome to RBI");
	}
	//method defined or implemented
	//this method allowing customer to deposit money
	public double deposit(double amount)
	{
		this.amount=this.amount+amount;
		return this.amount;
	}
	//declaring one abstract method
	abstract boolean getBanking(RBI rbi);
	abstract double getLoanRate();
	
	
}
class SBI  extends RBI
{

	@Override
	boolean getBanking(RBI rbi) {

     if(rbi instanceof SBI)
     {
    	 return true;
     }
		return false;
	}

	@Override
	double getLoanRate() {


		return 8.0;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}
class  HDFC extends RBI
{

	@Override
	boolean getBanking(RBI rbi) {

     if(rbi instanceof HDFC)
     {
    	 return true;
     }
		return false;
	}

	@Override
	double getLoanRate() {


		return 12.5;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}
/*class PNB
{
	RBI r;
	
	void display(RBI r)
	{
		this.r=r;

   System.out.println(r.deposit(2000));
	}
}*/
public class Abstractprg1 {

	public static void main(String[] args) {

RBI rbi = null;


rbi=new SBI();
 double amt =rbi.deposit(1000.00);
 System.out.println(amt);
  boolean b= rbi.getBanking(rbi);
 if(b)
 {
	 System.out.println("SBI is one of the valid bank under RBI");
 }
 else
 {
	 System.out.println("It is not a valid bank");
 }
 System.out.println("The loan rate  for SBI is " + " "+rbi.getLoanRate());
rbi=new HDFC();

boolean b1=rbi.getBanking(rbi);
if(b1)
{
	 System.out.println("HDFC is one of the valid bank under RBI");
}
else
{
	 System.out.println("It is not a valid bank");
}
System.out.println("The loan rate for HDFC is" + " "+rbi.getLoanRate());

rbi.getStart();
rbi.shutDown();
/*PNB p=new PNB();
p.display(rbi);*/
	}

	
}
