package huxagon.util.pathWayFinder.imp;

import java.util.Collection;
import java.util.List;

import huxagon.coordinate.Coordinate;
import huxagon.shape.imp.Line;
import huxagon.util.pathWayFinder.IPathWayFinder;

/**
 * @author mj
 */
public class SameLinePathWay implements IPathWayFinder {

	@Override
	public boolean isMatch(Coordinate begin, Coordinate end) {
		
		return Line.isSameLine(begin, end);
	}

	@Override
	public Collection<Coordinate> cal(Coordinate begin, Coordinate end) {
		return new Line(begin,end).getCoors();
	}

}
