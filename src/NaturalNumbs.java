import java.util.Scanner;
public class NaturalNumbs {
	static int calculateDifference(int n){
		 
		int l, k, m;
		 
		    // Sum of the squares of the
		    // first n natural numbers is
		    l = (n * (n + 1) * (2 * n + 1)) / 6;
		     
		    // Sum of n naturals numbers
		    k = (n * (n + 1)) / 2;
		 
		    // Square of k
		    k = k * k;
		     
		    // Differences between l and k
		    m = (l - k);
		     
		    return m;
		 
		}
		 
	public static void main(String[] args) {
		 
		    System.out.println("Enter n");
		    Scanner s=new Scanner(System.in);
		    int n =s.nextInt();
		    System.out.println(calculateDifference(n));
		}

	}

