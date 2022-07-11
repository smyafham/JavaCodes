package FileDemos;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Bank implements Serializable
{
	private String customerName;
    private long accountNumber;
	private int pinCode;
	private long phoneNumber;
	//set() methods
	//parameterized constructor
	public Bank(String customerName, long accountNumber, int pinCode, long phoneNumber) {
		super();
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.pinCode = pinCode;
		this.phoneNumber = phoneNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public int getPinCode() {
		return pinCode;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	
}
class BankBO
{
	//Serialization is technique to convert to object status into byte stream
	//Hibernate, RMI
	//ObjectOutputStream 
	//writeObject
	
	/*
	 * client      server
	 * File
	 * 
	 * serialize    deserialize
	 * 
	 * 
	 */
	public static void doSerialization() throws IOException, ClassNotFoundException 
	{
		//OutputStream out=new FileOutputStream(Staing path);
		FileOutputStream fout=new FileOutputStream("Z://mySerlizaedInfo.txt");
		//ObjectOutputStream(OutputStream out)throws IOException
		ObjectOutputStream out=new ObjectOutputStream(fout);
		
		//BufferedReader(object of InputStreamReader(InputStream)
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter customer name");
        String name=br.readLine();
        System.out.println("Enter customer account number");
        long acn=Long.parseLong(br.readLine());
		
        System.out.println("Enter pin code");
        int pinCode=Integer.parseInt(br.readLine());
        System.out.println("Enter phone number");
        long ph=Long.parseLong(br.readLine());
        
        Bank bankObj=new Bank(name, acn, pinCode, ph);
        
        out.writeObject(bankObj);

        System.out.println("Data has been serialized");
        
	
	}
	public static  void doDeserialization() throws IOException, ClassNotFoundException
	{
	
		//FileInputStrem
		//ObjectInputStream
		FileInputStream fin=new FileInputStream("Z://mySerlizaedInfo.txt");
		ObjectInputStream in=new ObjectInputStream(fin);
		//readObject()---Object
		//Bank b=object
	Bank b=(Bank)	in.readObject();
	System.out.println(b.getCustomerName() + " "+b.getAccountNumber() + " "+b.getPinCode() + " "+b.getPhoneNumber());
		
		
	}
	
}

public class Filesir6 {

	public static void main(String[] args) {

try {
	BankBO.doSerialization();
	BankBO.doDeserialization();
} catch (IOException e) {
	// TODO Auto-generated catch block

System.out.println(e);
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}