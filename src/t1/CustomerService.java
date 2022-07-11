package t1;

import java.io.IOException;
import java.io.OutputStream;

public interface CustomerService {

	//writeToFile(FileOutputStream fout)
	//output
	void writeToFile(OutputStream output)throws IOException;
	void readFromFile(String filePath)throws IOException,ClassNotFoundException;
	
}