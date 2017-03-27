package huxagon.util.pathWayFinder.imp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import huxagon.coordinate.Coordinate;
import huxagon.util.pathWayFinder.IPathWayFinder;

/**
 * 当x坐标相同时候的查询方法
 * @author mj
 */
public class SameXPathWay implements IPathWayFinder{

	@Override
	public boolean isMatch(Coordinate begin, Coordinate end) {
		return begin.getXcoor()==end.getXcoor();
	}

	@Override
	public Collection<Coordinate> cal(Coordinate begin, Coordinate end) {
		ArrayList<Coordinate> ret = new ArrayList<Coordinate>();
		ret.add(begin);
		int step = begin.getYcoor()>end.getYcoor()?-1:1;
		int yCoor = begin.getYcoor()+step;
		boolean same = false;	//是否和初始的坐标具有相同的x 系列（同偶数 或者 同奇数）
		while(isNotFinish(yCoor,end,step)){
			if(!same){
				ret.add(new Coordinate(begin.getXcoor()-1,yCoor));
				ret.add(new Coordinate(begin.getXcoor()+1,yCoor));
			}else{
				ret.add(new Coordinate(begin.getXcoor(),yCoor));
				
			}
			yCoor +=step;
			same = !same;
		}
		return ret;
	}
	private boolean isNotFinish(int yCoor,Coordinate c,int step){
		if(step==1)
			return yCoor<=c.getYcoor();
		else
			return yCoor>=c.getYcoor();
	}
	
}
