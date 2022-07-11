

	import java.util.Scanner;

	public class TestStatement1 {

		public static void main(String[] args) {
	     Scanner scanner=new Scanner(System.in);
	     System.out.println("Enter the marks of the student");
	     int marks=scanner.nextInt();
	     if(marks<0)
	     {
	    System.out.println("Invalid marrks");
	    	// break;
	    	 //System.exit(0);
	    	
	    	 
	     }
	     else 
	     {
	    	 if(marks>=60 && marks<=80)
	    	 {
	    		 System.out.println("GRADE A");
	    	 }
	    	 else if(marks>=80 )
	    	 {
	    		 System.out.println("no grade");
	    	 }
	    	 
	     }
	     

			
			
			
		}

	
}
