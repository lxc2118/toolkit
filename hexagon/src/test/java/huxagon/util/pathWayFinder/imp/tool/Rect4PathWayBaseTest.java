package huxagon.util.pathWayFinder.imp.tool;

import junit.framework.TestCase;
import huxagon.coordinate.Coordinate;

/**
 * @author mj
 */
public class Rect4PathWayBaseTest  extends TestCase{
	protected Rect4PathWay build(int x1,int y1,int x2,int y2){
		return new Rect4PathWay(
			new Coordinate(x1,y1),
			new Coordinate(x2,y2)
		);
	}
}
