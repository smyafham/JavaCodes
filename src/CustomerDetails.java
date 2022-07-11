import java.util.Scanner;



public class CustomerDetails {
 
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		CustomerDetails c1 = new CustomerDetails();
System.out.println("Enter your name");
   String name=s.next();

System.out.println("Enter age");
int age=s.nextInt();

System.out.println("Enter gender");
String gender=s.next();

System.out.println("Hailing from");
String city = s.next();

System.out.println("Welcome,"+" "+name+"!");
System.out.println("Age:"+age  );
System.out.println("Gender:"+gender  );
System.out.println("City:"+city  );



	}

}
