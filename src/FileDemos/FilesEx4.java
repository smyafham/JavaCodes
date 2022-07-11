package FileDemos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

class FlightPassInfo
{
	protected String Passenger;
	protected int PassengerPh;
	protected String flightName;
	protected double ticketPrice;
	public FlightPassInfo(String passenger, int passengerPh, String flightName, double ticketPrice) {
		super();
		this.Passenger = passenger;
		this.PassengerPh = passengerPh;
		this.flightName = flightName;
		this.ticketPrice = ticketPrice;
	}
	public String getPassenger() {
		return Passenger;
	}
	public int getPassengerPh() {
		return PassengerPh;
	}
	public String getFlightName() {
		return flightName;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
}
public class FilesEx4
{
	public static void main(String[] args) throws IOException
	{
		 OutputStream outs=null;

		FlightPassInfo[] fpi=new FlightPassInfo[3];
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the File name You Want to create ");
		String str=input.next();
		File fileobj=new File("Z://"+str+".txt");
		
		outs= new FileOutputStream(fileobj);
		
		fileobj.setReadable(true);
		fileobj.setWritable(true);
		
		if(fileobj.createNewFile())
		{
			System.out.println("File Created Successfully & " + " " + " File name is" + fileobj.getName());
		}
		else
		{
			System.out.println("File already Exist");
		}
		System.out.println("Can we Read the File: " + fileobj.canRead());
		System.out.println("Can we Write the File: " + fileobj.canWrite());
		System.out.println("The length of the File is: " + fileobj.length());
		
		for(int i=0;i<fpi.length;i++)
		{
			System.out.println("Enter the Passenger Name :");
			String pname=input.next();
			System.out.println("Enter the Passenger Phone :");
			int pp=input.nextInt();
			System.out.println("Enter the Flight Name :");
			String fn=input.next();
			System.out.println("Enter the Ticket Price :");
			double tp=input.nextDouble();
			FlightPassInfo fpinfo=new FlightPassInfo(pname,pp,fn,tp);
			fpi[i]=fpinfo;
			
		}
		for(int i=0;i<fpi.length;i++)
		{
			outs.write(fpi[i].getPassenger().getBytes());
			outs.write(" ".getBytes());
			String s2=String.valueOf(fpi[i].getPassengerPh());
			outs.write(s2.getBytes());
			outs.write(" ".getBytes());
			outs.write(fpi[i].getFlightName().getBytes());
			outs.write(" ".getBytes());
			String s3=String.valueOf(fpi[i].getTicketPrice());
			outs.write(s3.getBytes());
			outs.write("\n".getBytes());
		}
	}
}
