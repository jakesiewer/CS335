

public class TestBuilderPattern {

	public static void main(String[] args) {
		CarBuilder carBuilder = new SedanCarBuilder();
		CarDirector director = new CarDirector(carBuilder);
		director.build();
		Car car = carBuilder.getCar();
		System.out.println(car);
		
		CarBuilder carBuilder1 = new SportsCarBuilder();
		CarDirector director1 = new CarDirector(carBuilder1);
		director1.build();
		Car sportscar = carBuilder1.getCar();
		System.out.println(sportscar);
		
	}
	
	
	
	
	

}