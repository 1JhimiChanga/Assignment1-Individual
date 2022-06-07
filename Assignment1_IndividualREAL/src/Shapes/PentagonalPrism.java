package Shapes;

public class PentagonalPrism extends Prism {

	private double side;

	public PentagonalPrism(double height, double side) {
		this.height = height;
		this.side = side;
	}

	@Override
	public double calcArea() {
		double degrees = Math.toRadians(54);
		double newArea = (5 * Math.pow(side, 2) * Math.tan(degrees)) / 4;
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
