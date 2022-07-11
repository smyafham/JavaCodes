package OopsConcepts;
class person{
	private String name;
	private float age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
}

class Account extends person{
	private long accNum;
	private double balance;
	private person accHolder;
	
	
	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(person accHolder) {
		this.accHolder = accHolder;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
public void deposite(double amt) {
		
	}
	
	public void withdraw(double amt) {
		
	}
	
	public double getBalance() {
		return balance;
	}

}

public class Inheritance5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
zc
	}

}
