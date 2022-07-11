package LambaExpressions;


@FunctionalInterface
public interface CustomerService {
	//password should be alpha numeric 
	//from name last two characters
	//from phone last four characters
	String generatePassword(String name, long phone);
	//void show1(String msg);
	default public void show()
	{
		System.out.println("Good morning");
	}
	default int getStatus()
	{
		return 1;
	}

}