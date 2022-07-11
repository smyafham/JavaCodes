package Inheritanceprgm4;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
System.out.println("Enter name");
Scanner s =new Scanner (System.in);
String name=s.nextLine();
System.out.println("Enter Annual Salary");
double sal=s.nextDouble();
System.out.println("Enter of starting work");
int year=s.nextInt();
System.out.println("Enter national insurance number");
String num=s.next();
Employee e1=new Employee(name, sal, year, num);

	}

}
