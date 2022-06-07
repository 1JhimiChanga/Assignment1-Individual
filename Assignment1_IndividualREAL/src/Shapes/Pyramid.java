package Shapes;


public class Pyramid extends Shape {
   private double side;

   public Pyramid(double height, double side) {
	   this.height = height;
       this.side = side;
   }

   public Pyramid(double height, double area, double volume) {
       super(height, area, volume);
   }

   @Override
   public double calcArea() {
	   double num = Math.pow(side, 2);
       this.area = num;
       return this.area;
   }

   

   @Override
   public double calcVolume() {
	   double num = (1.0/3.0) * (Math.pow(side, 2)) * height;
       this.volume = num;
       return this.volume;
   }


} 