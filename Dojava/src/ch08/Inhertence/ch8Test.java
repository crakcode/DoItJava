package ch08.Inhertence;

public class ch8Test {
	public static void main(String[] args) {
	Customer c1=new Customer();
	c1.setCId(110011);
	c1.setCName("¿Ãº¯Ω≈");
	c1.bonusPoint=1000;
	c1.showCustomerInfo();

	System.out.println(	c1.showCustomerInfo());
	
	
	VIPCustomer v1=new VIPCustomer();
	v1.setCName("±Ë¿ØΩ≈");
	v1.setCId(10020);
	v1.bonusPoint=10000;
	System.out.println(v1.showCustomerInfo());
	
	
	
	VIPCustomer v2=new VIPCustomer(1000,"¿Ã√¢º∑","VIP");
	System.out.println(v2.showCustomerInfo());
	
	}
	
	
	
}
