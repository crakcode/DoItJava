package ch08.Inhertence;

public class colleage {
	public static void main(String[] args) {
		
		colleage c1=new colleage();
		c1.setClass(new Student());
		c1.setClass(new Professor());
		
	}
	
	void setClass(Person person) {
		person.setName("�л�");
		person.showInfo();
	}
	
}


class Person{
	int info_num;
	String name;
	
	void setName(String name) {
		this.name=name;
	}
	void showInfo() {
		System.out.println("�̸���"+this.name);

	}
}

class Student extends Person{
	void showInfo() {
		System.out.println("�л� �̸���"+this.name);
	}
	
}

class Professor extends Person{
	void showInfo() {
		System.out.println("���� �̸���"+this.name);

	}
	
}