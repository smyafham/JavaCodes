package FileDemos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FilesEx3 {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader r=new FileReader("Z://readertest.txt");
		BufferedReader br=new BufferedReader(r);
		File f =new File("Z://readertest.txt");
		boolean t=	f.exists();
		if(t) {
			System.out.println("File Exists");
			String string =f.getName();
			System.out.println("File name : "+string);
			//System.out.println();
			String[] strings=	string.split("\\.");
			if(strings[1].equals("txt")) {
				System.out.println("This is a text file ");
			}
			else if(strings[1].equals("docs")) {
				System.out.println("This is a docs file");
			}
			else if(strings[1].equals("pdf")) {
				System.out.println("This is a pdf file");
			}
			else {
				System.out.println("This some other format file");
			}
			System.out.println("The size of the file is "+f.length()+"Bytes");
			// byte[] arr = new byte[(int)f.length()];
			//long l=FileUtils.sizeOf(f);
			//System.out.println(); 
			//System.out.println(f.length());

		}
		else {
			System.out.println("File does not exist");
		}

		//getFileSizeBytes(f);



	}

}
