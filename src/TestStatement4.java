
public class TestStatement4 {

	//123
	public static boolean checkPalindrom(int number)
	{
		int r, sum=0, t;
		t=number;
		while(number>0)
		{
			r=number%10;
			System.out.println(r);
			sum=(sum*10)+r;
			System.out.println(sum);
			number=number/10;
			System.out.println(number);
			
			
			
		}
		if(t==sum)
		{
			return true;
		}
		else
		{
		return false;
		}
		
		
	}
	
	public static void main(String[] args) {

if(checkPalindrom(111))
{
	System.out.println("Number is plaindrom");
}
else
{
	System.out.println("Not palindrom");
}

	}

}