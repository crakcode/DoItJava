package tcp_school;

public class casting {

	
//	�̋� �߿��Ѱ��� �������� �θ𿡼� �ڽ����δ� ������ �ڽĿ��� �θ�� �ȵȴ�.
//	�ֳ��ϸ� ��� ���� �ڽ��� �޼ҵ尡 �� ���ų� ������ �ֱ� �����̴�.
//	����: https://change-words.tistory.com/24
	public static void main(String[] args) {
	    Car car = null; // Car Ÿ���� �������� car�� null �� ����
	    FireEngine fe = new FireEngine(); // FireEngine Ÿ���� �������� fe�� FireEngine ��ü ����
	    FireEngine fe2 = null; // FireEngine Ÿ���� �������� fe2�ο� null �� ����

	    car = fe; 
	        /*���� <- �ڼ� ����ȯ. "(������ Ÿ��)��" ���� ������ ����ȯ ������.
	        ����Ÿ���� ���������� �ڼ��� �ν��Ͻ��� ����. 
	        �⺻�� ������ ����ȯ���� ���� �ڷ������� ū �ڷ����� ����ȯ�� ������ �����ϵ���, 
	        ������ ������ ����ȯ������ �ڼ�Ÿ���� ���������� ����Ÿ������ ����ȯ�ϴ� ��쿡�� ����ȯ�� ����.*/
	    car.drive(); // okay.
	    car.water(); // error. FireEngine Ŭ�������� �ִ� water() �޼���� ��� ����.

	    fe2 = (FireEngine)car; 
	    	/* �ڼ� <- ���� ����ȯ. 
	        �ڼ�Ÿ���� ���������� ������ �ν��Ͻ��� ���� (FireEngine)�� ����ȯ.*/
	    fe2.drive(); // okay.
	    fe2.water(); // okay.
	}

}

class Car { // ���� Ŭ���� Car
	   String color;
	   int door;

	   void drive(){}
	   void stop() {}
}
class FireEngine extends Car { // �ڼ� Ŭ���� FireEngine
	    void water(){}
}


