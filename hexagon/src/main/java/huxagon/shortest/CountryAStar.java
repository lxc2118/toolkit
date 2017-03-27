package huxagon.shortest;

import huxagon.coordinate.Coordinate;
import huxagon.inf.ICheckCoordinate;
import huxagon.shape.imp.Circle;
import huxagon.shortest.pathNode.Node;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CountryAStar {	
	/**
	 * 
	 * @param s 开始据点的坐标
	 * @param e 目标据点的坐标
	 * @param iCheck 所有不能走的障碍据点的坐标集合
	 * @return 从开始据点到目标据点的距离，如果两点之间没有通路则返回-1
	 */
	static public int submit(Coordinate s,Coordinate e,ICheckCoordinate iCheck){
		if(s==null || e==null){
			throw new IllegalArgumentException();
		}
		Map<Coordinate,Node> open = new HashMap<Coordinate,Node>();
		HashSet<Coordinate> closed = new HashSet<Coordinate>();
		closed.add(s);
		Node start = new Node();
		start.setCoor(s);
		open.put(s, start);
		Node endNode=cal(e,open,closed,iCheck);
		if(endNode==null){
			return -1;
		}
		
		return endNode.acqPath().size()-1;
	}
	
		
	protected static Node cal(
				Coordinate e,
				Map<Coordinate,Node> open,
				HashSet<Coordinate> closed,
				ICheckCoordinate iCheck){
		
		boolean find = false;
		while(!find){
			Node node = findLeastF(open);
			if(node==null) return null;
			
			for(Coordinate coor:getCoors(node,iCheck)){
				if(!closed.contains(coor)){
					if(e.equals(coor)){
						Node openNode = new Node();
						openNode.setParent(node);
						openNode.g=node.g+1;
						openNode.setCoor( coor);
						openNode.h = e.distance(coor);
						return openNode;
					}else if(open.containsKey(coor)){
						Node openNode = open.get(coor);
						if(openNode.g>node.g+1){
							openNode.g=node.g+1;
							openNode.setParent(node);
						}
					}else{
						Node openNode = new Node();
						openNode.setParent(node);
						openNode.g=node.g+1;
						openNode.setCoor( coor);
						openNode.h = e.distance(coor);
						open.put(coor, openNode);
					}
				}
			}
			open.remove(node.acqCoor());
			closed.add(node.acqCoor());
		}
		return null;
	}
	

	
	static protected Node findLeastF(Map<Coordinate,Node> map){
		int val = 999999999;
		Node ret = null;
		if(map.size()==0){
			return null;
		}
		for(Node node:map.values()){
		
			if(node.f()<val){
				val = node.f();
				ret = node;
			}
		}
		return ret;
	}
	/**
	 * 返回当前据点node可以走的下一个据点坐标集合	
	 * @param node
	 * @param checker
	 * @return
	 */
	private static Collection <Coordinate> getCoors(Node node,ICheckCoordinate checker){
		//集合set存储的是据点node在没有障碍点的情况下可以走的据点坐标
		HashSet<Coordinate> set = new HashSet<Coordinate>();
		CountryMap map = new CountryMap();
		int nodeXcoor = node.acqCoor().getXcoor();
		int nodeYcoor = node.acqCoor().getYcoor();
		for(Coordinate coor : new Circle(node.acqCoor(),1).getCoors()){
			if(map.check(coor)){				
				Coordinate targetCoor = new Coordinate(coor.getXcoor() * 2 - nodeXcoor, coor.getYcoor() * 2 - nodeYcoor);
				set.add(targetCoor);
			}
		}			
		//对集合set进行遍历，把不能走的障碍点排除掉，然后存储在集合ret里面并返回t
		HashSet<Coordinate> ret = new HashSet<Coordinate>();		
		if(set!=null){ 
			for(Coordinate coor:set){
				if(coor!=null ){
					if(checker==null || checker.check(coor)){
						ret.add(coor);
					}
				}
			}
		}
		return ret;
	}
}
