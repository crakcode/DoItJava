package ch10.Interface;

import java.io.IOException;

public class test10 {
	public static void main(String[] args) throws IOException{

//	10-1. Calculator 테스트
	CompleteCalc ca1=new CompleteCalc();
	System.out.println(ca1.add(3,4));
	System.out.println(ca1.divide(3,0));
	
	//이때  Calc의 객체이기에 Calc의 메서드에서 구현된 부분만 사용이가능하다.
	// 즉 CompleteCalc 의 독자적인 메서드는 사용이 불가하다.

//	10-2 인터페이스 상속과 다형성

	
	System.out.println("전화 상담 할당 방식 ");
	System.out.println("R: 차례대로 / L:적은 상담원 /P:우선순위 ");
	
	int ch=System.in.read();
	Scheduler scheduler=null;
	
	if (ch=='R') {
		scheduler=new RoundRobin();
		
	}
	else if(ch=='L') {
		scheduler=new LeastJob();

	}
	else if(ch=='P'){
		scheduler=new PriorityAllocation();

	}else {
		System.out.println("지원되지않는 기능입니다.");
	}
		
	scheduler.getNextCall();
	scheduler.sendCallToAgent();
	
	
//	10-3 디폴트 메서드, 정적메서드
	ca1.description();

	
	}
	
	
	
	
}
