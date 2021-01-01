package ch10.Interface;





public interface Calc {

	
	//인터페이스에서 선언한 변수는 컴파일 과정에 상수로 변환됨
	double PI=3.14;
	int ERROR=-999999999;
	
	//인터페익스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환됨
	int add(int num1,int num2);
	int sub(int num1,int num2);
	int times(int num1,int num2);
	int divide(int num1,int num2);
	
	
	//이렇게 선언한 것을 클래스에서 구현할수있다. 
	
	
	//default 메서드
//	기존의 인터페이스에서는 추상메서드와 변수만 생성가능했으며 구현하는것은 안됐다.
	default void description()
	{
		System.out.println("정수 계산기를 구현합니다.");
	}

	
	//정적 메서드 
	//stattic을 사용하여 정의 하며 클래스 생성과 무관하게 사용할수있다.
	static int total(int[] arr) {
		int total=0;
		for(int i:arr) {
			total+=1;
			
		}
		return total;
	}

	
}