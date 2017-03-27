package huxagon.shortest.pathNode;

import java.util.ArrayList;
import java.util.List;

import huxagon.coordinate.Coordinate;
import huxagon.shortest.pathNode.inf.IPath;

/**
 * @author mj
 */
public class OneCoorPath implements IPath {
	
	
	public OneCoorPath(Coordinate coordinate) {
		super();
		this.coordinate = coordinate;
	}

	private Coordinate coordinate;
	
	@Override
	public Coordinate acqCoor() {
		return coordinate;
	}

	@Override
	public List<Coordinate> acqPath() {
		ArrayList<Coordinate> list = new ArrayList();
		list.add(coordinate);
		return list;
	}

	@Override
	public int acqPathSize() {
		return 1;
	}

}
