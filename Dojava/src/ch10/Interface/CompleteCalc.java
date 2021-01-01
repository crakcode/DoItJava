package ch10.Interface;


//Calculator(추상클래스) 에서 구현하지 않은 것을 이클래스에서 구현
public class CompleteCalc extends Calculator{
	
	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		
		if(num2!=0) {
			return num1/num2;
		}
		else {
			return Calc.ERROR;
		}
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였다.");
	}
	
	@Override
	public void description() {
		super.description();
		//인터페이스에서 생성한 메서드를 사용한다.
		// 즉 Calc에서 선언한 메서드를 이용해서 보여준다.
	}
	
}