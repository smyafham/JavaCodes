package t1;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;


public class CustomerDAO implements CustomerService {

	@Override
	//FileOutputStream
	public void writeToFile(OutputStream output) throws IOException {
    Customer[] custObj=new Customer[3];
    Scanner scanner=new Scanner(System.in);
     for(int i=0; i<custObj.length ; i++)
     {
    	 System.out.println("Enter name");
    	 String name=scanner.next();
    	 System.out.println("Enter phone");
    	 long ph=scanner.nextLong();
    	 System.out.println("Enter email");
    	 String email=scanner.next();
    	 Customer cust=new Customer(name, ph, email);
    	 //obj1--name, ph, email
    	 custObj[i]=cust;
    	
    	 
    	 
    	 
    	 
     }
     for(int i=0; i<custObj.length; i++)
     {
    	 /*String name=custObj[i].getCname();
    	 byte[] n=name.getBytes();
    	 output.write(n);*/
    	 //name phone email 
    	 
    	 output.write(custObj[i].getCname().getBytes());
    	 output.write(" ".getBytes());
    	 String phone=String.valueOf(custObj[i].getCphone());
    	 
    	 output.write(phone.getBytes());
    	 output.write(" ".getBytes());
    	 output.write(custObj[i].getCemail().getBytes());
    	 output.write("\n".getBytes()); 
     }
     //Implementing Serialization
		FileOutputStream fout=new FileOutputStream("Z://myencdata.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		for(int i=0; i<custObj.length; i++)
	     {

         out.writeObject(custObj[i]);
	    	 
	    	
	     }
		out.close();
		
	}

	@Override
	public void readFromFile(String filePath) throws IOException, ClassNotFoundException{
    //upcasting
		//super class ref=sub class object
		InputStream in=new FileInputStream(filePath);
int k=0;
while((k=in.read())!=-1)
{
System.out.print((char)k);	
}
FileInputStream fin1=new FileInputStream("Z://myencdata.txt");
ObjectInputStream in1=new ObjectInputStream(fin1);
//downcasting
//subclass ref=super type object
//double d=90.678668;
//int a=(int)d;
Customer customer=(Customer)in1.readObject();

	System.out.println(customer.getCname() + " "+customer.getCphone() +" "+customer.getCemail());	
	}

}