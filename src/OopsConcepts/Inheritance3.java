package OopsConcepts;


class Parent{
	public Parent() {
		String par= "This is parent variable";	
	System.out.println(par);	
	}
	
}
class Child extends Parent{
	
	Child(){
		String par="This is child variable";
		System.out.println(par);
		
	}
}
public class Inheritance3 {

	public static void main(String[] args) {
		new Child();

	}

}
