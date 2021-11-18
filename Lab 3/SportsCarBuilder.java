
public class SportsCarBuilder implements CarBuilder
{
	private final Car car = new Car("SPORTS");
	
	@Override
	public void buildBodyStyle() {
		car.setBodyStyle("External dimensions: overall length (inches): 172.5, " +
				"overall width (inches): 73, overall height (inches): 50.7, wheelbase (inches): 97.2," +
				" front track (inches): 62.8, rear track (inches): 62.6 and curb to curb turning circle (feet): 17.1");
	}
	
	@Override
	public void buildPower(){
		car.setPower("335 hp @ 6,500 rpm; 400 ft lb of torque @ 4,500 rpm");
	}

	@Override
	public void buildEngine() {
		car.setEngine("2.0L BMW Inline 6");
	}

	@Override
	public void buildBreaks() {
		car.setBreaks("Four-wheel disc brakes: two ventilated. Electronic brake distribution");
	}

	@Override
	public void buildSeats() {
		car.setSeats("Front seats center armrest.");
	}

	@Override
	public void buildWindows() {
		car.setWindows("Laminated side windows.Fixed rear window with defroster");
		
	}

	@Override
	public void buildFuelType() {
		car.setFuelType("Gasoline 9.1 MPG city, 6.5 MPG highway, 7.5 MPG combined and 490 mi. range");
		
	}
	
	@Override
	public Car getCar(){
		return car;
	}
	
}
