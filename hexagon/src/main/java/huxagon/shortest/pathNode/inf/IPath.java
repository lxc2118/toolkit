package huxagon.shortest.pathNode.inf;

import huxagon.coordinate.Coordinate;
import huxagon.inf.ICoor;

import java.util.List;

/**
 * @author mj
 */
public interface IPath extends ICoor {
	List<Coordinate> acqPath();
	int acqPathSize();
	
}
