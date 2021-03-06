package huxagon.orientation.imp;

import huxagon.coordinate.Coordinate;
import huxagon.orientation.Orientation;
import huxagon.orientation.OrientationFac;

public class Left extends Orientation{

	@Override
	public int getCode() {
		return OrientationFac.left;
	}

	@Override
	public Coordinate doBuildCoor(Coordinate coor, int range) {
		return new Coordinate(coor.getXcoor()+2*range,coor.getYcoor());
	}

	@Override
	protected boolean doMatch(Coordinate coor1, Coordinate coor2) {
		return coor1.getXcoor()<coor2.getXcoor() && coor1.getYcoor()==coor2.getYcoor();
	}
	
}
