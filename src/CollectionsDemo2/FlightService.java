package CollectionsDemo2;


import java.util.List;
import java.util.Map;
public interface FlightService {
	//add, view , getFlightForLocation,delete, update, 
  public boolean addFlight(Flight flight);
  //This will add the flight object to the Map
  //The keyValue should be Flight Id--Flight
	
	public Map<Integer, Flight> getAllFlihgts();
	List<Flight> getFlightLocation(String source, String destination);
	public Flight removeFlight(int flightId);
	public int updateFlight(int flightId,Flight flight); 
	public void BookFlight();
	 
	
}