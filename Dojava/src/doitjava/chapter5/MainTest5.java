package doitjava.chapter5;

public class MainTest5 {
	public static void main (String[] args) {

		System.out.println("hello world");
		 MyDate date1= new  MyDate(30,2,2000);
		 System.out.println(date1.isVaild());

		 MyDate date2= new  MyDate(0,11,2000);
		 System.out.println(date2.isVaild());

	}
}
