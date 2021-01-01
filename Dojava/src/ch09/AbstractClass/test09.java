package ch09.AbstractClass;

public class test09 {

	
	
	public static void main(String[] args){
		
		DeskTop d=new DeskTop();
		System.out.println("Desktop 보여주기");
		d.display();
		
		System.out.println("-------자율주행차-----");
		AiCar ac=new AiCar();
		
		ac.run();
		
		System.out.println("-------일반차-----");
		ManualCar mc=new ManualCar();
		mc.run();
		
		
		
		Player p1=new Player();
		
	}
	
}
