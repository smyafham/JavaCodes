package Interface1;

interface SalaryCalculator
{
	
	public double calculateSalary(double basicPay, double hra, double ma,double pf, double tds);
}
class CapgeminiUSA implements SalaryCalculator
{

	@Override
	public double calculateSalary(double basicPay, double hra, double ma, double pf, double tds) {
		// TODO Auto-generated method stub
		return (basicPay+hra+ma)-(pf+tds);
	}
	
}
class CapIndia implements SalaryCalculator
{

	@Override
	public double calculateSalary(double basicPay, double hra, double ma, double pf, double tds) {
		// TODO Auto-generated method stub
		 return (basicPay+hra+ma)-(pf+tds);
	}
	
}
public class Interfaceprg2 {

	public static void main(String[] args) {
		//Creating reference of interface
   SalaryCalculator sc;
   //initializing the object of classes
   sc=new CapgeminiUSA();
  double amt1= sc.calculateSalary(150000.00,2000, 1000, 500, 10000);
  System.out.println("The salary for usa emp is"+ " "+amt1); 

  sc=new CapIndia();
  double amt2= sc.calculateSalary(8000.00,5000, 2000, 700, 50000);
  System.out.println("The salary for india emp is"+ " "+amt2); 

	}

}
