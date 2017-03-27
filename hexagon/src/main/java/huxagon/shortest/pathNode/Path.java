package huxagon.shortest.pathNode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import huxagon.coordinate.Coordinate;
import huxagon.inf.ICoor;
import huxagon.shortest.pathNode.inf.IPath;

public abstract class Path implements IPath{
	protected Coordinate coor;
	protected Path parent;
	public void setCoor(Coordinate coor) {
		this.coor = coor;
	}

	public void setParent(Path parent){
		this.parent=parent;
	}
	public Path acqParent(){
		return parent;
	}
	
	
	public List<Coordinate> acqPath(){
		ArrayList<Coordinate> list = new ArrayList<Coordinate>();
		Path  endNode = this;
		while(endNode!=null){
			list.add(endNode.coor);
			endNode = endNode.acqParent();
		}
		ArrayList<Coordinate> ret = new ArrayList<Coordinate>();
		for(int i=list.size()-1;i>=0;i--){
			ret.add(list.get(i));
		}
		return ret;
	}
	
	public int acqPathSize(){
		List<Coordinate> list= this.acqPath();
		if(list==null) return 0;
		return list.size();
	}
	
	@Override
	public Coordinate acqCoor() {
		return coor;
	}

}
