package FileDemos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Reader;
/*
 * LineNumberReader line=new LineNumberReader(new FileReader("src/Nov3Batch1.txt"));
System.out.println(line.getLineNumber());
int data = line.read();
line.re
int lineNumber=0;
while(data != -1){
    char dataChar = (char) data;
    data = line.read();
     lineNumber = line.getLineNumber();
   
}
System.out.println(lineNumber);
 */
public class FilesEx2 {

	public static void main(String[] args) throws IOException {
	//	Reader r=new FileReader("Z://readertest.txt");
		LineNumberReader ln = new LineNumberReader(new FileReader("Z://readertest.txt"));
			//int lineNumber=0;
		//BufferedReader br=new BufferedReader(r);
		int count=0 ;

		
		while((count=ln.read())!=-1) {
			String line= ln.readLine();
			//lineNumber++;
		System.out.println(line);
		
		System.out.println(ln.getLineNumber());
		
		}
		
		}

	}


