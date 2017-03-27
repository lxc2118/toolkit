package huxagon.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import huxagon.coordinate.Coordinate;
import huxagon.util.pathWayFinder.IPathWayFinder;
import huxagon.util.pathWayFinder.imp.NormalPathWay;
import huxagon.util.pathWayFinder.imp.NullPathWay;
import huxagon.util.pathWayFinder.imp.SameLinePathWay;
import huxagon.util.pathWayFinder.imp.SameXPathWay;

/**
 * 弹道计算
 * @author mj
 *
 */
public class Pathway {
	
	private static IPathWayFinder[] finders = {
		new NullPathWay(),
		new SameXPathWay(),
		new SameLinePathWay(),
		new NormalPathWay()
	};
	
	/**
	 * 计算弹道
	 * @param begin
	 * @param end
	 * @return
	 */
	public static Collection<Coordinate> cal(Coordinate begin,Coordinate end){
		
		for(IPathWayFinder finder:finders){
			if(finder.isMatch(begin, end)){
				return finder.cal(begin, end);
			}
		}
		return new ArrayList();
		
	}
}
