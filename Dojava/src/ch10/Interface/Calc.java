package ch10.Interface;





public interface Calc {

	
	//�������̽����� ������ ������ ������ ������ ����� ��ȯ��
	double PI=3.14;
	int ERROR=-999999999;
	
	//�������ͽ����� ������ �޼���� ������ �������� �߻� �޼���� ��ȯ��
	int add(int num1,int num2);
	int sub(int num1,int num2);
	int times(int num1,int num2);
	int divide(int num1,int num2);
	
	
	//�̷��� ������ ���� Ŭ�������� �����Ҽ��ִ�. 
	
	
	//default �޼���
//	������ �������̽������� �߻�޼���� ������ �������������� �����ϴ°��� �ȵƴ�.
	default void description()
	{
		System.out.println("���� ���⸦ �����մϴ�.");
	}

	
	//���� �޼��� 
	//stattic�� ����Ͽ� ���� �ϸ� Ŭ���� ������ �����ϰ� ����Ҽ��ִ�.
	static int total(int[] arr) {
		int total=0;
		for(int i:arr) {
			total+=1;
			
		}
		return total;
	}

	
}