package CollectionsDemo;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Playe{
	String name;
	String team;
	String skills;
	public Playe(String name, String team, String skills) {
		super();
		this.name = name;
		this.team = team;
		this.skills = skills;
	}
	
	
}
public class MapsEx3 {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number of players");
		int n=Integer.parseInt(s.nextLine());
		Map<String,Playe> mp=new TreeMap<String,Playe>();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the details of the player "+(i+1));
			System.out.println("Enter capNumber");
			String cnum=s.nextLine();
			System.out.println("Enter Name");
			String name=s.nextLine();
			System.out.println("Enter Team");
			String team=s.nextLine();
			System.out.println("Enter Skills");
			String skills=s.nextLine();
			Playe p=new Playe(name, team, skills);
			mp.put(cnum, p);

		}
		Set<Map.Entry<String,Playe>> entryset=mp.entrySet();

		for(Map.Entry<String, Playe> me: entryset)
		{
			
			System.out.println(me.getKey()+ "--"+me.getValue().name+"--"+me.getValue().skills + "--"+me.getValue().team);
		}
	}

}
