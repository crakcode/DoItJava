package ch09.AbstractClass;

public abstract class PlayerLevel {
	abstract void run();
	abstract void jump();
	abstract void turn();
	abstract void showLevelMessage();

	
	final public void go(int count) {
		run();
		for(int i=0;i<count;i++) {
			jump();			
		}
		turn();
	}	
}


class BeginnerLevel extends PlayerLevel{

	@Override
	void run() {

		System.out.println("천천히 달립니다.");
	}

	@Override
	void jump() {
		System.out.println("jump할지 모른다");
	}

	@Override
	void turn() {

		System.out.println("turn 할줄모른다.");
	}

	@Override
	void showLevelMessage() {

		System.out.println("초보자 입니다.");
	}
	
	
	
}