package Shapes;

public class OctagonalPrism extends Prism {

	private double side;

	public OctagonalPrism(double height, double side) {
		this.height = height;
		this.side = side;
	}

	@Override
	public double calcArea() {
		double newArea = 2 * ( 1 + Math.sqrt(2) * Math.pow(side, 2));
		this.area = newArea;
		return this.area;
	}



	@Override
	public double calcVolume() {
		double newVol = this.area * height;
		this.volume = newVol;
		return this.area;
	}

	
	
	

}
