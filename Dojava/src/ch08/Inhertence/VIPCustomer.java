package ch08.Inhertence;

public class VIPCustomer extends Customer{
	private int agentID; //vip �������
	double saleRatio; //������
	
	public VIPCustomer() {
		CGrade="VIP"; //���� Ŭ�������� �������� ���� public ����
		bRatio=0.05;
		saleRatio=0.1;
	}
	
	public int getAgentID() {
		return agentID;
	}
	
}
