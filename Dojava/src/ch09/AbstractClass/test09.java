package ch09.AbstractClass;

public class test09 {

	
	
	public static void main(String[] args){
		
		DeskTop d=new DeskTop();
		System.out.println("Desktop �����ֱ�");
		d.display();
		
		System.out.println("-------����������-----");
		AiCar ac=new AiCar();
		
		ac.run();
		
		System.out.println("-------�Ϲ���-----");
		ManualCar mc=new ManualCar();
		mc.run();
		
		
		
		Player p1=new Player();
		
	}
	
}
