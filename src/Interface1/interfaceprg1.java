package Interface1;

/*
 * A  B
 *   C
 *B  C
 * 
 */
//we are using interface keyword to create  user defined interface
//we can not able to create object of interface
//login
interface A1
{
	int k=50;//public static and final
	//in interface all the methods are by default public and abstract
	// in interface all the variables are by default public static and final
	// we are using interface as the replacement of multiple inheritance
	//because java does not support multiple inheritance because of ambiguity
	void show1();
	
	
	
	
}
//reboot
interface B1
{
	
	void show2();
	
}
// Class is reponsable to implement behaviour of the interface
//
class C1 implements A1,B1
{
	public C1()
	 {
		super();
		 System.out.println("I am from C block");
	 }
	void show3()
	{
		System.out.println("bye");
	}
	
	public void show2() {

System.out.println("Showing the info of customer");
System.out.println("The value of K is" + " "+k);
		
	}
	
	public void show1() {
	
		System.out.println("Showing the info of Employee");
	}
	
}



public class interfaceprg1 {

	public static void main(String[] args) {
		C1 cObj=new C1();
cObj.show1();
cObj.show2();
cObj.show3();
	}

}