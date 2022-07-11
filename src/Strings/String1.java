package Strings;

public class String1 {

	/*
	 * String in java is immutable class or non-editable class
	 * customer name="Ravi"
	 * char[] ch={'R' , 'a' 'v', 'i'}
	 * customer address
	 * customer pan
	 * customer email
	 * using string literal
	 * String name="Ravi"
	 * String name1="Ravi"
	 * String str=new String("Ravi")
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
     String name1="ravi";//105
     String name2="abc";//105
     //Object
     System.out.println(name1.hashCode() + " "+name2.hashCode());
     if(name1==name2)
     {
    	 System.out.println("Both references are same");
    	
     }
     else
     {
    	 System.out.println("not same");
     }
     
     

	}

}