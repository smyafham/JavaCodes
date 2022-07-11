package OopsConcepts;


import java.util.Scanner;

/*
 * A
 * |
 * B
 * 
 * 
 * 
 * 
 */
//Base class or Super class
class Mobile
{
	String brand;
	public Mobile()
	{
		System.out.println("Welcome to Mobile world");
	}
	public Mobile(String brand)
	{
		this.brand=brand;
	}
	public void doCall()
	{
		System.out.println("Calling.....");
	}
	public void doSMS()
	{
		System.out.println("Texting.....");
	}
	public void displayBrandName()
	{
		System.out.println("The brand name is"+ " "+brand);
	}
	
}
//child class of Mobile
//IS -A
class SmartPhone extends Mobile
{
	int memory;
	int cameraConfig;
	public SmartPhone()
	{
		//super();
		System.out.println("welcomr to smart phone world");
	}
	//sumsung, 10 5
	public SmartPhone(String brand, int memory, int cameraConfig)
	{
		//System.out.println("hi");
		//super is function which is used to call the super class constructor from the child class
		//by using this super function we can initialize the properties of super class from child class
		//super call for constructor alawways should be the first statement of the constructor block
		super(brand);
		this.memory=memory;
		//super(brand);
		this.cameraConfig=cameraConfig;
	}
	/*public SmartPhone(String msg)
	{
		System.out.println(msg);
	}*/
	void wifi()
	{
		System.out.println("wifi feature is available");
	}
	void playMusic()
	{
		System.out.println("You can play music");
	}
	
	public void displaySmartPhoneDetails()
	{
		System.out.println("The memory capacity"+ " "+memory);
		System.out.println("Camera configuration"+ " "+cameraConfig);
	}
	
	
}

public class Inheritance2 {

	public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter brand name");
    String brandName=scanner.nextLine();
    System.out.println("Enter memory capacity");
    int mc=scanner.nextInt();
    System.out.println("Enter the camera config");
    int cc=scanner.nextInt();
    SmartPhone sm2=new SmartPhone();
    SmartPhone sm=new SmartPhone(brandName, mc, cc);
    sm.doCall();//Mobile
    sm.doSMS();//mobile
    sm.displayBrandName();//mobile
    sm.displaySmartPhoneDetails();//smartphone
     sm.playMusic();//smartphone
     sm.wifi();//smartphone
    

	}

}