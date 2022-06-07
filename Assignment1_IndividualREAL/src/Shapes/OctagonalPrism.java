package Shapes;

public class OctagonalPrism extends Prism {

	private double side;

	public OctagonalPrism(double height, double side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		
		return this.area;
	}

	@Override
	public void setArea(double area) {
		double newArea = 2 * ( 1 + Math.sqrt(2) * Math.pow(side, 2));
		this.area = newArea;
		
	}

	@Override
	public double getVolume() {
		return this.area;
	}

	@Override
	public void setVolume(double volume) {
		double newVol = this.area * height;
		this.volume = newVol;
		
	}
	
	

}
