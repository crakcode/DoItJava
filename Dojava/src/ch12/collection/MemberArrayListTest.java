package ch12.collection;

import java.util.ArrayList;

class Member{
	public int getMemberId() {
		return memberId;
	}


	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}


	public String getMemberName() {
		return memberName;
	}


	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


	int memberId;
	String memberName;
	
	
	Member(int memberId,String memberName){
		this.memberId=memberId;
		this.memberName=memberName;
	}
}


class MemberArrayList {
	ArrayList<Member> arrayList;
	
	MemberArrayList(){
		arrayList=new ArrayList<Member>();
	}
	// member 형으로 선언한 ArrayList 생성
	
	void AddMember(Member member) {
		arrayList.add(member);
	}
	
	void getMember() {
		for(int i=0;i<arrayList.size();i++) {
			Member member=arrayList.get(i);
			System.out.println(member.memberId);
			System.out.println(member.memberName);
		}
	}

}
public class MemberArrayListTest {
	public static void main(String[] args) {
		Member mem1=new Member(1,"홍길동");
		Member mem2=new Member(2,"김동수");
		
		MemberArrayList array1=new MemberArrayList();

		array1.AddMember(mem1);
		array1.AddMember(mem2);
		
		array1.getMember();		
		
	}
}
