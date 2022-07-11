package CollectionsDemo2;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public class Indigo implements FlightService{

	Map<Integer, Flight> map=new TreeMap();
	@Override
	public boolean addFlight(Flight flight) {

     if(map.put(flight.getFlightId(), flight)==null)
     {
    	 return true;
     }
		return false;
	}

	@Override
	public Map<Integer, Flight> getAllFlihgts() {


		return map;
	}

	@Override
	public List<Flight> getFlightLocation(String source, String destination) {

		List<Flight> listOfFlights=new ArrayList();
    for(Map.Entry<Integer, Flight> me : map.entrySet())
    {
    	String s=me.getValue().getFlightSource();
    	String d=me.getValue().getFlightDestination();
    	if(s.equalsIgnoreCase(source) && d.equalsIgnoreCase(destination))
    	{
    		Flight flights=me.getValue();
    		listOfFlights.add(flights);
    		
    		
    	}
    	
    	
    }
		
		
		
		
		 return listOfFlights;
	}

	@Override
	public Flight removeFlight(int flightId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateFlight(int flightId, Flight flight) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void BookFlight() {

//It will customer info
		//it will take flight info flight id, flight price from Flight
		//It will generate pnr number based customer info and flight info
		//write the entire content in one file and saved those ticket in file
		
		//pnr  Customer name  date journey   Phone numner  Flightid source destination price  
	}

}