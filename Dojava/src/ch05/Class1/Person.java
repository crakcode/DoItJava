package ch05.Class1;


// �����ڸ� �����ϱ� ���� Ŭ����
public class Person {

	String name;
	float height;
	float weight;
	
	
	public Person() {}
	// ����Ʈ ������ 
	
	public Person(String name) {
		this.name=name;
	}
	
	public Person(String name,float height,float weight) {
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	
	void showInfo() {
		System.out.println("�̸�:"+name);
		System.out.println("Ű:"+height);
		System.out.println("������:"+weight);
	}
}
