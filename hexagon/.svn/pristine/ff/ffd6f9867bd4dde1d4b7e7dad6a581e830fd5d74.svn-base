package huxagon.shape.imp;

import java.util.HashSet;

import huxagon.coordinate.Coordinate;
import huxagon.shape.checker.imp.BlockRange;
import junit.framework.TestCase;

public class RangeTest extends TestCase {
	public void testgetCoor(){
		Range range = new Range(new Coordinate(8,2),2);
		for(Coordinate c:range.getCoors()){
			System.out.println(c);
		}
	}
	
	public void testBlock(){
		HashSet<Coordinate> set = new HashSet<Coordinate>();
		set.add(new Coordinate(10,2));
		BlockRange b = new BlockRange(set);
		
		Range range = new Range(new Coordinate(8,2),2,b);
		for(Coordinate c:range.getBlockCoors()){
			System.out.println(c);
		}
		System.out.println("=================");
		for(Coordinate c:range.getCoors()){
			System.out.println(c);
		}
	}
	public void testBlock2(){
		HashSet<Coordinate> set = new HashSet<Coordinate>();
		set.add(new Coordinate(14,4));
		BlockRange b = new BlockRange(set);
		
		Range range = new Range(new Coordinate(12,4),5,b);
		for(Coordinate c:range.getBlockCoors()){
			System.out.println(c);
		}
		System.out.println("=================");
		for(Coordinate c:range.getCoors()){
			System.out.println(c);
		}
	}
	
	public void testBlock3(){
		HashSet<Coordinate> set = new HashSet<Coordinate>();
		set.add(new Coordinate(9,3));
		set.add(new Coordinate(8,4));
		BlockRange b = new BlockRange(set);
		
		Range range = new Range(new Coordinate(11,3),5,b);
		for(Coordinate c:range.getBlockCoors()){
			System.out.println(c);
		}
		System.out.println("=================");
		for(Coordinate c:range.getCoors()){
			System.out.println(c);
		}
	}
	
}
