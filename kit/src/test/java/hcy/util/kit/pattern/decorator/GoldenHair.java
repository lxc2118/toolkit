package hcy.util.kit.pattern.decorator;

public class GoldenHair extends GirlDecorator{

	private Girl girl;
	
	public GoldenHair(Girl girl) {
		this.girl = girl;
	}
	
	@Override
	public String getDescription() {
		return girl.getDescription() + "with golden hair";
	}

}
