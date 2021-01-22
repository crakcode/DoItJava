package ch8;

import java.util.ArrayList;


public class Test {

	public static void main(String[] args) {

		
		User u1=new User();
		u1.setId(1);
		u1.setName("edw");
		
		User u2=new User();
		u2.setId(1);
		u2.setName("edw");

		
		ArrayList<User> userList = new ArrayList<User>();
		userList.add(u1);
		userList.add(u2);
		
		for(int i=0;i<2;i++) {
			System.out.println(i+"¹ø¤Š"+userList.get(i).getName());
		}
		
		
		marin m1=new marin();
		zergling z1=new zergling();
		glrat g1=new glrat();
		System.out.println(m1.atPoint);
		m1.attack(z1);
		System.out.println(z1.hp);
		
	}
	

}
