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

		System.out.println("õõ�� �޸��ϴ�.");
	}

	@Override
	void jump() {
		System.out.println("jump���� �𸥴�");
	}

	@Override
	void turn() {

		System.out.println("turn ���ٸ𸥴�.");
	}

	@Override
	void showLevelMessage() {

		System.out.println("�ʺ��� �Դϴ�.");
	}
	
	
	
}