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
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
		return this.area;
	}
	@Override
	public void setArea(double area) {
		double num = Math.PI * Math.pow(radius, 2);
		this.area = num;	
		
	}
	@Override
	public double getVolume() {
		return this.volume;
	}
	@Override
	public void setVolume(double volume) {
		double num = Math.PI * Math.pow(radius,2) * height;
		this.volume = num;
		
	}
	

}
