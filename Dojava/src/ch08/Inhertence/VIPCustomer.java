package ch08.Inhertence;

public class VIPCustomer extends Customer{
	private int agentID; //vip �������
	double saleRatio; //������
	int bonusRation;
	
	public VIPCustomer() {
		this.CGrade="VIP"; //���� Ŭ�������� �������� ���� public ����
		bRatio=0.05;
		saleRatio=0.1;

	}
	
	public VIPCustomer(int CId,String CName,String CGrade) {
		super();
		this.CId=CId;
		this.CName=CName;
		this.CGrade="VIP"; //���� Ŭ�������� �������� ���� public ����
		bRatio=0.05;
		saleRatio=0.1;
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRation;
		return bonusPoint;
	}
	
}
