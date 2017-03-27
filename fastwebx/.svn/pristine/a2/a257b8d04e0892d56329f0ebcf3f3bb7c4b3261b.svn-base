package com.fastwebx.db.dao.change;


import com.fastwebx.db.dao.event.PojoChange;

public class ChangeContext<Keeper extends AllChangeEventKeeper> {
	
	
	private ThreadLocal<AllChangeEventKeeper> keeperLocal = new ThreadLocal<AllChangeEventKeeper>();
	
	public ChangeContext(){
		
	}
	
	private AllChangeEventKeeper getKeeper(){
		AllChangeEventKeeper keeper = keeperLocal.get();
		if(keeper == null){
			keeper = build();
			keeperLocal.set(keeper);
		}
		return keeper;
		
	}
	
	protected AllChangeEventKeeper build(){
		return new AllChangeEventKeeper();
	}
	
	public void add(PojoChange pce){
		if(pce!=null){
			getKeeper().add(pce);
		}
	}
	
	public Keeper getAndClear(){
		AllChangeEventKeeper keeper = keeperLocal.get();
		if(keeper==null){
			return null;
		}
		keeperLocal.remove();
		
		return (Keeper)keeper;
	}
	
	public void clear(){
		keeperLocal.remove();
	}
	
	public static void main(String[] args){
		new ChangeContext().clear();
	
	}
}
