package ch08.Inhertence;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}



class Human extends Animal{
	public void move() {
		System.out.println("사람이 걷는다.");
	}
}
class Tiger extends Animal{


	public void move() {
		System.out.println("사자가 움직인다.");
	}
	
}
class Eagle extends Animal{


	public void move() {
		System.out.println("독수리가 움직인다.");
	}
	
}



public class AnimalTest{
	public static void main(String[] args) {
		AnimalTest aTest=new AnimalTest();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
		
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
}