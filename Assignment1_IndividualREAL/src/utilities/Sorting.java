package utilities;

import java.awt.Shape;

public class Sorting {

	
	public void insertSort(Shape[] unsorted) {
		
		for (int i = 1; i < unsorted.length -1; i++) {
			Shape current = unsorted[i];
			int j = i;
			while( j > 0 && unsorted[j - 1].compareTo(current) {
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
