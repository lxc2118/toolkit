package huxagon.util.pathWayFinder.imp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import huxagon.coordinate.Coordinate;
import huxagon.util.pathWayFinder.IPathWayFinder;

/**
 * @author mj
 */
public class NullPathWay implements IPathWayFinder{

	@Override
	public boolean isMatch(Coordinate begin, Coordinate end) {
		
		return begin==null
				|| end==null
				|| begin.equals(end);
	}

	@Override
	public Collection<Coordinate> cal(Coordinate begin, Coordinate end) {
		return new ArrayList();
	}
	
}
