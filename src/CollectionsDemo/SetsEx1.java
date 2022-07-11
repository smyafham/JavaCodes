package CollectionsDemo;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Revenue implements Comparable<Revenue>{
	private String revenueCategory;
	private int amount;
	public Revenue(String revenueCategory, int amount) {
		super();
		this.revenueCategory = revenueCategory;
		this.amount = amount;
	}
	
	public String getRevenueCategory() {
		return revenueCategory;
	}
	public int getAmount() {
		return amount;
	}

	@Override
	public int compareTo(Revenue o) {
		if(this.amount < o.amount) {
			return 1;
		}
		return -1;
	}
	
}
public class SetsEx1 {

	public static void main(String[] args) {
   Set<Revenue> set1=new TreeSet(); 
   Scanner s=new Scanner (System.in);
   
   do {
	   System.out.println("Enter revenue category");
	   String ts=s.nextLine();
	   System.out.println("Enter revenue amount");
	   double amt=Double.parseDouble(s.nextLine());
	   System.out.println("Do you want to continue(Y/N)");
	   Revenue r =new Revenue(ts,(int) amt);
			   set1.add(r);
   }while(s.nextLine().equalsIgnoreCase("y"));
   System.out.println("Top Spending categories");
   System.out.println("Category  Amount");
   int sum=0;
   for(Revenue rev:set1) {
	   sum+=rev.getAmount();
	   System.out.println(rev.getRevenueCategory()+"    "+rev.getAmount()); 
   }
   System.out.println("Total amount earned : " +sum);
	}

}
