package ArraysPrgms;
import java.util.Scanner;

	class Student
	{
		int[] marks;

		public int[] getMarks() {
			return marks;
		}

		public void setMarks(int[] marks) {
			this.marks = marks;
		}
		public int maxArray(int[] marks) {
			int max=0;
			
			for (int i=0;i<marks.length;i++) {
				if(marks[i]>max) {
					max=marks[i];
				}
			}
			return max;
		}
		public int sumArray(int[] marks) {
	int sum=0;
			
			for (int i=0;i<marks.length;i++) {
			sum=sum+marks[i];
							}
			return sum;
		}
	  }
	public class Prgm2Arrays{

		public static void main(String[] args) {
	   Student sObj=new Student();
	   Scanner s=new Scanner(System.in);
	   //[0][0][0][0][0]
	   //100,50,60,70,80
	   int[] m=new int[5];
	   System.out.println("Enter the marks of the students");
	   for(int i=0; i<m.length; i++)
	   {
		   //100 60
		m[i]=s.nextInt();   
		//System.out.println(m[i]);
	   }
	   //This will initialize the elements into array
	 sObj.setMarks(m);
		int[] result=sObj.getMarks();	
		for(int i=0; i<result.length; i++)
		{
			System.out.println(result[i]);
		}
			int max=sObj.maxArray(m);
			System.out.println("Maximun marks are :"+max);
			int sum=sObj.sumArray(m);
			System.out.println("sum of marks is :"+sum);
		}

	}

