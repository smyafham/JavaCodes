package LambaExpressions;
import java.lang.Math;
import java.util.Scanner;

public class p11 {

	public static void main(String[] args) {
	Scanner s =new Scanner (System.in);
	System.out.println("Enter x");
	int x=s.nextInt();
	System.out.println("Enter Y");
	int y=s.nextInt();
	p1 p=(a,b)->{	
		return  (int) Math.pow(a,b);
	};
	System.out.println(p.power(x, y));

	}


}
