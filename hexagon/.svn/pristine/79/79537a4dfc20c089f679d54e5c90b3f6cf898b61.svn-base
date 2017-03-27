package huxagon.inf.impl;

import huxagon.coordinate.Coordinate;
import junit.framework.TestCase;

public class CoorArrayCheckTest extends TestCase {
	protected CoorArrayCheck build(){
		CoorArrayCheck check = new CoorArrayCheck(
				new CoorCheck(2,6),
				new ScopeCheck(4,10)
		);
		return check;
	} 
	public void testCheck1(){
		assertFalse(build().check(new Coordinate(2,6)));
	}
	
	public void testCheck2(){
		assertFalse(build().check(new Coordinate(5,9)));
	}
	
	public void testCheck3(){
		assertTrue(build().check(new Coordinate(3,9)));
	}
	
	public void testCheck4(){
		assertFalse(build().check(new Coordinate(6,9)));
	}
}
