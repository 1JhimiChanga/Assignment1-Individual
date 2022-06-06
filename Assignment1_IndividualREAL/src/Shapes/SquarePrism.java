package Shapes;

public class SquarePrism extends Prism {
	private double side;
	

	public SquarePrism(double height, double side) {
		this.height = height;
		this.side = side;
	}

	@Override
	public double getArea() {
		return this.area;
	}

	@Override
	public void setArea(double area) {
		double newArea = Math.PI * Math.pow(side, 2);
		this.area = newArea;
		
	}

	@Override
	public double getVolume() {
		return this.volume;
	}

	@Override
	public void setVolume(double volume) {
		double newVol = Math.pow(side, 2) * height;
		this.volume = newVol;
	}

}
