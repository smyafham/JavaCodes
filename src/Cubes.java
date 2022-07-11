import java.util.Scanner;
public class Cubes {

	public static void main(String[] args) {
    System.out.println("Enter n");
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int sum=0;
    while (n > 0) {
        int digit = n % 10;
        sum =sum + digit * digit * digit;
        n =n/ 10;
    }
    System.out.println(sum);
	}

}
