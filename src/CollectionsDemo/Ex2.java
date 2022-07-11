package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
public static ArrayList<Integer> A1,A2=new ArrayList<Integer>();;
public static ArrayList saveEvenNumbers(int n) {
	List arr1=new ArrayList();
	for (int i=0;i<=n;i++) {
		if(i%2==0) {
			arr1.add(i);
		}
	}
	
	return (ArrayList) arr1;
	
}

public static ArrayList printEvenNumbers(ArrayList<Integer> A1) {
	Integer res=0;
	//A2=new ArrayList<Integer>();
	for (int i=0;i<A1.size();i++) {
	   res = 2 *  A1.get(i);   
	   A2.add(res);
	   
	}
	System.out.print(A2);
	return A1;
	
}

public static int printEvenNumbers(int num) {
Iterator its=A1.iterator();
	for(int i=0;its.hasNext();i++) {
		if( A1.get(i)==num) {
			return num;
		}
	}
	return 0;
	
}


	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter N");
		int n=s.nextInt();
		 A1=  saveEvenNumbers(n);
		 System.out.println(A1);
		 //System.out.println(A1);
		 A2=printEvenNumbers(A1);
		 System.out.println("\nEnter the number that has to be serched ");
		 int nu=s.nextInt();
		 int num= printEvenNumbers(nu);
		 if(num==0) {
			 System.out.println("Number not exist");
		 }
		 else {
			System.out.println("The number exists and it is : " +num );
		}
		 
	}

}
