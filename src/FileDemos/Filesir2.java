package FileDemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
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

public class Filesir2 {

	public static void main(String[] args)   {
		//"abc" "100"
		//FileOutputStream(String filepath)throws FileNotFoundException
		//FileoutputStream(String filepath, boolean append)throws FileNotFoundException
		//FileoutputStream(File file)throws FileNotFoundException
		//FileoutputStream(File file, boolean appned)
		//FileOutputStream(FileDescriptor file)
		try
		{
   OutputStream out=new FileOutputStream("Z://Nov3Batch1.txt",true);
   System.out.println("File Created in E drive");
   Scanner scanner =new Scanner(System.in);
   System.out.println("Write your feedback");
   String msg=scanner.nextLine();//"Good" bad 
   //toString()
   //String.valueOf(int k);--String
   //getBytes[] byte[] we can conevert entire string into byte arrat
   //write(byte[] b)throws IOException
   //write(int b)throws IOException
   //write(byte[] b, int fromindex, int length)
   //\n to new line 
   out.write("\n".getBytes());
  byte[] b=    msg.getBytes();
   out.write(b);
   out.write(" ".getBytes());
   System.out.println("feedback added to file");
   //FileInputStream(String filePath)throws FileNotFoundException
   //FileInputStream(File file)throws FileNotFoundException
   //FileInputStream(FileDescriptor fd)throws FileNotFoundException
   InputStream input=new FileInputStream("Z://Nov3Batch1.txt");
   System.out.println(input.available());
   int count=0;
   //read() --int
   //read(byte[] b)-- int
   // count=input.read(); //if no bytes will be available then this read will return -1
   while((count=input.read())!=-1)
   {
	   // () type cast operator
	   // double d=189755.98765;
	   //int k=(int)d;
	   // k=189755
	   System.out.print((char)count);
   }
		}catch (IOException e) {

System.out.println("kindly check your file" + e);
		}
   
	}
	
	

}