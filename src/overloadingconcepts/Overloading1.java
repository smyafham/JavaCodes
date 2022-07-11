package overloadingconcepts;
/*
 * display()
 * {
 * all info of employee
 * }
 * display()
 * {
 * all info of web developer
 * }
 * 
 * Compile time polymorphisam 
 *   we can implement using method overloading
 *   In case of method overloading method name should me same but parameter type or sequence of parameterr will be different
 *   static methods also can be overloaded 
 *   final methods can also be overloaded
 * Runtime polymorphisam
 *  we can implement using method overriding
 * 
 * 
 * 
 */

class Employee
{
	
final int k=100;
	//doLogin for Manager
	public final int doLogin(String email)
	{
		//k=k+20;
		//System.out.println(k--);
		if(email.equals("admin@gmail.com"))
		{
			return 1;
		}
		return 0;
		
	}
	//doLogin for employee
	public final  boolean doLogin(int  empId)
	{
		if(empId==123)
	{
		return true;
	}
	return false;
		
	}
}
public class Overloading1 {

	public static void main(String[] args) {
Employee e=new Employee();
  if( e.doLogin(123))
  {
	  System.out.println("You are valid employee");
	  
  }
  else
  {
	  System.out.println("You are not vaklid employee");
  }
	
  if(e.doLogin("admin@gmail.com")==1)
  {
     System.out.println( "you are valid admin");
  }
  else
  {
	  System.out.println("not valid emmployee");
  }

	}

}