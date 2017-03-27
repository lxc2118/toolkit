package huxagon.shortest.pathNode;

import java.util.ArrayList;
import java.util.List;

import huxagon.coordinate.Coordinate;
import huxagon.shortest.pathNode.inf.IPath;

/**
 * @author mj
 */
public class ListPath implements IPath {
	
	private List<Coordinate> list;
	
	public ListPath(List<Coordinate> list){
		this.list = list;
	}
	
	public void setList(List<Coordinate> list) {
		this.list = list;
	}

	public ListPath(){
		
	}
	
	public void add(Coordinate c){
		if(c!=null)
			acqPath().add(c);
	}
	
	
	@Override
	public List<Coordinate> acqPath() {
		if(list==null)
			list = new ArrayList<Coordinate>();
		return list;
	}

	@Override
	public int acqPathSize() {
		
		return acqPath().size();
	}

	@Override
	public Coordinate acqCoor() {
		List<Coordinate> list = this.acqPath();
		if(list.size()==0)
			return null;
		return list.get(list.size()-1);
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		if(list!=null){
			for(Coordinate c:list){
				sb.append(c)
					.append("--");
			}
		}
		return sb.toString();
	}
	
	

}
