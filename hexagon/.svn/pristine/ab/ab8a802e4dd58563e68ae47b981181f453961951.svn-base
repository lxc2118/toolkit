package huxagon.inf.impl;

import huxagon.coordinate.Coordinate;
import huxagon.inf.ICheckCoordinate;

/**
 * 两个点路径下的的checker
 * @author mj
 */
public class CoorsPathChecker implements ICheckCoordinate{
	private Coordinate begin;
	private Coordinate end;
	private ICheckCoordinate checker;
	public Coordinate getBegin() {
		return begin;
	}
	public void setBegin(Coordinate begin) {
		this.begin = begin;
	}
	public Coordinate getEnd() {
		return end;
	}
	public void setEnd(Coordinate end) {
		this.end = end;
	}
	public ICheckCoordinate getChecker() {
		return checker;
	}
	public void setChecker(ICheckCoordinate checker) {
		this.checker = checker;
	}
	@Override
	public boolean check(Coordinate coor) {
		if(begin!=null && begin.equals(coor)) return true;
		if(end!=null && end.equals(coor)) return true;
		if(checker!=null){
			return checker.check(coor);
		}
		return true;
	}
	
}
