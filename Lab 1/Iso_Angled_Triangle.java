package Shapes;
import java.util.*;
import java.lang.Math;
/**
 * @author Jake Siewer
 * 19725989
 * 10/02/2021
 */
public class Iso_Angled_Triangle 
{
	/**
	 * calculate the area of an isosceles triangle
	 * @param base
	 * @param height
	 * @return
	 */
	public static double area(double base, double height)
	{
		return (base*height)/2;
	}
	
	/**
	 * calculate the circumference of an isosceles triangle
	 * @param base
	 * @param height
	 * @return
	 */
	public static double circumference(double base, double height)
	{
		return base + (Math.sqrt((base*base) + 4 * (height*height)));
	}
	
	/**
	 * Main method asks user for input base and height
	 * displays to console area and circumference of isosceles triangle
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the base: ");
		double base = scanner.nextDouble();
		System.out.println("Enter the height: ");
		double height = scanner.nextDouble();
		System.out.println("An isosceles triangle of "+ base + " base and "+ height +" height has an area of "+ Iso_Angled_Triangle.area(base, height) + " m2");
		System.out.println("An isosceles triangle of "+ base + " base and "+ height +" height has a circumference of "+ Iso_Angled_Triangle.circumference(base, height) + " m");
		scanner.close();
	}
}
