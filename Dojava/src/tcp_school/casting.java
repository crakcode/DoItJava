package tcp_school;

public class casting {

	
//	이떄 중요한것은 다형성은 부모에서 자식으로는 되지만 자식에서 부모는 안된다.
//	왜냐하면 상속 받은 자식이 메소드가 더 많거나 같을수 있기 떄문이다.
//	참고: https://change-words.tistory.com/24
	public static void main(String[] args) {
	    Car car = null; // Car 타입의 참조변수 car에 null 값 선언
	    FireEngine fe = new FireEngine(); // FireEngine 타입의 참조변수 fe로 FireEngine 객체 생성
	    FireEngine fe2 = null; // FireEngine 타입의 참조변수 fe2로에 null 값 선언

	    car = fe; 
	        /*조상 <- 자손 형변환. "(데이터 타입)값" 같은 형식의 형변환 생략함.
	        조상타입의 참조변수로 자손의 인스턴스를 참조. 
	        기본형 변수의 형변환에서 작은 자료형에서 큰 자료형의 형변환은 생략이 가능하듯이, 
	        참조형 변수의 형변환에서는 자손타입의 참조변수를 조상타입으로 형변환하는 경우에는 형변환을 생략.*/
	    car.drive(); // okay.
	    car.water(); // error. FireEngine 클래스에만 있는 water() 메서드는 사용 못함.

	    fe2 = (FireEngine)car; 
	    	/* 자손 <- 조상 형변환. 
	        자손타입의 참조변수로 조상의 인스턴스를 참조 (FireEngine)로 형변환.*/
	    fe2.drive(); // okay.
	    fe2.water(); // okay.
	}

}

class Car { // 조상 클래스 Car
	   String color;
	   int door;

	   void drive(){}
	   void stop() {}
}
class FireEngine extends Car { // 자손 클래스 FireEngine
	    void water(){}
}


