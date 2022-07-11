
import java.util.Scanner;

public class TestStatement2 {

	public static void display1()
	{
		System.out.println("Please STOP");
	}
	
	public static void main(String[] args) {
  Scanner scanner=new Scanner(System.in);
System.out.println("Enter the color");
String color=scanner.nextLine();
//int, short, byte, char, string, boolean
switch (color) {
case "red"://System.out.println("STOP");
	display1();
	
	break;
case "green":System.out.println("GO");
break;


default: System.out.println("not matching");
	break;
}
		
		

	}

}