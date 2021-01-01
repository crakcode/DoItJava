package ch8.inheritance;

public class VIPCustomer extends Customer{
	private int agentID; //vip 전용상담원
	double saleRatio; //할인율
	
	public VIPCustomer() {
		CGrade="VIP"; //상위 클래스에서 가져오기 위해 public 선언
		bRatio=0.05;
		saleRatio=0.1;
	}
	
	public int getAgentID() {
		return agentID;
	}
	
}
