package utilities;

import java.lang.reflect.*;
import java.util.Arrays;

import ShapeManager.*;
import Shapes.*;
import comparisons.AreaCompare;
public class Sorting {
	public static void main(String args[]) {
		
		Shape[] mylist = new Shape[3];
		Shape cone = (Shape) new Cone(50, 25);
		Shape pyramid = (Shape) new Pyramid(30, 15);
		Shape squareprism = (Shape) new SquarePrism(100, 55);
		mylist[0] = cone;
		mylist[1] = pyramid;
		mylist[2] = squareprism;
		System.out.println(Arrays.toString(mylist));
	}
	
	
	
	
	
	public void insertSort(Comparable<Shape>[] array) {
		
		for (int i = 1; i < array.length -1; i++) {
			
			Comparable<Shape> current = array[i];
			
			
			
			
			int j = i;
			while( j > 0 && (array[j - 1]).compareTo(met.invoke()) == 1) {
				array[j] = array[j  - 1];
				j--;
				array[j] = current;
			}
		}
		
		for(int i = 0; i < array.length-1; i++) {
			System.out.println(array[i]);
		
		
		
		}
	}

}
