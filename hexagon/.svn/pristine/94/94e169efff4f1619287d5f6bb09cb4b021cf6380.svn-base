package huxagon.shortest;

import java.util.List;

import huxagon.coordinate.Coordinate;
import huxagon.inf.impl.BlockCheck;
import huxagon.shape.imp.Circle;
import junit.framework.TestCase;

public class AStarTest extends TestCase {
	public void testSubmit(){
		
		List<Coordinate> coors = AStar.submit(
				new Coordinate(7,1), 
				new Coordinate(8,4), 
				new BlockCheck(
					new Coordinate(3,3),
					new Coordinate(7,3),
					new Coordinate(9,3),
					new Coordinate(5,3),
					new Coordinate(4,2)
				));
		for(Coordinate coor:coors){
			System.out.println(coor);
		}
		
	}
	
	public void testSubmit2(){
		
		List<Coordinate> coors = AStar.submit(
				new Coordinate(7,1), 
				new Coordinate(8,4), 
				new BlockCheck(
					new Coordinate(5,1),
					new Coordinate(6,2),
					new Coordinate(8,2),
					new Coordinate(9,1)
				));
		for(Coordinate coor:coors){
			System.out.println(coor);
		}
		
	}
	
	public void testSubmit3(){
		
		List<Coordinate> coors = AStar.submit(
				new Coordinate(7,1), 
				new Coordinate(8,4), 
				new BlockCheck(
					new Circle(new Coordinate(7,1),1).getCoors()
					
				));
		System.out.println(coors);
		
	}
	
	public void testSubmit4(){
		
		List<Coordinate> coors = AStar.submit(
				new Coordinate(7,1), 
				new Coordinate(8,4), 
				new CountryMap());
		System.out.println(coors);
		
	}
}
