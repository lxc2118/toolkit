package hcy.util.kit.pattern.adapter;

public class Home {

	private IEnglishPlugin plugin;
	
	public Home(){
	}

	public IEnglishPlugin getPlugin() {
		return plugin;
	}

	public void setPlugin(IEnglishPlugin plugin) {
		this.plugin = plugin;
	}
	
	public void charge() {
		plugin.chargeWith3Pins();
	}
}
