package ch8;

public abstract class Unit {
	
	int hp;
	int atPoint;
	int dmPoint;
	
	void attack(Unit unit) {
		unit.hp-=atPoint;
		System.out.println(unit.hp);
	}
	
}
