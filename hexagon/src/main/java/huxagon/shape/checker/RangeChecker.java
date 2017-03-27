package huxagon.shape.checker;

import java.util.HashSet;

import huxagon.coordinate.Coordinate;
import huxagon.inf.ICheckCoordinate;
import huxagon.shape.imp.Range;
import java.util.Collection;
public abstract class RangeChecker implements ICheckCoordinate {
	protected Range range;
	protected HashSet<Coordinate> coors = new HashSet<Coordinate>();
	
	
	public RangeChecker(Collection <Coordinate> coors){
		if(coors!=null)
			this.coors.addAll(coors);
	}

	

	public void setRange(Range range) {
		this.range = range;
	}
	
}
