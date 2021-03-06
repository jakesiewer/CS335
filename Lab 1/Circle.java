package Shapes;
import java.util.Scanner;

/**
 * @author Jake Siewer
 * 19725989
 * 10/02/2021
 */
public class Circle 
{
	/**
	* PI attribute
	*/
	static double PI=3.14159;
	/**
	* Calculate area of a circle
	* @param radius double
	* @return area double
	*/
	public static double area(double radius)
	{
		return PI*radius*radius;
	}
	/**
	* Calculate circumference of a circle
	* @param radius double
	* @return circumference
	*/
	public static double circumference(double radius)
	{
		return PI*2*radius;
	}
	/**
	* Main method asks user to input a radius
	* then displays to console the area and circumference
	* of the corresponding circle
	* @param args
	*/
	public static void main(String[] args)
	{
		System.out.println("Enter a radius: ");
		Scanner scanner = new Scanner(System.in);
		double radius = scanner.nextDouble();
		System.out.println("A circle of radius "+ radius + " m has an area of "+ Circle.area(radius) + " m2");
		System.out.println("A circle of radius "+ radius + " m has a circumference of "+ Circle.circumference(radius) + " m");
		scanner.close();
	}
}
