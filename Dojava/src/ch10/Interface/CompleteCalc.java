package ch10.Interface;


//Calculator(�߻�Ŭ����) ���� �������� ���� ���� ��Ŭ�������� ����
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
		System.out.println("Calc �������̽��� �����Ͽ���.");
	}
	
	@Override
	public void description() {
		super.description();
		//�������̽����� ������ �޼��带 ����Ѵ�.
		// �� Calc���� ������ �޼��带 �̿��ؼ� �����ش�.
	}
	
}