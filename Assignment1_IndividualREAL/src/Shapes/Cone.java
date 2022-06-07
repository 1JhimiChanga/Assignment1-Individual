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
	public double calcArea() {
		 double newArea = Math.PI * Math.pow(radius, 2);
		 this.area = newArea;
		 return this.area;
	}


	@Override
	public double calcVolume() {
		double newVol = (1.0/3.0) * Math.PI * Math.pow(radius, 2) * height;
		this.volume = newVol;
		return this.volume;
	}


}
