package huxagon.orientation;


import junit.framework.TestCase;
import huxagon.coordinate.Coordinate;
import huxagon.orientation.imp.Left;
import huxagon.orientation.imp.LeftHigh;
import huxagon.orientation.imp.LeftLow;
import huxagon.orientation.imp.Right;
import huxagon.orientation.imp.RightHigh;
import huxagon.orientation.imp.RightLow;



public class OrientationTest extends TestCase {

	
	public void testBuildCoor() {
		Coordinate coor = new Coordinate(8,2);
		System.out.println(new Left().buildCoor(coor, 1));
		assertTrue(new Coordinate(10,2).equals(
				new Left().buildCoor(coor, 1)));
		assertTrue(new Coordinate(10,0).equals(
				new LeftHigh().buildCoor(coor, 2)));
		assertTrue(new Coordinate(6,0).equals(
				new RightHigh().buildCoor(coor, 2)));
		assertTrue(new Coordinate(4,2).equals(
				new Right().buildCoor(coor, 2)));
		assertTrue(new Coordinate(5,5).equals(
				new RightLow().buildCoor(coor, 3)));
		assertTrue(new Coordinate(9,3).equals(
				new LeftLow().buildCoor(coor, 1)));
	}
	
	public void testMatch(){
		Coordinate coor = new Coordinate(8,2);
		assertEquals(OrientationFac.get(coor,new Coordinate(10,2)),
				OrientationFac.get(OrientationFac.left));
		assertEquals(OrientationFac.get(coor,new Coordinate(9,1)),
				OrientationFac.get(OrientationFac.leftHigh));
		assertEquals(OrientationFac.get(coor,new Coordinate(7,1)),
				OrientationFac.get(OrientationFac.rightHigh));
		assertEquals(OrientationFac.get(coor,new Coordinate(6,2)),
				OrientationFac.get(OrientationFac.right));
		assertEquals(OrientationFac.get(coor,new Coordinate(7,3)),
				OrientationFac.get(OrientationFac.rightLow));
		assertEquals(OrientationFac.get(coor,new Coordinate(9,3)),
				OrientationFac.get(OrientationFac.leftLow));
	}
	
	public  void testGetCoor(){
		Coordinate coor = new Coordinate(8,2);
		Orientation o =OrientationFac.get(OrientationFac.rightLow);
		for(Coordinate c1:o.getCoors(coor, 3))
			System.out.println(c1);
		
	}
}
