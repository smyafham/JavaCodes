package ArraysPrgms;

import java.util.Scanner;


public class Progm6Arrays {
static int getBigDiff(int[] arr) {
	int diff=0,low=arr[0],max=arr[0];
	for(int i=1;i<arr.length-1;i++) {
		if(low >arr[i]) {
			low=arr[i];
					
		}
		if(max<arr[i]) {
			max=arr[i];
		}
	}
	diff=max-low;
	return diff;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter array Size >= 1");
Scanner s = new Scanner(System.in);
int n=s.nextInt();
System.out.println("enter array");
int[] arr=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=s.nextInt();
}

int diff=getBigDiff(arr);
System.out.println("The Difference between greatest number and smallest number is "+ diff);
	}

}
