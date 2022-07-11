package AbstractClassprgms;

import java.util.Scanner;

abstract class Employee{
	protected int employeeId;
	protected String employeeName;
    protected double salary;
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
	
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	public abstract void calculateSalary();
	
}

class PermanentEmployee extends Employee{
	

public PermanentEmployee(int employeeId, String employeeName) {
		super(employeeId, employeeName);
		// TODO Auto-generated constructor stub
	}


private	double basicPay;
public PermanentEmployee(int StringemployeeId, String employeeName, Double basicPay) {
	super(StringemployeeId, employeeName);
}


public double getBasicPay() {
	return basicPay;
}

public void setBasicPay(double basicPay) {
	this.basicPay = basicPay;
}

@Override
public void calculateSalary() {
	// TODO Auto-generated method stub
	double pf = basicPay * 0.12;
	salary = basicPay - pf;
	setSalary(salary);
}
}

class TemporaryEmployee extends Employee {
	public TemporaryEmployee(int employeeId, String employeeName) {
		super(employeeId, employeeName);
		// TODO Auto-generated constructor stub
	}
	private int hoursWorked ;
	private int hourlyWages;
	
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getHourlyWages() {
		return hourlyWages;
	}
	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}
	@Override
	public void calculateSalary() {
		salary = hoursWorked*hourlyWages;
		setSalary(salary);
	}
	
}
class Loan{
	public double calculateLoanAmount(Employee employeeObj) {
		
		if(employeeObj instanceof PermanentEmployee ) {
			return ((employeeObj.salary)*0.15);
		}
		else {
			return employeeObj.salary*.10;
		}
		
	}
}
public class Abstractprg2 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
System.out.println("Enter Employee Id");
int id=s.nextInt();
System.out.println("Enter Employee Name");
String name =s.next();
//System.out.println("Enter Salary");
//double sal=s.nextDouble();


//for permanent employee
System.out.println("Enter Employee type Permanent or Temporary");
String type=s.next();
//Employee emp ;
Loan l=new Loan();

if(type.equalsIgnoreCase("Permanent")) {
	System.out.println("Enter BasicPay");
	double bpay=s.nextDouble();
    

//emp=new PermanentEmployee(id, name);
PermanentEmployee empp=new PermanentEmployee(id, name, bpay) ;
empp.setBasicPay(bpay);
Employee emp=new PermanentEmployee(id, name,bpay);
empp.calculateSalary();
double lamt=l.calculateLoanAmount(empp);

System.out.println(empp.getSalary());
System.out.println("Employee Id "+empp.getEmployeeId()+"\n"+ "Employee Name "+empp.getEmployeeName()+"\n"+"Salary "+empp.getSalary()+"\n"+"Loan amount "+lamt);
	}
//for temporary employee
else if(type.equalsIgnoreCase("Temporary")){
	TemporaryEmployee emp2;
	emp2=new TemporaryEmployee(id, name);
	System.out.println("Enter hours Worked");
	int hrs=s.nextInt();
       emp2.setHoursWorked(hrs);  ;
	System.out.println("Enter hourly wages");
	int wages=s.nextInt();
	emp2.setHourlyWages(wages);
	emp2.calculateSalary();
	double lamt2=l.calculateLoanAmount(emp2);
	System.out.println("EmployeeId "+emp2.getEmployeeId()+"\n"+ "Employee Name "+emp2.getEmployeeName()+"\n"+"Salary "+emp2.getSalary()+"\n"+"Loan amount "+lamt2);

}
else {
	System.out.println("enter Employee type correctly");
}

	}

}
