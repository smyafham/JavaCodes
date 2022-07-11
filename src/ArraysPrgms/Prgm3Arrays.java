package ArraysPrgms;

import java.util.Scanner;


/*..Ram has passed in certain subjects and failed in a few. Write a program to count the no of subjects he passed in and the no of subjects he has failed in. Marks scored below 50 is considered as failed. If Ram has passed in all the subjects print "Ram passed in all subjects" and if failed print "Ram failed in all subjects".
Assume maximum size of array is 20

Sample Input 1:
Enter the no of subjects:
6
60
70
80
90
45
49

Sample Output 1:

Ram passed in 4 subjects and failed in 2 subjects */
public class Prgm3Arrays {

	public static void main(String[] args) {
		System.out.println("enter number of subjects");
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		if (n<=0||n>20) {
			System.out.println("Invalid input range");
		}
		else {
		int[] arr=new int[20];
		System.out.println("enter marks");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int pass=0,fail=0;
		for(int j=0;j<n;j++) {
			if(arr[j]>=50) {
				pass++;
			}
			else {
				fail++;
			}
		}
		System.out.println("Ram Passed in "+" " +pass+" "+"Subjects and failed in"+" "+fail+" "+"Subjects");
		}

	}

}
