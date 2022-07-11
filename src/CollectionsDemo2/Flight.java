package CollectionsDemo2;


public class Flight {

	private int flightId;
	private String flightType;
	private String flightSource;
	private String flightDestination;
	private String flightDays;
	private double flightPrice;
	
	public Flight(int flightId, String flightType, String flightSource, String flightDestination, String flightDays,
			double flightPrice) {
		super();
		this.flightId = flightId;
		this.flightType = flightType;
		this.flightSource = flightSource;
		this.flightDestination = flightDestination;
		this.flightDays = flightDays;
		this.flightPrice = flightPrice;
	}
	public int getFlightId() {
		return flightId;
	}
	public String getFlightType() {
		return flightType;
	}
	public String getFlightSource() {
		return flightSource;
	}
	public String getFlightDestination() {
		return flightDestination;
	}
	public String getFlightDays() {
		return flightDays;
	}
	public double getFlightPrice() {
		return flightPrice;
	}
	
	
	
	
}