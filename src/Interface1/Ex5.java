package Interface1;
import java.util.Scanner;
interface loans
{
	public double issueloan();
}
interface insurances
{
	public double takeinsurance();
}
class Vehicles implements loans,insurances
{
	private String vehicleNumber;
    private String modelName;
    private String vehicleType;
    private double price;
    public Vehicles(String vehicleNumber, String modelName, String vehicleType, double price) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.modelName = modelName;
		this.vehicleType = vehicleType;
		this.price = price;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}	
	public double issueloan()
	{
		double il=0;
		if(vehicleType.equalsIgnoreCase("4Wheeler"))
		{
			return il=(price*0.8);
		}
		else if(vehicleType.equalsIgnoreCase("3Wheeler"))
		{
			return il=(price*0.75);
		}
		else if(vehicleType.equalsIgnoreCase("2Wheeler"))
		{
			return il=(price*0.5);
		}
		return il;
	}
	public double takeinsurance()
	{
		double ins=0;
		if(price<=150000)
		{	
			return ins=3500;
		}
		else if(price>150000 && price<=300000)
		{
			return ins=4000;
		}
		else if(price>300000)
		{
			return ins=5000;
		}
		return ins;
	}
}
public class Ex5
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the Vehicle Number");
		String Vnum=input.next();
		
		System.out.println("Enter the Vehicle ModelName");
		String model=input.next();
		
		System.out.println("Enter the Vehicle Type");
		String vType=input.next();
		
		System.out.println("Enter the Vehicle price");
		double cost=input.nextDouble();
	
		Vehicles v=new Vehicles(Vnum,model,vType,cost);
		
		double i=v.issueloan();
		double l=v.takeinsurance();
		
		System.out.println(i);
		System.out.println(l);
	}
}