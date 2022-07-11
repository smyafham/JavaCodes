public class Employee {
    
static void printEmployeeInfo(int id, String name,long ph,double salary ) {
	System.out.println(id+ " " +name+ " " +ph+ " "+salary);
	}

	public static void main(String[] emp) {
    int id =Integer.parseInt(emp[0]);
    String name = emp[1];
    long ph = Long.parseLong(emp[2]);
    double salary = Double.parseDouble(emp[3]);
    printEmployeeInfo(id, name, ph, salary);
	}

}
