/**
 * 
 */
package Shapes;

/**
 * @author Jimmy
 *
 */
public class Cylinder extends Shape {

	/**
	 * 
	 */
	

	private double radius;
	
	public Cylinder(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}
	
	public Cylinder(double height, double area, double volume) {
		super(height, area, volume);
		
	}

	@Override
	public double calcArea() {
		double num = Math.PI * Math.pow(radius, 2);
		this.area = num;
		return this.area;
	}
	
	
	@Override
	public double calcVolume() {
		double num = Math.PI * Math.pow(radius,2) * height;
		this.volume = num;
		return this.volume;
	}

	

}
