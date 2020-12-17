package ch09.AbstractClass;

public abstract class Car {

//	���ø� �޼��� �� �߻�Ŭ����
	public abstract void drive();
	public abstract void stop();
	
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	public void turnoff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
//	���ø� �޼���
// final�� ����ȸ޼������ �Ϸ��� �ڵ����� ���ɶ� �����ϴ� �����̴�.
// �߻�Ŭ������ ����� �κ��� �ڵ����� ������ ���� �޶����� ������
// ���� Ŭ������ ���߾ �����ؾ� �Ѵ�.
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
		System.out.println("���� �����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("������ ����ϴ�.");		
	}
	
	
}

class ManualCar extends Car{

	@Override
	public void drive() {

		System.out.println("����ڰ� ������ �����մϴ�.");
	}

	@Override
	public void stop() {

		System.out.println("����ڰ� ����ϴ�.");
	}
	
	
	
}