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
	
	//하위 클래스에서 사용할수있도록 protected로 선언한다
	//또한 변수를 사용하기 위해서 get()/ set() 메서드를 사용한다.
	
	
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
		return CName+"님의 등급은"+CGrade+"보너스 포인트는:"+bonusPoint;
	}
}
