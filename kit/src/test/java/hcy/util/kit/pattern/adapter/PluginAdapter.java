package hcy.util.kit.pattern.adapter;

public class PluginAdapter implements IEnglishPlugin{

	private IChinaPlugin plugin;
	
	public PluginAdapter(IChinaPlugin plugin) {
		this.plugin = plugin;
	}

	@Override
	public void chargeWith3Pins() {
		plugin.chargeWith2Pins();
	}
	
	
}
