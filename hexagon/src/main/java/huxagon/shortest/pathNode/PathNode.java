package huxagon.shortest.pathNode;

import huxagon.coordinate.Coordinate;
import huxagon.inf.ICoor;

public class PathNode extends Path implements ICoor{
	
	
	private int cnt;
	
	
	public PathNode(Coordinate coor){
		this.coor = coor;
	}
	public PathNode(Coordinate coor, PathNode parent) {
		
		this.coor = coor;
		this.setParent(parent);
		this.cnt=parent.cnt+1;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	
	@Override
	public String toString() {
		return coor.toString();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null || !(obj instanceof PathNode)) return false;
		PathNode node = (PathNode)obj;
		return coor.equals(node.coor);
	}
	@Override
	public int hashCode() {
		return coor.hashCode();
	}
	
}
