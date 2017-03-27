package huxagon.inf;

import huxagon.coordinate.Coordinate;

import java.util.Collection;

public interface IHasCoorsWithChecker extends IHasCoors{
	Collection <Coordinate> getCoors(ICheckCoordinate checker);
}	
