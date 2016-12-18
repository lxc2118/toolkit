package hcy.util.kit.pattern.decorator;

public class Test {

	public static void main(String[] args) {
		Girl girl = new AmericanGirl();
		System.out.println(girl.getDescription());
		
		GoldenHair goldenHair = new GoldenHair(girl);
		System.out.println(goldenHair.getDescription());
		
		Tall tall = new Tall(girl);
		System.out.println(tall.getDescription());
	}
}
