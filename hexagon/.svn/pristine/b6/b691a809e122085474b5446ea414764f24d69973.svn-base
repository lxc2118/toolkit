package huxagon.coordinate;

import huxagon.inf.ICoor;

public class Coordinate implements ICoor {
	@Override
	public Coordinate acqCoor() {
		return this;
	}

	private int xcoor;
	private int ycoor;
	public int getXcoor() {
		return xcoor;
	}
	public void setXcoor(int xcoor) {
		this.xcoor = xcoor;
	}
	public int getYcoor() {
		return ycoor;
	}
	public void setYcoor(int ycoor) {
		this.ycoor = ycoor;
	}
	public Coordinate(int xcoor, int ycoor) {
		super();
		this.xcoor = xcoor;
		this.ycoor = ycoor;
	}
	public Coordinate(){
		
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if(obj instanceof Coordinate){
			Coordinate coor = (Coordinate)obj;
			return coor.getXcoor()==xcoor 
					&& coor.getYcoor()==ycoor;
		}
		return false;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("x:")
			.append(xcoor)
			.append(" y:")
			.append(ycoor);
		return sb.toString();
	}
	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}
	
	public int distance(Coordinate coor){
		if(coor==null) return 0;
		if(this.xcoor==coor.getXcoor())
			return Math.abs(this.ycoor-coor.getYcoor());
		int yDis = Math.abs(this.ycoor-coor.getYcoor());
		int ret = (yDis
				+Math.abs(this.xcoor-coor.getXcoor()))/2;
		if(ret<yDis){
			ret = yDis;
		}
		return ret;
	}
	
	public int dist(ICoor coor){
		if(coor==null) return 0;
		return this.distance(coor.acqCoor());
	}
	
	public Integer getSeq() {
		return ycoor * 4 + xcoor / 2;
	}
}
