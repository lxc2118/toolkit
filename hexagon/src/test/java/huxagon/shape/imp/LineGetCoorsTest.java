package huxagon.shape.imp;

import java.util.List;

import huxagon.coordinate.Coordinate;
import junit.framework.TestCase;

public class LineGetCoorsTest extends TestCase {
	public void testGetCoors(){
		Line line = new Line(
				new Coordinate(8,2),
				new Coordinate(14,2)
				);
		List <Coordinate> list = (List)line.getCoors();
		assertEquals(list.get(0), new Coordinate(8,2));
		assertEquals(list.get(1), new Coordinate(10,2));
		assertEquals(list.get(2), new Coordinate(12,2));
		assertEquals(list.get(3), new Coordinate(14,2));
	}
	
	public void testGetCoors2(){
		Line line = new Line(
				new Coordinate(8,2),
				new Coordinate(5,5)
				);
		List<Coordinate> list = (List)line.getCoors();
		assertEquals(list.get(0), new Coordinate(8,2));
		assertEquals(list.get(1), new Coordinate(7,3));
		assertEquals(list.get(2), new Coordinate(6,4));
		assertEquals(list.get(3), new Coordinate(5,5));
	}
	
	public void testGetCoors3(){
		Line line = new Line(
				new Coordinate(8,2),
				new Coordinate(6,2)
				);
		List<Coordinate> list = (List)line.getCoors();
		assertEquals(list.get(0), new Coordinate(8,2));
		assertEquals(list.get(1), new Coordinate(6,2));
		
	}
}
