package ch05.Class1;

public class MainTest5 {
	public static void main (String[] args) {

		System.out.println("hello world");
		 MyDate date1= new  MyDate(30,2,2000);
		 System.out.println(date1.isVaild());

		 MyDate date2= new  MyDate(0,11,2000);
		 System.out.println(date2.isVaild());

		 
		 
		 Student stu1=new Student();
		 stu1.name="�ڵ���";
		 
		 Student stu2=new Student();
		 stu2.name="ȣ����";
		 
		 System.out.println(stu1);
		 System.out.println(stu2);
		 
		 // Person Ŭ���� ������ ����
		 Person p1=new Person("ȫ�浿",173,170);
		 p1.showInfo();
		 
		 Person p2=new Person("ȫ�浿");
		 p2.showInfo();
		 
		 
		 // �������� private ����
		 Student s2=new Student();
		 s2.setAge(3);
		 System.out.println(s2.getAge());		 
		 
		 
	}
}
