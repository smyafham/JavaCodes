package com.service;

import java.io.IOException;
import java.io.OutputStream;

public interface CustomerService {
	public void writeCutomerToFile(OutputStream output)throws IOException;
	public void readCustomerFromFile(String filePath)throws IOException;

}