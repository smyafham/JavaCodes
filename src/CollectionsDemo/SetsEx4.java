package CollectionsDemo;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsEx4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of top run scorers in season 4");
		int n=Integer.parseInt(s.nextLine()); 
        Set<String> set1=new LinkedHashSet<String>();
        Set<String> set2=new LinkedHashSet<String>();
        System.out.println("Enter the nam of the players");
        for(int i=0;i<n;i++) {
        	set1.add(s.nextLine());
        }        
        System.out.println("Enter the number of top run scorers in season 5");
        int m=Integer.parseInt(s.nextLine());
        System.out.println("Enter the name of players");
        for(int j=0;j<m;j++) {
        	set2.add(s.nextLine());
        } 
        System.out.println("Player Set 1");
        for(Object x:set1) {
        	System.out.println(x);
        }
        System.out.println("Player Set 2");
        for(Object x:set2) {
        	System.out.println(x);
        }
        System.out.println("Intersection");
        set1.retainAll(set2);
        for(Object x:set1) {
        	System.out.println(x);
        }
	}
	

}
