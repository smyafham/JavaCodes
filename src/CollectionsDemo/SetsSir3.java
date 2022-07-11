package CollectionsDemo;


import java.util.HashSet;
import java.util.TreeSet;

class Player implements Comparable<Player>
{
	private int pId;
	private String pname;
	private String pSkill;
	public Player(int pId, String pname, String pSkill) {
		super();
		this.pId = pId;
		this.pname = pname;
		this.pSkill = pSkill;
	}
	public int getpId() {
		return pId;
	}
	public String getPname() {
		return pname;
	}
	public String getpSkill() {
		return pSkill;
	}
	@Override
	public int compareTo(Player o) {

    if(this.pId < o.pId)
    {
    	return 1;
    }
		return -1;
	}
	
	
	
}



public class SetsSir3 {

	public static void main(String[] args) {
	
		
		
		
		TreeSet<Player> ts1=new TreeSet<Player>();
		Player p1=new Player(10,"A","Bat");
		Player p2=new Player(5,"B","Ball");
		Player p3=new Player(1,"C","B");
		Player p4=new Player(4,"T","Bat");
		ts1.add(p1);
		ts1.add(p2);
		ts1.add(p3);
		ts1.add(p4);
		for(Player p:ts1)
		{
			System.out.println(p.getpId() + " "+p.getPname() + " "+p.getpSkill());
		}
		
		//Object
		HashSet<Player> hs1=new HashSet(ts1);
		System.out.println("Printing by hashset");
		for(Player p:hs1)
		{
			System.out.println(p.getpId() + " "+p.getPname() + " "+p.getpSkill());
		}
		

	}

}