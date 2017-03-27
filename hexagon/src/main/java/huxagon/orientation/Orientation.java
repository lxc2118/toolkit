package huxagon.orientation;

import huxagon.coordinate.Coordinate;
import huxagon.shape.imp.Line;

import java.util.ArrayList;
import java.util.List;



public abstract class Orientation {
	abstract public int getCode();
	abstract protected boolean doMatch(Coordinate coor1,Coordinate coor2);
	
	
	
	@Override
	public String toString() {
		
		return this.getClass().getSimpleName();
	}
	public boolean match(Coordinate coor1,Coordinate coor2){
		if(coor1==null || coor2==null) throw new IllegalArgumentException();
		if(!Line.isSameLine(coor1, coor2)) throw new IllegalArgumentException();
		return doMatch(coor1,coor2);
	}
	
	public Orientation abs(){
		return this;
	}
	
	public Coordinate buildCoor(Coordinate coor){
		return this.buildCoor(coor, 1);
	}
	
	public Coordinate buildCoor(Coordinate coor,int range){
		if(coor==null) return null;
		return doBuildCoor(coor,range);
	}
	
	public abstract Coordinate doBuildCoor(Coordinate coor,int range);
	
	public List<Coordinate> getCoors(Coordinate coor,int range){
		List<Coordinate> ret = new ArrayList<Coordinate>();
		for(int i=1;i<=range;i++)
			ret.add(this.buildCoor(coor, i));
		return ret;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Orientation)) return false;
		return this.getCode()==((Orientation)obj).getCode();
	}
	@Override
	public int hashCode() {
	 
		return this.getCode();
	}
	
}
