package doitjava.chapter6;

public class MainTest6 {
	public static void main (String[] args) {

		System.out.println("hello world");

		Person p1=new Person();
		p1.age=30;
		p1.name="용팔이";
		System.out.println(p1.name);
		
				
		
		Bus b1=new Bus(751);
		b1.money=20000;
		
		Student stu1=new Student("박용식",10000);
		stu1.takeBus(b1);
		

		b1.showInfo();
		System.out.println(stu1.money);
		

		Taxi t1=new Taxi("30가 2894");
		
		stu1.takeTaxi(t1,1000);
		System.out.println(stu1.money);
		t1.showInfo();
		
		
		
		System.out.println("은행 입출력 계좌 시스템");
		User u1=new User("홍길동",110440955,10000);
		
		Bank B1=new Bank();
		
		u1.deposit(B1, 2000);
		System.out.println("user의 입금"+u1.money);
		B1.showInfo();
		
		u1.withdraw(B1, 4000);
		System.out.println("user의 출금"+u1.money);
		B1.showInfo();
		
		
	
	}
}
