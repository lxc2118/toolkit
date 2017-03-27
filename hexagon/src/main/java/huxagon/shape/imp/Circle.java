package huxagon.shape.imp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import huxagon.coordinate.Coordinate;
import huxagon.orientation.Orientation;
import huxagon.orientation.OrientationFac;
import huxagon.shape.Shape;

public class Circle extends Shape{
	private Coordinate center;
	private int radius;
	public Circle(Coordinate center,int radius){
		if(center==null || radius<=0) throw new IllegalArgumentException();
		this.center = center;
		this.radius = radius;
	}
	
	public Circle(Coordinate center){
		int radius = 1;
		if(center==null || radius<=0) throw new IllegalArgumentException();
		this.center = center;
		this.radius = radius;
	}

	@Override
	public Collection <Coordinate> getCoors() {
		List<Coordinate> ret = new ArrayList<Coordinate>();
		if(radius==1){
			for(Orientation o:OrientationFac.all()){
				ret.add(o.buildCoor(center));
			}
		}else{
			for(Orientation o:OrientationFac.all()){
				Coordinate c = o.buildCoor(this.center, this.radius);
				Line line = new Line(c,
						OrientationFac.get(o.getCode()+1).buildCoor(center, radius));
				ret.add(c);
				ret.addAll(line.getInnerCoors());
			}
		}
		return ret;
	}
	
	
	
}
