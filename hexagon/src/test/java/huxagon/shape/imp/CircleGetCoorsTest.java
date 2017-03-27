package huxagon.shape.imp;



import huxagon.coordinate.Coordinate;
import junit.framework.TestCase;

public class CircleGetCoorsTest extends TestCase {

	
	public void testGetCoor() {
		Circle circle = new Circle(new Coordinate(11,1),1);
		for(Coordinate c:circle.getCoors()){
			System.out.println(c);
		}
	}

	public void testGetCoor2() {
		Circle circle = new Circle(new Coordinate(8,2),2);
		for(Coordinate c:circle.getCoors()){
			System.out.println(c);
		}
	}
}
