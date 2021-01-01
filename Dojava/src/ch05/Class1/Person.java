package ch05.Class1;


// 생성자를 설명하기 위한 클래스
public class Person {

	String name;
	float height;
	float weight;
	
	
	public Person() {}
	// 디폴트 생성자 
	
	public Person(String name) {
		this.name=name;
	}
	
	public Person(String name,float height,float weight) {
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	
	void showInfo() {
		System.out.println("이름:"+name);
		System.out.println("키:"+height);
		System.out.println("몸무게:"+weight);
	}
}
