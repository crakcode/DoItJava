package ch12.collection;

import java.util.HashSet;


public class Set {

	
	
	public static void main(String[] args) {
		HashSet<String> hashSet=new HashSet<String>();
		
		hashSet.add("임정순");
		hashSet.add("홍연의");
		hashSet.add("임정순");
		
		System.out.println(hashSet);
		
	}
}
