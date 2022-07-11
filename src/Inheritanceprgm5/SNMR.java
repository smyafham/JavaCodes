package Inheritanceprgm5;

import java.util.Scanner;

public class SNMR {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Student Id");
		int id=s.nextInt();
		System.out.println("Student Name");
		String name=s.next();
		System.out.println("Department Id");
		int did=s.nextInt();
		System.out.println("Gender");
		String gender=s.next();
		System.out.println("Phone Number");
		String num=s.next();
		System.out.println("Hostel Name");
		String hname=s.next();
		System.out.println("Room Number");
		int rnum=s.nextInt();
		Student std=new Student();
		std.setStudentId(id);
		std.setName(name);
		std.setDepartmentId(did);
		std.setGender(gender);
		std.setPhone(num);
		Hosteller h=new Hosteller();
		Hosteller h1;
		h.setHostelName(hname);
		h.setRoomNumber(rnum);
		
		System.out.println("Modify Room Number (Y/N)");
		//char option=s.next().charAt(0);
		String option=s.next();
		String y="y";
		if(option.equalsIgnoreCase(y)) {
			System.out.println("New Room Number");
			int rnum2=s.nextInt();
			h.setRoomNumber(rnum2);
			}
		
		
		
		System.out.println("Modify phone Number(Y/N)");
		String option2=s.next();
		if(option2.equalsIgnoreCase(y)) {
			//h1=h.getHostellerDetails();
			System.out.println("New Phone Number");
			String pnum=s.next();
			std.setPhone(pnum);
			
		}
		System.out.println("The Student Details");
		System.out.println(+std.getStudentId()+" "+std.getName()+" "+std.getDepartmentId()+" "+std.getGender()+" "+std.getPhone()+ " "+h.getHostelName()+" "+h.getRoomNumber());
	}

}
