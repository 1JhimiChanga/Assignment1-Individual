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
   public double getArea() {
       return this.area;
   }

   @Override
   public void setArea(double area) {
       double num = Math.pow(side, 2);
       this.area = num;
   }

   @Override
   public double getVolume() {
       return this.volume;
   }

   @Override
   public void setVolume(double volume) {
       double num = (1.0/3.0) * (Math.pow(side, 2)) * height;
       this.volume = num;
   }
} 