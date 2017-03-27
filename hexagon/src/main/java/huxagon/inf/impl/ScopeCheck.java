package huxagon.inf.impl;

import huxagon.coordinate.Coordinate;
import huxagon.inf.ICheckCoordinate;

public class ScopeCheck implements ICheckCoordinate{

	private int maxX;
	private int maxY;
	public ScopeCheck(int maxX, int maxY) {
		this.maxX = maxX;
		this.maxY = maxY;
	}
	@Override
	public boolean check(Coordinate coor) {
		
		if(coor==null)
			return false;
		return coor.getXcoor()>=0 && coor.getYcoor()>=0
				&& coor.getXcoor()<=maxX && coor.getYcoor()<=maxY
				&& (coor.getXcoor()+coor.getYcoor())%2==0;
		
	}
	

}
