package ch06.Class2;


class Student{
	
	public String stuName;
	public int grade;
	public int money;
	
	
	public Student(String stuName,int money) {
		this.stuName=stuName;
		this.money=money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money-=1000;
	}
	
	public void takeTaxi(Taxi taxi,int money) {
		taxi.takeTaxi(money);
		taxi.passNum++;
		this.money-=money;
	}
	
}

class Bus{
	int busNum;
	int passCount;
	int money;
	
	public Bus(int busNum) {
		this.busNum=busNum;
	}
	
	public void take(int money) {
		this.money+=money;
		passCount++;
	}
	public void showInfo() {
		System.out.println("����"+busNum+"���� �°���"+passCount+"���̰� ������ "+money);
	}
	
	
	
}


class Taxi{
	String tNum;
	int passNum;
	int price;
	Taxi(String tNum){
		this.tNum=tNum;
	}
	
	
	void takeTaxi(int price) {
		this.price+=price;
	}
	
	void showInfo() {
		System.out.println(tNum+"�ý�" +"�������� "+price+"�°�����"+passNum);
	}
	
}



public class e2_cooperation {

}
