package FileDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Filesir5 {
public static void main(String[] args)
{
try {
    //File file =new File("D://cpu.jpg");
	// InputStream in=new FileInputStream(file);
	
	File file =new File("Z://cpu.jpg");
	FileWriter writer=new FileWriter(file);
	FileOutputStream fout=new FileOutputStream(file);
	
	
	
   FileInputStream fin=new FileInputStream(new File("Z://cpu.jpg"));
   FileOutputStream fout1=new FileOutputStream(new File("Z://newimg1.jpg"));

       int content=fin.read();
       //write(byte[] b)
       //write(int b)
       while (content != -1) {
    	   System.out.println(content);
           fout1.write(content);
        }

       System.out.println("Finished");
   } catch (IOException e) {
       e.printStackTrace();
   }
}

}