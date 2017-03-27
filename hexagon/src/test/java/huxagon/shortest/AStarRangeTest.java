package huxagon.shortest;

import huxagon.coordinate.Coordinate;
import huxagon.inf.impl.BlockCheck;
import huxagon.shortest.pathNode.PathNode;

import java.util.List;

import junit.framework.TestCase;

public class AStarRangeTest extends TestCase {
	public void testSubmit(){
		java.util.Collection<PathNode> coors = AStarRange.submit(
				new Coordinate(12,4), 
				3, 
				/*
				new BlockCheck(
						new Coordinate(12,4), 
					new Coordinate(14,4),
					new Coordinate(13,5)
				)*/
				null
				);
		for(PathNode coor:coors){
			System.out.println(coor);
			/*
			if(coor.acqCoor().equals(new Coordinate(16,4))){
				System.out.println("==============");
				for(Coordinate c:coor.acqPath()){
					System.out.println(c);
				}
				System.out.println("==================");
			}*/
		}
		
	}
	public void testSubmit2(){
		Coordinate coor1 = new Coordinate(4,2);
		java.util.Collection<PathNode> coors = AStarRange.submit(
				coor1,
				3, 
				
				null
				);
		for(PathNode coor:coors){
			System.out.println(coor);
			//if(coor1.dist(coor)>3)
			//	System.out.println(coor);
			
		}
		
	}
	/**
	 * Çó·¶Î§Ëã·¨
	 */
	public void testSubmit3(){
		Coordinate coor1 = new Coordinate(4,2);
		java.util.Collection<PathNode> coors = AStarRange.submit(
				coor1,
				0, 
				
				null
				);
		for(PathNode coor:coors){
			System.out.println(coor);
			//if(coor1.dist(coor)>3)
			//	System.out.println(coor);
			
		}
		
	}
	
}
