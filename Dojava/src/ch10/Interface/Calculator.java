package ch10.Interface;



//Calc �������̽��� �޴´�.
// ���� ������ �ؾߵǸ� Ŭ���� ���̾�׷������� �������ͽ��� �����ϴ°��� �����̴�.
// �߻�Ŭ������ �����Ͽ� �������̽��� �Ϻθ��� �����Ѵ�.
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
		System.out.println("Calculator�� �������̵�");
	}
	
}

