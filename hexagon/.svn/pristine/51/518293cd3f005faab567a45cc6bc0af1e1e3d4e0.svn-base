package huxagon.shortest;

import java.util.Collection;
import java.util.HashSet;

import huxagon.coordinate.Coordinate;
import huxagon.inf.ICheckCoordinate;

public class CountryMap implements ICheckCoordinate{
	private Collection<Coordinate> coors;
	/**
	 * 保存国战地图的图形结构，国战地图的图形结构由点和边构成，init()方法把所有的边的坐标都存储在this.coors里面
	 */
	public CountryMap(){
		this.coors = new HashSet<Coordinate>();
		init();				
	}
	
	private void init(){
		addCoor(10,8);
		addCoor(7,7);
		addCoor(9,7);
		addCoor(11,7);
		addCoor(13,7);
		addCoor(4,6);
		addCoor(12,6);
		addCoor(1,5);
		addCoor(3,5);
		addCoor(7,5);
		addCoor(13,5);
		addCoor(2,4);
		addCoor(10,4);
		addCoor(1,3);
		addCoor(3,3);
		addCoor(7,3);
		addCoor(13,3);
		addCoor(4,2);
		addCoor(12,2);
		addCoor(7,1);
		addCoor(9,1);
		addCoor(11,1);
		addCoor(13,1);
		addCoor(10,0);
	}
	
	private void addCoor(int m, int n){
		this.coors.add(new Coordinate(m,n));
	}

	@Override
	public boolean check(Coordinate coor) {		
		return this.coors.contains(coor);
	}
}
