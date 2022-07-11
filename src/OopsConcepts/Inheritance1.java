package OopsConcepts;

//Multi level inheritance
/*
* A
* |
* B
* |
* C
* 
* A
* |\
* B C 
* 
*/

class A
{
	
	A()
	{
		System.out.println("Hi");
	}
}
class B extends A
{
	B()
	{
		super();
		System.out.println("Hello");
	}
}
class C extends A
{
	C()
	{
		super();
		System.out.println("bye");
	}
}


public class Inheritance1 {

	public static void main(String[] args) {

new C();
new B();

	}

}