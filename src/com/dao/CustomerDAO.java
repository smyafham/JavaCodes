package com.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.model.Customer;
import com.service.CustomerService;

public class CustomerDAO implements CustomerService
{

	@Override
	public void writeCutomerToFile(OutputStream op) throws IOException {
		Customer cs=new Customer("Adja32", "Afham" , "879254584", "afham@gmail.com");
		String str,str1,str3;
		str=cs.getCustomerId();
		str1=cs.getCustomerName();
		String str2=cs.getCustomerPhone();
		//long a= cs.getCustomerPhone();
		//String.valueOf(a);
		str3=cs.getCustomerEmail();
		byte[] b=str.getBytes();
		byte[] b1=str1.getBytes();
		byte[] b2=str2.getBytes();
		byte[] b3=str3.getBytes();
		
        op.write(b);
        op.write(" ".getBytes());
        op.write(b1);
        op.write(" ".getBytes());
        op.write(b2);
        op.write(" ".getBytes());
        op.write(b3);
        op.write(" ".getBytes());
        System.out.println("Written successfully");
        
		//output.write();
	}

	@Override
	public void readCustomerFromFile(String filePath) throws IOException {
		InputStream ip=new FileInputStream("Z://CustomerReport.txt");
		System.out.println(ip.available());
		int count=0;
		   //read() --int
		   //read(byte[] b)-- int
		   // count=input.read(); //if no bytes will be available then this read will return -1
		   while((count=ip.read())!=-1)
		   {
			   // () type cast operator
			   // double d=189755.98765;
			   //int k=(int)d;
			   // k=189755
			   System.out.print((char)count);
		   }
	}

}
