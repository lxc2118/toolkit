package huxagon.shape.checker.imp;

import java.util.Collection;

import huxagon.coordinate.Coordinate;
import huxagon.shape.checker.RangeChecker;

public class NoBlockRange  extends RangeChecker{

	public NoBlockRange(Collection<Coordinate> coors) {
		super(coors);
		
	}

	@Override
	public boolean check(Coordinate coor) {
		
		return !this.coors.contains(coor);
	}
	
}
