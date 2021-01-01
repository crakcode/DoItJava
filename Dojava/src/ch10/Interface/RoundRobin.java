package ch10.Interface;


//���� �Ѹ� ���ư��� �����ϰ� ������ ���
public class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {	
		System.out.println("��� ��Ȱ�� ������� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ���� �������� ����մϴ�.");
	}

}

class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� �������� ���ų� ��Ⱑ ���� �������� �Ҵ��մϴ�.");
	}
	

}


class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� skill���� ���� �������� �켱������ ����մϴ�.");
		
	}
}

	
