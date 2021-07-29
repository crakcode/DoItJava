package ch8;

public abstract class Unit {
	
	int hp;
	int atPoint;
	int dmPoint;
	void attack(Unit unit,int atPoint) {
		System.out.println("atPoint:"+atPoint);
		unit.hp-=atPoint;
		System.out.println(unit.hp);
	}
	
}
