import java.util.Scanner;

public class Statement2 {

	public static void main(String[] args) {
	System.out.println("Enter the car number:");
Scanner s = new Scanner(System.in);
  int num=s.nextInt();
  if((num <= 999)||(num>9999)){
	  System.out.println("invalid input");
  }
  else {
	  int sum=0;
while(num>0) {
	sum +=num%10;
	num /=10;
}
if(sum%3==0 || sum%5==0 || sum % 7 ==0) {
	System.out.println("Lucky Number");
}
else {
	System.out.println("sorry its not my lucky number");
}
}
	}

}
