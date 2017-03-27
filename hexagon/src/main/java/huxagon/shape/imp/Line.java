package huxagon.shape.imp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import huxagon.coordinate.Coordinate;
import huxagon.orientation.Orientation;
import huxagon.orientation.OrientationFac;
import huxagon.shape.Shape;

public class Line extends Shape{
	private Coordinate coor1;
	private Coordinate coor2;
	public static boolean isSameLine(Coordinate coor1,Coordinate coor2){
		if(coor1==null || coor2==null)
			throw new IllegalArgumentException();
		if(coor1.equals(coor2)) return false;
		if(coor1.getYcoor()==coor2.getYcoor()){
			return true;
		}
		return Math.abs(coor1.getXcoor()-coor2.getXcoor())==Math.abs(coor1.getYcoor()-coor2.getYcoor());
	}

	
	
	public Line(Coordinate coor1, Coordinate coor2) {
		if(coor1==null  || coor2==null || !isSameLine(coor1,coor2))
			throw new IllegalArgumentException();
		this.coor1 = coor1;
		this.coor2 = coor2;
	}



	@Override
	public Collection<Coordinate> getCoors() {
		List<Coordinate> ret = new ArrayList<Coordinate>();
		ret.add(coor1);
		ret.addAll(this.getInnerCoors());
		ret.add(coor2);
		return ret;
	}
	
	public Collection<Coordinate> getInnerCoors() {
		List<Coordinate> ret = new ArrayList<Coordinate>();
		Orientation o = OrientationFac.get(coor1,coor2);
		Coordinate tmp = o.buildCoor(coor1);
		while(!tmp.equals(coor2)){
			ret.add(tmp);
			tmp = o.buildCoor(tmp);
		}
		
		return ret;
	}
	
	
}
