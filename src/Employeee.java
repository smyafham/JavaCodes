
import java.util.Scanner;

public class Employeee {
	
	
	
	 void printEmployeeInfo(int id, String name, long ph, double salary)
	{
		System.out.println(id + " "+name+ " "+ph+ " "+salary);
	}

	public static void main(String[] emp) {
		// java Employee "100" "xyz"  "12344"  "67800.00" 
		/*
		 * int---- Integer 
		 * 
		 * static int pareseInt(String str)
		 * {
		 * return str.intValue();
		 * }
		 * 
		 */
		//"100"---100
     /* int id=Integer.parseInt(emp[0]);
      String name=emp[1];
      long ph=Long.parseLong(emp[2]);
      double salary=Double.parseDouble(emp[3]);
     */
		 Employee e=new Employee();
		Scanner  scanner=new  Scanner(System.in);
		System.out.println("Enter the employee id");
		//nextInt() is instance method of Scanner class
		//which is used to read interger from console
		int id=scanner.nextInt();
		System.out.println("Enter name");
		String name=scanner.next();
		System.out.println("Enter phone");
		long phone=scanner.nextLong();
		System.out.println("Enter salary");
		double salary=scanner.nextDouble();
		
		
		
     e. printEmployeeInfo(id, name, phone, salary);

	}

}