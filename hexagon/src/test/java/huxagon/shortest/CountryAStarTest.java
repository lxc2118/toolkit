package huxagon.shortest;

import java.util.List;

import huxagon.coordinate.Coordinate;
import huxagon.inf.impl.BlockCheck;
import junit.framework.TestCase;

public class CountryAStarTest extends TestCase {	
	public void testSubmit() {
		int i = CountryAStar.submit(
				new Coordinate(0,4), 
				new Coordinate(6,2), 
				new BlockCheck(
//					new Coordinate(6,6),
					new Coordinate(8,0),
//					new Coordinate(8,4),
					new Coordinate(2,2)
				));	
		
		System.out.println(i);
		
		
	}
	

}
