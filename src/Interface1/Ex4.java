package Interface1;

import java.util.Scanner;

interface PhysicalConstants{
	double C=299792458;//speed of light m/s
	double pov=-11;
	double base=6.674;
	double G=Math.pow(base, pov);//Gravitional constant m3kg-1s-2
	double g=9.80665;//standard Gravitional Acceleration
}
public class Ex4 implements PhysicalConstants {

	public static void main(String[] args) {

System.out.println("enter");Scanner s=new Scanner(System.in);

double p=s.nextDouble();
System.out.println(p*9.2);
System.out.println(G);
	}

}
