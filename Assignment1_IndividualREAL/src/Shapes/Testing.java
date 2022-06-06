package Shapes;

public class Testing {

	public Testing() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		double height = 10;
		double radius = 5;
		double w = 1/2;
		double side = 20;
		double b = Math.toRadians(54);
		
		double newVol = (1.0/3.0) * Math.PI * Math.pow(radius, 2) * height;
		System.out.println(newVol);
	}

}
