import java.util.Scanner;

public class Divisibleby {
	
 static int	calculateSum(int n) {
	 int sum=0;
	 while(n>0)
	 {
		 if((n%3==0)||(n%5==0)) {
			 sum=sum+n;
			
		 }
		 n--;
	 }
	 return sum;
 }

	public static void main(String[] args) {
		
System.out.println("enter n");
Scanner s =new  Scanner(System.in); 
int n = s.nextInt();
System.out.println(calculateSum(n));
	}

}
