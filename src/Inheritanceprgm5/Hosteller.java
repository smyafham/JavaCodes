package Inheritanceprgm5;

import java.util.Scanner;



public class Hosteller extends Student {
private	String hostelName;
private	int roomNumber;


public String getHostelName() {
	return hostelName;
}
public void setHostelName(String hostelName) {
	this.hostelName = hostelName;
}
public int getRoomNumber() {
	return roomNumber;
}
public void setRoomNumber(int roomNumber) {
	this.roomNumber = roomNumber;
}
/*
public static Hosteller getHostellerDetails() {
	Scanner sc=new Scanner(System.in);
	System.out.println("New Room Number");
	int num=sc.nextInt();
	Hosteller h1=new Hosteller();
     System.out.println("New phone Number");
     String ph=sc.next();
     h1.setPhone(ph);
     return h1;
}*/

}
