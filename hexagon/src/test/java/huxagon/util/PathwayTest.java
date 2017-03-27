package huxagon.util;

import java.util.Collection;

import huxagon.coordinate.Coordinate;
import junit.framework.TestCase;

/**
 * @author mj
 */
public class PathwayTest extends TestCase {
	private Coordinate c(int x,int y){
		return new Coordinate(x,y);
	}
	private Collection<Coordinate> cal(int x1,int y1,int x2,int y2){
		return Pathway.cal(c(x1,y1), c(x2,y2));
	}
	public void testFind1(){
		for(Coordinate c:cal(10,2,18,4)){
			System.out.println(c);
		}
	}
	
	public void testFind2(){
		for(Coordinate c:cal(0,0,18,4)){
			System.out.println(c);
		}
	}
	
	public void testFind3(){
		for(Coordinate c:cal(11,3,18,4)){
			System.out.println(c);
		}
	}
	
	public void testFind4(){
		for(Coordinate c:cal(12,4,11,1)){
			System.out.println(c);
		}
	}
	
	public void testFind5(){
		for(Coordinate c:cal(10,0,8,4)){
			System.out.println(c);
		}
	}
	
	public void testFind6(){
		for(Coordinate c:cal(12,4,10,0)){
			System.out.println(c);
		}
	}
	
	public void testFind7(){
		for(Coordinate c:cal(13,1,16,2)){
			System.out.println(c);
		}
	}
	
	public void testFind8(){
		for(Coordinate c:cal(14,2,14,4)){
			System.out.println(c);
		}
	}
	
	public void testFind9(){
		for(Coordinate c:cal(18,0,0,0)){
			System.out.println(c);
		}
	}
	
	public void testFind10(){
		for(Coordinate c:cal(1,1,0,4)){
			System.out.println(c);
		}
	}
	
	public void testFind11(){
		for(Coordinate c:cal(0,0,0,4)){
			System.out.println(c);
		}
	}
	
	public void testFind12(){
		for(Coordinate c:cal(7,1,1,3)){
			System.out.println(c);
		}
	}
	
	public void testFind13(){
		for(Coordinate c:cal(1,3,7,1)){
			System.out.println(c);
		}
	}
	
	public void testFind14(){
		for(Coordinate c:cal(6,0,2,4)){
			System.out.println(c);
		}
	}
	
	public void testFind15(){
		for(Coordinate c:cal(2,4,6,0)){
			System.out.println(c);
		}
	}
}
