package FileDemos;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Filesir4 {

	public static void main(String[] args) throws IOException {
		//OutPutStream output=new FileOutPutStream()
		//FileWriter writer =new FileWriter(new File("D"//abc.txt");
		Writer write=new FileWriter("Z://WriterTest.txt", true);
		 BufferedWriter bw=new BufferedWriter(write);
		 bw.write("Hello world");
		 bw.write(" ");
		 bw.write("Hi");
		 bw.close();
		 Reader reader=new FileReader("Z://Nov3Batch22.txt");
		 BufferedReader br=new BufferedReader(reader);
		 String line=br.readLine();
		 System.out.println(line);
		 
		

	}

}