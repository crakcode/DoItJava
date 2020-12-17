package ch09.AbstractClass;

public abstract class Car {

//	템플릿 메서드 와 추상클래스
	public abstract void drive();
	public abstract void stop();
	
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnoff() {
		System.out.println("시동을 끕니다.");
	}
	
//	템플릿 메서드
// final의 선언된메서드들은 일련의 자동차가 사용될때 동작하는 과정이다.
// 추상클래스로 선언된 부분은 자동차의 종류에 따라서 달라지기 때문에
// 각자 클래스에 맞추어서 구현해야 한다.
	final public void  run() {
		startCar();
		drive();
		stop();
		turnoff();
	}
	

	
}
class AiCar extends Car{

	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다.");		
	}
	
	
}

class ManualCar extends Car{

	@Override
	public void drive() {

		System.out.println("사용자가 운전을 시작합니다.");
	}

	@Override
	public void stop() {

		System.out.println("사용자가 멈춥니다.");
	}
	
	
	
}