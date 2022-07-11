package t1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Driver1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//CustomerDAO dao1=new CustomerDAO();
		//CustomerDAOUSA  cust1=new Cust
		//
 CustomerService service;
 service=new CustomerDAO();
 
 OutputStream out = null;
try {
	out = new FileOutputStream("Z://myFile.txt");
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 service.writeToFile(out);
	service.readFromFile("Z://myFile.txt");	
	
	}

}