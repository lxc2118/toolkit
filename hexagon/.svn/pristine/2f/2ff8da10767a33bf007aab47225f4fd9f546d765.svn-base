package huxagon.shortest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import huxagon.coordinate.Coordinate;
import huxagon.inf.ICheckCoordinate;
import huxagon.shape.imp.Circle;
import huxagon.shortest.pathNode.PathNode;

public class AStarRange {
	public static Collection<PathNode> submit(Coordinate coordinate,int range,
			ICheckCoordinate iCheck){
		Map<Coordinate,PathNode> map = new HashMap<Coordinate,PathNode>();
		map.put(coordinate, new PathNode(coordinate));
		return cal(map,range,iCheck);
	}
	
	protected static Collection<PathNode> cal(Map<Coordinate,PathNode> map,
			int range
			,ICheckCoordinate iCheck){
		HashSet<PathNode> closed = new HashSet<PathNode>();
		while(map.size()!=0){
			PathNode node = findLeast(map);
			if(node.getCnt()<range){
				for(Coordinate coor:new Circle(node.acqCoor()).getCoors(iCheck)){
					if(iCheck==null || iCheck.check(coor)){
						if(!closed.contains(coor)){
							
							PathNode openNode = map.get(coor);
							if(openNode!=null){
								if(openNode.getCnt()>node.getCnt()+1){
									openNode.setParent(node);
								}
							}else{
								openNode = new PathNode(coor,node);
								map.put(coor, openNode);
							}
						}
					}
				}
			}
			map.remove(node.acqCoor());
			
			closed.add(node);
		}
		return closed;
		
	}
	
	static protected PathNode findLeast(Map<Coordinate,PathNode> map){
		int val = 999999999;
		PathNode ret = null;
		if(map.size()==0){
			return null;
		}
		for(PathNode node:map.values()){
		
			if(node.getCnt()<val){
				val = node.getCnt();
				ret = node;
			}
		}
		return ret;
	}
}
