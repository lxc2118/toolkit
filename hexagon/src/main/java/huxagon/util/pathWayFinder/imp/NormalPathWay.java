package huxagon.util.pathWayFinder.imp;

import java.util.Collection;

import huxagon.coordinate.Coordinate;
import huxagon.util.pathWayFinder.IPathWayFinder;
import huxagon.util.pathWayFinder.imp.tool.Rect4PathWay;

/**
 * 通常
 * @author mj
 */
public class NormalPathWay implements IPathWayFinder  {

	
	@Override
	public boolean isMatch(Coordinate begin, Coordinate end) {
		return true;
	}

	@Override
	public Collection<Coordinate> cal(Coordinate begin, Coordinate end) {
		return new Rect4PathWay(begin, end).cal();
	}
	
}
