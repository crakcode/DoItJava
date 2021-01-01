package ch09.AbstractClass;

public class Player {


	public PlayerLevel level;
	
	
//	public Player(){
//		level=new BeginnerLevel();
//		level.showLevelMessage();
//	}
	
	void getLevel() {
		System.out.println(level);
	}
	
	void upLevel(PlayerLevel level) {
		this.level=level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
	
	
}
