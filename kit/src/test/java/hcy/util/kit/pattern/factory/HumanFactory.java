package hcy.util.kit.pattern.factory;

public class HumanFactory {

	public static Human createHuman(String sex) {
		if (sex.equals("man")) {
			return new Man();
		}
		if (sex.equals("female")) {
			return new Female();
		}
		return null;
	}
}
