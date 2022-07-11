package OopsConcepts;

import java.util.Scanner;



class Associate{
	private int associateid;
	private String associateName;
	private String workStatus;
	public int getAssociateid() {
		return associateid;
	}
	public void setAssociateid(int associateid) {
		this.associateid = associateid;
	}
	public String getAssociateName() {
		return associateName;
	}
	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}
	public String getWorkStatus() {
		return workStatus;
	}
	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}
	

}

public class Oops3 {

	public static void main(String[] args) {
		Associate a=new Associate();
		Scanner s = new Scanner (System.in);
		System.out.println("Enter associate id:");
		int id=s.nextInt();
		System.out.println("Enter associate name:");
		String name=s.next();
		System.out.println("Enter number of days:");
		int days=s.nextInt();
		a.setAssociateName(name);
		a.setAssociateid(id);
		if(days>0&& days<=20) {
			String str="Core skills";
			a.setWorkStatus(str);
		}
		else if(days>20&& days<=40) {
			String str1="Advanced modules";
			a.setWorkStatus(str1);
		}
		else if(days>40&& days<=60) {
			String str3="Project phase";
			a.setWorkStatus(str3);
		}
		else if(days>=60) {
			String str4="Deployed in project";
			a.setWorkStatus(str4);

		}
	//	a.setWorkStatus(days);
		System.out.println("The associate "+a.getAssociateName()+ " work status: "+a.getWorkStatus());
	}

}
