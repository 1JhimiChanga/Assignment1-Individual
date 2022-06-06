package comparisons;

import java.util.Comparator;
import Shapes.Shape;


public class AreaCompare implements Comparator<Shape> {

	public AreaCompare() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Shape o1, Shape o2) {
		if(o1.getArea() > o2.getArea()) {
			return 1;
		} else if (o1.getArea() < o2.getArea()) {
			return -1;
		//if o1 == o2
		} else { 
			return 0;
		}
		
	}

}
