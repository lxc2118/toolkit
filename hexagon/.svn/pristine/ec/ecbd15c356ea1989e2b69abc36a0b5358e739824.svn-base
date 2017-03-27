package huxagon.shape.imp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import huxagon.coordinate.Coordinate;
import huxagon.shape.Shape;
import huxagon.shape.checker.RangeChecker;

public class Range extends Shape{
	private Coordinate center;
	private int radius;
	private HashSet<Coordinate> coors =new HashSet<Coordinate>();
	private HashSet<Coordinate> blockCoors =new HashSet<Coordinate>();
	
	public Coordinate getCenter() {
		return center;
	}
	public Range(Coordinate center,int radius){
		init(center,radius,null);
	}
	
	public Range(Coordinate center,int radius,RangeChecker rangeChecker){
		init(center,radius,rangeChecker);
	}
	protected void init(Coordinate center,int radius,RangeChecker rangeChecker){
		if(center==null || radius<=0) throw new IllegalArgumentException();
		this.center = center;
		this.radius = radius;
		if(rangeChecker!=null){
			rangeChecker.setRange(this);
		}
		coors.add(center);
		for(int i=1;i<=radius;i++){
			for(Coordinate c:new Circle(this.center,i).getCoors()){
				if(rangeChecker!=null && !rangeChecker.check(c)){
					blockCoors.add(c);
				}else{
					coors.add(c);
				}
				
			}
		}
	
	}
	public boolean isBlock(Coordinate coor){
		return blockCoors.contains(coor);
	}
	
	@Override
	public Collection <Coordinate> getCoors() {
		return coors;
	}
	public HashSet<Coordinate> getBlockCoors() {
		return blockCoors;
	}
	
	
}
