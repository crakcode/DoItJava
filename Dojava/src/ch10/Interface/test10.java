package ch10.Interface;

import java.io.IOException;

public class test10 {
	public static void main(String[] args) throws IOException{

//	10-1. Calculator �׽�Ʈ
	CompleteCalc ca1=new CompleteCalc();
	System.out.println(ca1.add(3,4));
	System.out.println(ca1.divide(3,0));
	
	//�̶�  Calc�� ��ü�̱⿡ Calc�� �޼��忡�� ������ �κи� ����̰����ϴ�.
	// �� CompleteCalc �� �������� �޼���� ����� �Ұ��ϴ�.

//	10-2 �������̽� ��Ӱ� ������

	
	System.out.println("��ȭ ��� �Ҵ� ��� ");
	System.out.println("R: ���ʴ�� / L:���� ���� /P:�켱���� ");
	
	int ch=System.in.read();
	Scheduler scheduler=null;
	
	if (ch=='R') {
		scheduler=new RoundRobin();
		
	}
	else if(ch=='L') {
		scheduler=new LeastJob();

	}
	else if(ch=='P'){
		scheduler=new PriorityAllocation();

	}else {
		System.out.println("���������ʴ� ����Դϴ�.");
	}
		
	scheduler.getNextCall();
	scheduler.sendCallToAgent();
	
	
//	10-3 ����Ʈ �޼���, �����޼���
	ca1.description();

	
	}
	
	
	
	
}
