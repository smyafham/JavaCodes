package Inheritanceprgm4;

public class Employee extends Person{
	double annualSalary;
	int startYear;
	String insuranceNum;
	public Employee(String name,double annualSalary,int startYear,String insuranceNum) {
		super(name);
		this.annualSalary=annualSalary;
		this.startYear=startYear;
		this.insuranceNum=insuranceNum;
		System.out.println("Annual Salary is :"+annualSalary);
		System.out.println("Starting year of work : "+startYear);
		System.out.println("Insurance number is : "+insuranceNum);
	
	
	}
}
