package CollectionsDemo1;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Driver2 {

	public static void main(String[] args) throws ParseException {
//LIC lic=new LIC();
 PolicyServiceProvider service;
 service=new LIC();
 Scanner scanner=new Scanner(System.in);
 System.out.println("How many polycies do you want to add");
 int pcount=Integer.parseInt(scanner.nextLine());
 List<Insurance> list=new ArrayList();
 for(int i=0; i<pcount ; i++)
 {
	 
	 System.out.println("Enter insurance id");
	// int id=scanner.nextInt();//1 \n
	// scanner.nextLine();
	 
	 int id=Integer.parseInt(scanner.nextLine());
	 System.out.println("Enter policy number");
	 String pno=scanner.nextLine();
	 System.out.println("Enter the policy holder name");
	 String name=scanner.nextLine();
	 System.out.println("Enter the start date of policy in dd/mm/yyyy");
	 String pdate1=scanner.nextLine();
	 SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	 Date d1=   sdf.parse(pdate1);
	 Insurance ins=new Insurance();
	 ins.setInsuranceId(id);
	 ins.setPolicyNumber(pno);
	 ins.setPolicyHolderName(name);
	 ins.setPolicyDate(d1);
	 list.add(ins);
	 }
     service.addInsurance(list);
 
    List<Insurance> listOfPolicy=service.getAllPolicies();
 
    SimpleDateFormat sdf1=new SimpleDateFormat("YYYY-MM-dd");
 for(Insurance i:listOfPolicy)
 {
	 Date d=i.getPolicyDate();
	   String resultDate=  sdf1.format(d);
	 System.out.println(i.getInsuranceId() + " "+i.getPolicyHolderName() + " "+i.getPolicyNumber() + " "+resultDate);
 }
 
    List<Insurance> sortedList=service.sortPoliciesByPolicyNumber();
 for(Insurance i: sortedList)
 {
	 System.out.println(i.getInsuranceId() + " "+i.getPolicyNumber() + " "+i.getPolicyHolderName());
 }
		
		
		
		
		
	}

}
