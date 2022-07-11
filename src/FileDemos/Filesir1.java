package FileDemos;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

/*
 * int a=20;//single data
 * enum
 * int[] a1={10,20,40,50,70}//5 limited and similar type of data
 * Collection--store//unlimited different types data
 * 
 * 
 * File--
 * DB server
 *                java.io
 *                
 *                1. output stream ---System.out
 *                2. System.in--input stream
 *                3. System.err--error stream
 *                
 *                
 *                OutputStream<class>            InputStream<class>
 *                   |                              |
 *                   
 *                   FileOutStream<class>        FileInputStream<class>
 * 
 * 
 * 
 * FileOutStream(String filepath)throws FileNotFoundException
 * {
 * 
 * 
 * }
 * 
 * 
 */

public class Filesir1 {

	public static void main(String[] args) throws IOException {
		//"abc" "100"
		//FileOutputStream(String filepath)throws FileNotFoundException
		//FileoutputStream(String filepath, boolean append)throws FileNotFoundException
		//FileoutputStream(File file)throws FileNotFoundException
		//FileoutputStream(File file, boolean appned)
		//FileOutputStream(FileDescriptor file)
   OutputStream out=new FileOutputStream("Z://Nov2Batch1.txt",true);
   System.out.println("File Created in Z drive");
   Scanner scanner =new Scanner(System.in);
   System.out.println("Write your feedback");
   String msg=scanner.nextLine();//"Good" bad 
   //toString()
   //String.valueOf(int k);--String
   //getBytes[] byte[] we can conevert entire string into byte arrat
   //write(byte[] b)
   //write(int b)
   //write(byte[] b, int fromindex, int length)
   //\n to new line 
   out.write("\n".getBytes());
  byte[] b=    msg.getBytes();
   out.write(b);
   out.write(" ".getBytes());
   System.out.println("feedback added to file");
   out.close();
   System.out.println("File closed ");
	}
	

}
