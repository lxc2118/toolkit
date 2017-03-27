package huxagon.shape;

import java.util.ArrayList;
import java.util.List;

import huxagon.coordinate.Coordinate;
import huxagon.inf.ICheckCoordinate;
import huxagon.inf.IHasCoorsWithChecker;

import java.util.Collection;

public abstract class Shape implements IHasCoorsWithChecker {
	
	public abstract Collection<Coordinate> getCoors();
	public Collection <Coordinate> getCoors(ICheckCoordinate checker){
		List<Coordinate> ret = new ArrayList<Coordinate>();
		Collection<Coordinate> list = this.getCoors();
		if(list!=null){ 
			for(Coordinate coor:list){
				if(coor!=null ){
					if(checker==null || checker.check(coor)){
						ret.add(coor);
					}
				}
			}
		}
		return ret;
	}
}
