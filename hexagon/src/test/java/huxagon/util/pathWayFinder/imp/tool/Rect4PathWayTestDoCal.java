package huxagon.util.pathWayFinder.imp.tool;

import huxagon.coordinate.Coordinate;

/**
 * @author mj
 */
public class Rect4PathWayTestDoCal extends Rect4PathWayBaseTest {
	public void testDoCal1(){
		for(Coordinate c:this.build(0, 0, 8, 4).doCal()){
			System.out.println(c);
		}
	}
}
