package test2;
import java.util.Scanner;

import test1.Student;
public class TestStudent {
	public static void main(String[] args) {
		   Student stud1=new Student();
		   //stud.setStudentId(100);
		  int id= stud1.getStudentId();
	
		   Scanner s = new Scanner(System.in);
		   System.out.println("enter student name");
		   String studentName = s.next();
		   System.out.println("Enter marks");
		   int marks=s.nextInt();
		   stud1.setStudentName(studentName);
		   stud1.setMarks(marks);
			System.out.println( id + " "+stud1.getStudentName()+ " "+stud1.getMarks());

			 Student stud2=new Student();
			   //stud.setStudentId(100);
			  int id2= stud2.getStudentId();
			
			   System.out.println("enter student name");
			   String studentName2 = s.next();
			   System.out.println("Enter marks");
			   int marks2=s.nextInt();
			   stud2.setStudentName(studentName2);
			   stud2.setMarks(marks2);
				System.out.println( ++id + " "+stud2.getStudentName()+ " "+stud2.getMarks());

				 Student stud3=new Student();
				   //stud.setStudentId(100);
				  int id3= stud3.getStudentId();
	
				   System.out.println("enter student name");
				   String studentName3 = s.next();
				   System.out.println("Enter marks");
				   int marks3=s.nextInt();
				   stud3.setStudentName(studentName3);
				   stud3.setMarks(marks3);
					System.out.println(++id + " "+stud3.getStudentName()+ " "+stud3.getMarks());


			}

}
