package Shapes;

public class PentagonalPrism extends Prism {

	private double side;

	public PentagonalPrism(double height, double side) {
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
		double degrees = Math.toRadians(54);
		double newArea = (5 * Math.pow(side, 2) * Math.tan(degrees)) / 4;
		this.area = newArea;
		
	}

	@Override
	public double getVolume() {
		return this.volume;
	}

	@Override
	public void setVolume(double volume) {
		double newVol = this.area * height;
		this.volume = newVol;
		
	}

}
