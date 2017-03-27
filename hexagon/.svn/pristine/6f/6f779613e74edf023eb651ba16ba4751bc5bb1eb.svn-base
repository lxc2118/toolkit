package huxagon.util.pathWayFinder.imp.tool;

import java.util.ArrayList;
import java.util.Collection;

import huxagon.coordinate.Coordinate;
import huxagon.orientation.Orientation;
import huxagon.orientation.OrientationFac;
import huxagon.shape.imp.Line;
import huxagon.util.Pathway;

/**
 * 计算弹道用的长方形类
 * @author mj
 */
public class Rect4PathWay {
	private Coordinate begin;
	private Coordinate end;
	private Coordinate point1; //四边形的一点  和end具有相同y坐标   
	/**
	 * 计算相交点的顶角
	 * @return
	 */
	protected static Coordinate buildPointAngle(Coordinate begin, Coordinate end){
		
		Coordinate ret = null;
		int yspan = Math.abs(end.getYcoor()-begin.getYcoor());
		int x1 = begin.getXcoor()+yspan;
		int x2 = begin.getXcoor()-yspan;
		
		if(x1>end.getXcoor() && x2<end.getXcoor()){
			
			int span1 = (x1-end.getXcoor())/2;
			int span2 = (end.getXcoor()-x2)/2;
			if(span1<span2){
				
				ret = doBuildPointAngle(begin,end,span1);
			}else{
				ret = doBuildPointAngle(begin,end,span2);
			}
		}else{
			ret = buildSameYPointAngle(begin,end);
			if(ret.distance(begin)<ret.distance(end)){
				ret = buildSameYPointAngle(end, begin);
			}
			
		}
		return ret;
	}
	
	protected static Coordinate doBuildPointAngle(Coordinate begin,Coordinate end,int span){
		int step = end.getYcoor()<begin.getYcoor()?1:-1;
		int y = end.getYcoor()+span*step;
		Coordinate ret = new Coordinate(end.getXcoor()-span,y);
		if(!Line.isSameLine(begin, ret))
			ret = new Coordinate(end.getXcoor()+span,y);
		return ret;
		
		
	}
	
	protected static Coordinate buildSameYPointAngle(Coordinate begin, Coordinate end){
		int y = end.getYcoor();
		int step = begin.getXcoor()<end.getXcoor()?1:-1;
		int x = begin.getXcoor()+step * Math.abs(y-begin.getYcoor());
		return new Coordinate(x,y);
	}
	
	public Rect4PathWay(Coordinate begin, Coordinate end) {
		super();
		this.begin = begin;
		this.end = end;
		init();
	}
	/**
	 * 求出point1
	 */
	private void init(){
		this.point1 =buildPointAngle(begin,end);
		
	}
	
	
	public Coordinate getPoint1() {
		return point1;
	}
	/**
	 * 计算弹道
	 * @return
	 */
	public Collection<Coordinate> cal(){
		if(this.isSquare()){
			return doCalSquare();
		}else{
			return doCal();
		}
	}
	protected Collection<Coordinate> doCal(){
		ArrayList<Coordinate> list = new ArrayList<Coordinate>();
		Coordinate cur = begin;
		Orientation b2p = OrientationFac.get(begin,point1);
		Orientation p2e = OrientationFac.get(point1,end); 
		int cnt = begin.distance(point1)+1;
		int now = 1;
		float sum = 0;
		float step = ((float)(point1.distance(end)+1))/((float)cnt);
		for(int i=0;i<cnt;i++){
			list.add(cur);
			sum=sum+step;
			if(sum<=now){
				cur = b2p.buildCoor(cur);
			}else{
				
				cur = p2e.buildCoor(cur);
				list.addAll(Pathway.cal(cur, end)); //以这个点继续出发再去计算
				break;
			}
		}
		return list;
	}
	
	protected static Coordinate move(Coordinate p1,Coordinate p2){
		if(p1.getYcoor()==p2.getYcoor()){
			int step = p1.getXcoor()<p2.getXcoor()?1:-1;
			return new Coordinate(p1.getXcoor()+2*step,p1.getYcoor());
		}else{
			int xstep = p1.getXcoor()<p2.getXcoor()?1:-1;
			int ystep = p1.getYcoor()<p2.getYcoor()?1:-1;
			return new Coordinate(p1.getXcoor()+xstep,p1.getYcoor()+ystep);
		}
	}
	
	/**
	 * 正方形情况下的计算
	 * @return
	 */
	protected Collection<Coordinate> doCalSquare(){
	
		ArrayList<Coordinate> list = new ArrayList<Coordinate>();
		list.add(begin);
		Coordinate cur = begin;
		boolean odd = true;
		int xstep = begin.getXcoor()<end.getXcoor()?1:-1;
		int ystep = begin.getYcoor()<end.getYcoor()?1:-1;
		while(!cur.equals(end)){
			if(odd){
				list.add(new Coordinate(cur.getXcoor()+xstep,cur.getYcoor()+ystep));
				list.add(new Coordinate(cur.getXcoor()+xstep*2,cur.getYcoor()));
			}else{
				cur = new Coordinate(cur.getXcoor()+xstep*3,cur.getYcoor() + ystep);
				list.add(cur);
			}
			odd = !odd;

		}

		return list;
	}
	
	/**
	 * 
	 * @return
	 */
	protected boolean isSquare(){
		return this.point1.distance(begin)
				==this.point1.distance(end);
	}
}
