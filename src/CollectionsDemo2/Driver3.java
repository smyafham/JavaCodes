package CollectionsDemo2;


import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Driver3 {

	public static void main(String[] args) {

  FlightService service;
  service=new Indigo();
  Scanner scanner=new Scanner(System.in);
  for(int i=0; i<3;  i++)
  {
	  System.out.println("Enter flight id");
	  int id=Integer.parseInt(scanner.nextLine());
	  System.out.println("enter fligth type");
	  String type=scanner.nextLine();
	  System.out.println("enter fligth source");
	  String source=scanner.nextLine();
	  System.out.println("enter fligth destination");
	  String dest=scanner.nextLine();
	  System.out.println("enter fligth days");
	  String days=scanner.nextLine();
	  System.out.println("enter fligth price");
	  double price=Double.parseDouble(scanner.nextLine());
	  
	  Flight flights=new Flight(id, type, source, dest, days, price);
	 boolean b= service.addFlight(flights);
	 if(b)
	 {
		 System.out.println("Flight info saved");
	 }
	 else
	 {
		 System.out.println("not saved");
	 }
	  
}
  
  
  System.out.println("View Fligth details");
    Map<Integer, Flight> flightMap=  service.getAllFlihgts();
  for(Map.Entry<Integer, Flight> me : flightMap.entrySet())
  {
	  System.out.println(me.getKey() + " ------->" + " "+me.getValue().getFlightType()+ " "+me.getValue().getFlightSource()
			  + " "+me.getValue().getFlightSource() + " "+me.getValue().getFlightDestination());
  }
  
 List<Flight> list= service.getFlightLocation("kol", "chn");
  for(Flight f: list)
  {
	  System.out.println(f.getFlightId() + " "+f.getFlightType() + " "+f.getFlightDays()+ " "+f.getFlightPrice());
  }
		
	}

}