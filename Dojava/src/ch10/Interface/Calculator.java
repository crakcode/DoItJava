package ch10.Interface;



//Calc 인터페이스를 받는다.
// 이후 구현을 해야되며 클래스 다이어그램에서ㅏ 인터페익스를 구현하는것은 점선이다.
// 추상클래스로 선언하여 인터페이스의 일부만을 구현한다.
public abstract class Calculator implements Calc{

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	@Override
	public int sub(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

	@Override
	public void description() {
		System.out.println("Calculator의 오버라이딩");
	}
	
}

