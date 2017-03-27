package huxagon.orientation;

import huxagon.coordinate.Coordinate;
import huxagon.orientation.imp.*;
import huxagon.shape.exp.NotLine;
import huxagon.shape.imp.Line;

public class OrientationFac {
	final public static int left = 0;
	final public static int leftHigh = 1;
	final public static int rightHigh = 2;
	final public static int right = 3;
	final public static int rightLow = 4;
	final public static int leftLow = 5;
	
	
	private static Orientation[] orientations = {
		new Left(),
		new LeftHigh(),
		new RightHigh(),
		new Right(),
		new RightLow(),
		new LeftLow()
	};
	
	public static Orientation[] all(){
		return orientations;
	}
	
	public static Orientation get(int code){
		if(code<0 ) return null;
		if(code>=orientations.length) code = code % orientations.length;
		return orientations[code];
	}
	
	public static Orientation get(Coordinate coor1,Coordinate coor2){
		if(coor1 ==null || coor2==null){
			throw new IllegalArgumentException();
		}
		if(!Line.isSameLine(coor1, coor2)){
			throw new NotLine();
		}
		for(Orientation o:OrientationFac.all()){
			if(o.match(coor1,coor2)){
				return o;
			}
		}
		return null;
	}
}
