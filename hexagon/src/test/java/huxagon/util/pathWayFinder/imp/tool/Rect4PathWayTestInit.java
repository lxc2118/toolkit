package huxagon.util.pathWayFinder.imp.tool;

import junit.framework.TestCase;

/**
 * @author mj
 */
public class Rect4PathWayTestInit extends Rect4PathWayBaseTest {
	public void testInit(){
		Rect4PathWay r4p = this.build(3, 1, 11, 3);
		System.out.println(r4p.getPoint1());
	}
	public void testInit1(){
		Rect4PathWay r4p = this.build( 11, 3,3, 1);
		System.out.println(r4p.getPoint1());
	}
	
	public void testInit3(){
		Rect4PathWay r4p = this.build( 9, 1,3, 3);
		System.out.println(r4p.getPoint1());
	}
	
	public void testInit4(){
		Rect4PathWay r4p = this.build(1, 3, 9, 1);
		System.out.println(r4p.getPoint1());
	}
}
