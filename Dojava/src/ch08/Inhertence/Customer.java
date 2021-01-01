package ch08.Inhertence;

public class Customer {
	public int getCId() {
		return CId;
	}

	public void setCId(int cId) {
		CId = cId;
	}

	public String getCName() {
		return CName;
	}

	public void setCName(String cName) {
		CName = cName;
	}

	public String getCGrade() {
		return CGrade;
	}

	public void setCGrade(String cGrade) {
		CGrade = cGrade;
	}

	protected int CId;
	protected String CName;
	protected String CGrade;
	
	//���� Ŭ�������� ����Ҽ��ֵ��� protected�� �����Ѵ�
	//���� ������ ����ϱ� ���ؼ� get()/ set() �޼��带 ����Ѵ�.
	
	
	int bonusPoint;
	double bRatio;
	
	public Customer() {
		CGrade="SILVER";
		bRatio=0.01;
		
	}
	
	public int calcPrice(int price) {
		bonusPoint+=price*bRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return CName+"���� �����"+CGrade+"���ʽ� ����Ʈ��:"+bonusPoint;
	}
}
