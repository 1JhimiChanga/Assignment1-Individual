package Shapes;

public class Cone extends Shape {
	private double radius;
	

	public Cone() {
		// TODO Auto-generated constructor stub
	}
	public Cone(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}

	@Override
	public double getArea() {
		 return this.area;
	}

	@Override
	public void setArea(double area) {
		double newArea = Math.PI * Math.pow(radius, 2);
		this.area = newArea;
		
	}

	@Override
	public double getVolume() {
		return this.volume;
	}

	@Override
	public void setVolume(double volume) {
		double newVol = (1.0/3.0) * Math.PI * Math.pow(radius, 2) * height;
		this.volume = newVol;
		
	}

}
