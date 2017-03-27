package huxagon.shape.checker.imp;

import java.util.Collection;

import huxagon.coordinate.Coordinate;
import huxagon.shape.checker.RangeChecker;
import huxagon.shape.imp.Circle;

public class BlockRange extends RangeChecker {

	@Override
	public boolean check(Coordinate coor) {
		if(this.coors.contains(coor)){
			return false;
		}
		return isBlock(coor);
		
	}
	
	private boolean isBlock(Coordinate coor){
		if(this.coors.contains(coor)) return false;
		Coordinate c = range.getCenter();
		int dis = c.distance(coor);
		if(dis==1 ){
			return !this.coors.contains(coor);
		}
		for(Coordinate cd:new Circle(coor,1).getCoors()){
			
			if(c.distance(cd)==dis-1){
				if(!range.isBlock(cd)){
					return true;
				}
			}
		}
		return false;
	}
	

	public BlockRange(Collection<Coordinate> coors) {
		super(coors);
	}

	
	
}
