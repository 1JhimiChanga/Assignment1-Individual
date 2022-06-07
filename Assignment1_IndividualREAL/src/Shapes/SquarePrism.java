package Shapes;

public class SquarePrism extends Prism {
	private double side;
	

	public SquarePrism(double height, double side) {
		this.height = height;
		this.side = side;
	}

	@Override
	public double calcArea() {
		double newArea = Math.PI * Math.pow(side, 2);
		this.area = newArea;
		return this.area;
	}



	@Override
	public double calcVolume() {
		double newVol = Math.pow(side, 2) * height;
		this.volume = newVol;
		return this.volume;
	}


}
