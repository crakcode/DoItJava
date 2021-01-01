package ch10.Interface;


//상담원 한명씩 돌아가며 동일하게 상담업무 배분
public class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {	
		System.out.println("상담 전활르 순서대로 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다.");
	}

}

class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담업무가 없거나 대기가 적은 상담원에게 할당합니다.");
	}
	

}


class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 skill값이 높은 상담원에게 우선적으로 배분합니다.");
		
	}
}

	
