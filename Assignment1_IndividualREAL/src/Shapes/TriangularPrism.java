package Shapes;

public class TriangularPrism extends Prism{

	private double side;


	public TriangularPrism(double height, double side) {
		this.height = height;
		this.side = side;
	}

	@Override
	public double calcArea() {
		double newArea = (Math.pow(side, 2) * Math.sqrt(3) / 4);
		this.area = newArea;
		return this.area;
	}


	@Override
	public double calcVolume() {
		double newVol = this.area * height;
		this.volume = newVol;
		return this.volume;
	}



}
