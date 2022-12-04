package ch12;

import java.util.*;

public class HashSet1 {

	public static void main(String[] args) {

		Set set = new HashSet();
		
		//set의 크기가 6까지 1~45난수 저장
		for(int i=0; set.size() < 6; i++) { //set.size() < 6인 이유: size=6일때, false로 for문 안도니까
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set); //Set이니 순서없이 나열됨 순서를 나열하고 싶다면?
		
		List list = new LinkedList(set); //LinkedList(Collection c) 이용
		
		Collections.sort(list); // LinkedList(Collection c)
		System.out.println(list); //Collections.sort(List list)
		
	}

}
