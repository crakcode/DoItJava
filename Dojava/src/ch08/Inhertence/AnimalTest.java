package ch08.Inhertence;

class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}



class Human extends Animal{
	public void move() {
		System.out.println("����� �ȴ´�.");
	}
}
class Tiger extends Animal{


	public void move() {
		System.out.println("���ڰ� �����δ�.");
	}
	
}
class Eagle extends Animal{


	public void move() {
		System.out.println("�������� �����δ�.");
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