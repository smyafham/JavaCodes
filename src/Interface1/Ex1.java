package Interface1;
class fruit{
	String name;
	String taste;
	String size; 
  public void eat(){
	   System.out.println("The name of the fruit is fruit");
	   System.out.println("describe the taste");
   }
	
}

class Apple extends fruit{
	public void eat() {
		System.out.println("The name of the fruite is Apple");
		   System.out.println("it is juicy");
	}
}
class Orange extends fruit{
	public void eat() {
		System.out.println("The name of the fruite is orange");
		   System.out.println("its Taste is sour");
	}
}
public class Ex1 {

	public static void main(String[] args) {
    Orange o=new Orange();
    Apple a=new Apple();
    o.eat();
    a.eat();
    
 	}

}
