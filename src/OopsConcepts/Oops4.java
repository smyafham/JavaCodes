package OopsConcepts;

import java.util.Scanner;



class Employee{
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	

	public void calculateNetSalary(int pfpercentage) {
		// double x = (pfpercentage/100)*salary;
		 netSalary=(salary-(pfpercentage*salary/100));
		 System.out.println(netSalary);
		 setNetSalary(netSalary);
		 System.out.println("ID: "+getEmployeeId());
		 System.out.println("Name : "+getEmployeeName());
		 System.out.println("Salary : "+getSalary());
		 System.out.println("Net Salary : "+getNetSalary());
	}
}
public class Oops4 {
	private static OopsConcepts.Employee getEmployeeDetails() {

		Employee e1=new Employee();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter id:");
		int id =s.nextInt();
		System.out.println("Enter name:");
		String name = s.next();
		System.out.println("Enter Salary:");
		double salary =s.nextDouble();
		System.out.println("Enter PF percentage:");
		int pf=s.nextInt();
		e1.setEmployeeId(id);
		e1.setEmployeeName(name);
		e1.setSalary(salary);
		e1.calculateNetSalary(pf);
		return e1;
		
	}
	public static void main(String[] args) {
//Scanner s = new Scanner(System.in);
Employee e2=new Employee();

//Employee e1=new Employee();
//Employee e2 = getEmployeeDetails();
		e2 = getEmployeeDetails();

	}

	
	
	

}

/*Program with defination
 * 
 * import java.util.Scanner;

class Employee1{
	private int  employeeId;
	private String employeeName;
	private  double salary;
	private  double netSalary;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	public void calculateNetSalary(float pfpercentage) {
		double pfAmount= salary * (pfpercentage/100);
		netSalary=salary - pfAmount;
	}
	
	
	
}
public class EmpSalPf {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        Employee1 emp = new Employee1();

		        System.out.println("enter employee id");
		        int eId=sc.nextInt();
		       
		        System.out.println("enter employee name");
		        String eN=sc.next();
		        System.out.println("");
		        System.out.println("salary");
		        double eSal=sc.nextDouble();
		        System.out.println("pf percent");
		        float ePf=sc.nextFloat();
		        emp.setEmployeeId(eId);
		        emp.setEmployeeName(eN);
		        emp.setSalary(eSal);
		        emp.calculateNetSalary(ePf);
		        System.out.println("\n Id: "+emp.getEmployeeId()+"\n emp name: "+emp.getEmployeeName()
		                                +"\n salary: "+emp.getSalary()+"\n netsalary: "+emp.getNetSalary());
		        
		        
	}
	}*/
