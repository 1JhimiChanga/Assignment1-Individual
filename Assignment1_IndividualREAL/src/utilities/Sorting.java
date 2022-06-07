package utilities;

import java.awt.Shape;
import java.lang.reflect.*;

import ShapeManager.ShapeManager;
import Shapes.Cone;
import comparisons.AreaCompare;
public class Sorting {
	public static void main(String args[]) {
		
		ShapeManager[] unsorted = new ShapeManager[3];
		Cone cone = new Shape()
		
	}
	
	
	


	public Sorting(ShapeManager[] unsorted) {
		this.unsorted = unsorted;
	}

	
	public void insertSort(ShapeManager[] unsorted) {
		
		for (int i = 1; i < unsorted.length -1; i++) {
			
			Class reflected = Class.forName(unsorted[i].toString());
			
			
			
			int j = i;
			while( j > 0 && (unsorted[j - 1]).compareTo(met.invoke()) == 1) {
				unsorted[j] = unsorted[j  - 1];
				j--;
				unsorted[j] = current;
			}
		}
		
		for(int i = 0; i < unsorted.length-1; i++) {
			System.out.println(unsorted[i]);
		
		
		
		}
	}

}
