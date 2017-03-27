package huxagon.shortest.pathNode;

import huxagon.coordinate.Coordinate;

public class Node extends Path {

	
	
	public int g;
	public int h;
	
	
	public int f(){
		return g+h;
	}
	
	@Override
	public int hashCode() {
		return this.acqCoor().hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if(!(obj instanceof Node)) return false;
		Node node = (Node)obj;
		return acqCoor().equals(node.acqCoor());
	}

	

	

}
