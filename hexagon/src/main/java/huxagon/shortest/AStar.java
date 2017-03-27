package huxagon.shortest;

import huxagon.coordinate.Coordinate;
import huxagon.inf.ICheckCoordinate;
import huxagon.shape.imp.Circle;
import huxagon.shortest.pathNode.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class AStar {
	/**
	 * 查询最短路径
	 * @param s
	 * @param e
	 * @param iCheck
	 * @return
	 */
	static public List<Coordinate> submit(Coordinate s,Coordinate e,ICheckCoordinate iCheck){
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
			return null;
		}
		
		return endNode.acqPath();
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
			
			for(Coordinate coor:new Circle(node.acqCoor(),1).getCoors(iCheck)){
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
	
	
}
