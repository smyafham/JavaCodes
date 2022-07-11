package CollectionsDemo;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Players implements Comparable<Players>{
	private String playerName;
	private String skill;
	private long capNumberLong;
	public Players(String playerName, String skill, long capNumberLong) {
		super();
		this.playerName = playerName;
		this.skill = skill;
		this.capNumberLong = capNumberLong;
	}
	public String getPlayerName() {
		return playerName;
	}
	public String getSkill() {
		return skill;
	}
	public long getCapNumberLong() {
		return capNumberLong;
	}
	@Override
	public int compareTo(Players o) {
if (this.getCapNumberLong()<o.capNumberLong) {
	return 1;
	
	
	
}		return -1;
	}
}
public class SetsEx3 {

	public static void main(String[] args) {
Scanner s =new Scanner (System.in);
System.out.println("Enter number of players");
int n=Integer.parseInt(s.nextLine());

Set<Players> set=new TreeSet<Players>();
for(int i=0;i<n;i++) {
	System.out.println("Enter Details of player"+(i+1));
	System.out.println("Enter Name");
	String name=s.nextLine();
	System.out.println("Enter Skills");
	String skills =s.nextLine();
	System.out.println("Enter Cap number");
	int cnum=Integer.parseInt(s.nextLine());;
	Players p=new Players(name, skills, cnum);
	set.add(p);
}
System.out.println("Player list after sorting by cap number in descending order ");
for (Players pp:set) {
	System.out.println(pp.getPlayerName()+"-"+pp.getCapNumberLong());
}

	}

}
