package huxagon.inf.impl;

import huxagon.coordinate.Coordinate;
import huxagon.inf.ICheckCoordinate;

public class CoorCheck implements ICheckCoordinate {

	private Coordinate coor;
	
	public CoorCheck(Coordinate coor) {
		super();
		this.coor = coor;
	}
	
	public CoorCheck(int x,int y) {
		super();
		this.coor = new Coordinate(x,y);
	}

	@Override
	public boolean check(Coordinate coor) {
		if(this.coor==null) return false;
		return !this.coor.equals(coor);
	}
	
}
