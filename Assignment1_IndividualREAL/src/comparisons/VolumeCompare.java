package comparisons;

import java.util.Comparator;

import Shapes.Shape;

public class VolumeCompare implements Comparator<Shape> {

	public VolumeCompare() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Shape o1, Shape o2) {
		if (o1.getVolume() > o2.getVolume()) {
			return 1;
		} else if (o1.getVolume() < o2.getVolume()) {
			return -1;
		} else {
			//if o2 == o1
			return 0;
		}
	}

}
