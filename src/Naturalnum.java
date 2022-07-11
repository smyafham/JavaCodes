import java.util.Scanner;

public class Naturalnum {

	public static void main(String[] args) {
		 System.out.println("Enter n");
		    Scanner s = new Scanner(System.in);
		    int n = s.nextInt();
		    int sum1=0,sum2=0;
		    while (n > 0) {
		        
		        sum1 =sum1 + n * n ;
		        sum2 =sum2 + n ;
		       n--;
		    }
		    sum2=sum2*sum2;
		    System.out.println(sum1);
		      System.out.println(sum2);
              System.out.println(sum1-sum2);
			}

		}
	
