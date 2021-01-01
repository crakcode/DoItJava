package ch05.Class1;

public class Transport {

	
	public static void main(String[] args) {
		Student stu1=new Student();
		stu1.age=10;
		stu1.wallet=0;
		stu1.ride_bus(1000);
		
		
		
	}
}

class Student{
	int age;
	int wallet;
	String name;
	
	void ride_bus(Bus bus) {
		
		wallet-=bus.pay;
	}
	
	void showInfo() {
		System.out.println();
	}
	
}
class Bus{
	int WholePay;
	int count;
	
	void ride(int pay) {
		WholePay+=pay;
		count+=1;
	}
	
}

