package ch8.inheritance;

public class ch8Test {
	public static void main(String[] args) {
	Customer c1=new Customer();
	c1.setCId(110011);
	c1.setCName("이순신");
	c1.bonusPoint=1000;
	c1.showCustomerInfo();

	System.out.println(	c1.showCustomerInfo());
	
	
	VIPCustomer v1=new VIPCustomer();
	v1.setCName("김유신");
	v1.setCId(10020);
	v1.bonusPoint=10000;
	System.out.println(v1.showCustomerInfo());
	
	
	}
	
	
	
}
