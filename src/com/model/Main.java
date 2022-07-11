package com.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.dao.CustomerDAO;

public class Main {

	public static void main(String[] args) throws IOException {
		OutputStream op=new FileOutputStream("Z://CustomerReport.txt");

		CustomerDAO cDao=new CustomerDAO();
		System.out.println("Starting Write Process");
		cDao.writeCutomerToFile(op);
		
		System.out.println("Starting Read");
		
		cDao.readCustomerFromFile("Z://CustomerReport.txt");

	}

}
