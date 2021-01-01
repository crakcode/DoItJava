package ch05.Class1;

public class MyDate {

	private int day;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	private int month;
	private int year;
	
	
	
	MyDate(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
		
	}
	public boolean isVaild() {
		int day=this.day;
		int month=this.month;
		int year=this.year;
		
		if(day >0 && day <31) {
			if(month>0 && month<13) {
				if(year>0) {
					System.out.println("유효한 날짜입니다.");
					return true;
				}
			}
		}
		System.out.println("유효 하지 않은 날짜입니다.");
		return false;
	}
}
