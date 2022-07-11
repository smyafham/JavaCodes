package Interface1;

import java.util.Scanner;

interface Loan{
	 public double issueLoan();
}

interface Insurance{
	 public double takeInsurance();
}
 
 
 
class Vehicle implements Loan, Insurance{
	 private String vehicleNumber;
	 private String modelName;
	 private String vehicleType;
	 private double price;
	 
	public Vehicle(String vehicleNumber, String modelName, String vehicleType, double price) {
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
	
	
	public double issueLoan() {
		double rate;
		String wheel4="4wheeler";
		String wheel3="3wheeler";
		if(vehicleType.equalsIgnoreCase(wheel4)) {
			return rate=(price*0.8);
			 
		}
		else if(vehicleType.equalsIgnoreCase(wheel3)) {
			return rate=(price*0.75);
		}
		else{
			return rate=(price*0.5);
		}
		
		
	}
	public double takeInsurance() {
		double pri;
		if (price>300000) {
			return pri=5000;
		}
		else if (price>150000 && price<=300000) {
			return pri=4000;
		}
		else  {
			return pri=3500;
		}
	}
}
public class Ex3 {

	public static void main(String[] args) {
		//Vehicle v=new Vehicle(null, null, null, 0);
		Scanner s = new Scanner(System.in);
System.out.println("Enter Vehicle number");
String num=s.next();
//v.setVehicleNumber(num);
System.out.println("Enter Model name");
String mod=s.next();
//v.setModelName(mod);
System.out.println("Enter vehicle type as 4wheeler, 3wheeler or 2wheeler");
String type=s.next();
//v.setVehicleType(type);
System.out.println("Enter vehicle price");
double pric=s.nextDouble();
//v.setPrice(pric);

Vehicle v2=new Vehicle(num, mod, type, pric);
double r=v2.issueLoan();
double p=v2.takeInsurance();
System.out.println("Vehile name : "+v2.getVehicleNumber()+"\n"+ "Model name : "+v2.getModelName()+"\n"+"Vehile type : "+v2.getVehicleType()+"\n"+"Vehile price: "+v2.getPrice()+"\n"+"The eligible loan amount is "+r+"\n"+"The Insurance amount is: "+p);
	}

}
