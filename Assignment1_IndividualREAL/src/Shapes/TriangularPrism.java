package Shapes;

public class TriangularPrism extends Prism{

	private double side;


	public TriangularPrism(double height, double side) {
		this.height = height;
		this.side = side;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.area;
	}

	@Override
	public void setArea(double area) {
		double newArea = (Math.pow(side, 2) * Math.sqrt(3) / 4);
		
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return this.volume;
	}

	@Override
	public void setVolume(double volume) {
		double newVol = this.area * height;
		this.volume = newVol;
	}

}
