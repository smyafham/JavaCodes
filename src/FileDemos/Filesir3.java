package FileDemos;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filesir3 {
public static void main(String[] args)
{
try {

   FileInputStream fin=new FileInputStream(new File("Z://Capture.jpg"));
   FileOutputStream fout=new FileOutputStream(new File("Z://newimg.jpg"));

       int content;
       while ((content = fin.read()) != -1) {
           fout.write(content);
        }

       System.out.println("Finished");
   } catch (IOException e) {
       e.printStackTrace();
   }
}

}
