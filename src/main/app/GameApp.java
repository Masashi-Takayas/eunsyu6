package app;

public class GameApp {

	public String item;
	
	public GameApp() {
		
	}
	
	public GameApp(String item) {
		this.item = item;
	}
	
	public String start(String name) {
		String fight;
		
		fight = name+"さんと"+item+"でゲームを開始します";
		
		return fight;
	}
}
