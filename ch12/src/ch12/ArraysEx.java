package ch12;

import java.util.*;

public class ArraysEx {

	public static void main(String[] args) {
		
	int[] arr7 = new int[5];
	
	
	Arrays.setAll(arr7, i->(int)(Math.random()*6)+1); 
	System.out.println("arr7= "+ Arrays.toString(arr7)); //랜덤 값 채움
	
	//향상된 for문
	/*
	 	for(타입 변수명 : 배열or컬렉션) {
	 		배열or컬렉션에 저장된 값이 반복문마다 하나씩 거내진다
	 */
	for(int i : arr7) {
		//index=i자리에 내 값 출력, 앞은 *채우기
		char[] ch = new char[i];
		Arrays.fill(ch, '*');
		System.out.println(new String(ch)+i);
	}
		
		
	}

}
