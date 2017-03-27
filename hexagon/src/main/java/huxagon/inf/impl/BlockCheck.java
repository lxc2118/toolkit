package huxagon.inf.impl;

import huxagon.coordinate.Coordinate;
import huxagon.inf.ICheckCoordinate;
import huxagon.inf.ICoor;

import java.util.Collection;
import java.util.HashSet;

public class BlockCheck implements ICheckCoordinate {
	private Collection<Coordinate> coors;
	
	public BlockCheck(Collection<Coordinate> coors) {
		this.coors = coors;
		
	}
	
	public void set(Collection<ICoor> iCoors){
		this.coors = new HashSet<Coordinate>();
		for(ICoor icoor:iCoors){
			if(icoor!=null)
				this.coors.add(icoor.acqCoor());
		}
	}
	
	public BlockCheck(Coordinate ... coors) {
		this.coors = new HashSet<Coordinate>();
		for(Coordinate coor:coors){
			this.coors.add(coor);
		}
		
	}


	@Override
	public boolean check(Coordinate coor) {
		
		return !this.coors.contains(coor);
	}
}
