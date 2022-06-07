package utilities;

import java.lang.reflect.*;
import java.util.Arrays;

import ShapeManager.*;
import Shapes.*;
import comparisons.AreaCompare;
public class Sorting {
	public static void main(String args[]) {
		
		Shape[] mylist = new Shape[4];
		Shape cone = (Shape) new Cone(50.50, 25);
		Shape pyramid = (Shape) new Pyramid(30.20, 15);
		Shape squareprism = (Shape) new SquarePrism(100.80, 55);
		Shape cylinder = (Shape) new Cylinder(40.40, 55);
		mylist[0] = cone;
		mylist[1] = pyramid;
		mylist[2] = squareprism;
		mylist[3] =  cylinder;
		
		
		System.out.println(Arrays.toString(mylist));
		
		
		Sorting newSort = new Sorting();
		newSort.insertSort(mylist);
		
		System.out.println(Arrays.toString(mylist));
		
		
	}





	
	
	public Sorting() {
		
		
	}
	
	
	
	
	
	public void insertSort(Comparable<Shape>[] array) {
		
		for (int i = 1 ; i < array.length -1; i++) {
			
			Shape current = (Shape) array[i];
			int j = i;
			Shape behindJ = (Shape) array[j - 1];
			while( j > 0 && (behindJ.getHeight()).compareTo(current.getHeight()) == -1) {
				array[j] = array[j - 1];
				j--;
				
			}
			array[j] = current;
		}
		
	}
}


