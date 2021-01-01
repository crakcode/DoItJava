package ch05.Class1;

public class MainTest5 {
	public static void main (String[] args) {

		System.out.println("hello world");
		 MyDate date1= new  MyDate(30,2,2000);
		 System.out.println(date1.isVaild());

		 MyDate date2= new  MyDate(0,11,2000);
		 System.out.println(date2.isVaild());

		 
		 
		 Student stu1=new Student();
		 stu1.name="박동팔";
		 
		 Student stu2=new Student();
		 stu2.name="호식이";
		 
		 System.out.println(stu1);
		 System.out.println(stu2);
		 
		 // Person 클래스 생성자 설명
		 Person p1=new Person("홍길동",173,170);
		 p1.showInfo();
		 
		 Person p2=new Person("홍길동");
		 p2.showInfo();
		 
		 
		 // 정보은닉 private 연습
		 Student s2=new Student();
		 s2.setAge(3);
		 System.out.println(s2.getAge());		 
		 
		 
	}
}
