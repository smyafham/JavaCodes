	import java.util.Scanner;
public class Bill {

	    public static void main (String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the no of pizzas bought:");
	        int pizza=sc.nextInt();
	        System.out.println("Enter the no of puffs bought:");
	        int puff=sc.nextInt();
	        System.out.println("Enter the no of cool drinks bought:");
	        int drink=sc.nextInt();
	        
	        System.out.println("Bill Details");
	        System.out.println("No of pizzas:"+pizza);
	        System.out.println("No of puffs:"+puff);
	        System.out.println("No of cooldrinks:"+drink);
	        System.out.println("Total price="+(pizza*100+puff*20+drink*10));
	        System.out.println("ENJOY THE SHOW!!!");
	    }
	}

