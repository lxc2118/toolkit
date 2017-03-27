package huxagon.inf.impl;

import java.util.ArrayList;
import java.util.Collection;

import huxagon.coordinate.Coordinate;
import huxagon.inf.ICheckCoordinate;

public class CoorArrayCheck implements ICheckCoordinate {
	 
	private Collection<ICheckCoordinate> arrays;
	
	
	public CoorArrayCheck(Collection<ICheckCoordinate> arrays) {
		this.arrays = arrays;
	}

	public CoorArrayCheck(ICheckCoordinate... checkers){
		if(checkers != null){
			arrays = new ArrayList<ICheckCoordinate>();
			for(ICheckCoordinate checker:checkers){
				arrays.add(checker);
			}
		}
	}
	
	@Override
	public boolean check(Coordinate coor) {
		if(arrays!=null){
			for(ICheckCoordinate checker:arrays){
				if(!checker.check(coor))
					return false;
			}
		}
		
		return true;
	}
	
}
