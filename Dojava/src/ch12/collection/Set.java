package ch12.collection;

import java.util.HashSet;


public class Set {

	
	
	public static void main(String[] args) {
		HashSet<String> hashSet=new HashSet<String>();
		
		hashSet.add("������");
		hashSet.add("ȫ����");
		hashSet.add("������");
		
		System.out.println(hashSet);
		
	}
}
