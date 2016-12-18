package hcy.util.kit.pattern.adapter;

public class AdapterTest {

	public static void main(String[] args) {
		Home home = new Home();
		// 在英国
		IEnglishPlugin englishPlugin = new EnglishPlugin();
		home.setPlugin(englishPlugin);
		home.charge();
		
		// 在中国
		IChinaPlugin chinaPlugin = new ChinaPlugin();
		PluginAdapter pluginAdapter = new PluginAdapter(chinaPlugin);
		home.setPlugin(pluginAdapter);
		home.charge();
	}
}
