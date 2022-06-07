package Shapes;

public abstract class Shape implements Comparable<Shape> {
	protected double height;
	protected double area;
	protected double volume;
	
	public Shape() {
		
	}
	
	public Shape(double height, double area, double volume) {
	
		this.height = height;
		this.area = area;
		this.volume = volume;
	}

	public double getHeight() {
		return this.height;
	}

	public  void setHeight(double height) {
		this.height = height;
	}

	public abstract double calcArea();



	public abstract double calcVolume();

	
		
	
	
	
	@Override
	public String toString() {
		return "Shape [height=" + height + ", area=" + area + ", volume=" + volume + "]";
	}

	public int compareTo(Shape sha1) {
		if (this.getHeight() > sha1.getHeight()) {
			return 1;
		} else if (this.getHeight() < sha1.getHeight()){
			return -1;
		} else {
			return 0;
		}
		
	}

}
