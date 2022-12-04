package ch12;

import java.util.*;

public class TreeSetEx2 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = { 80, 95, 50, 35, 45, 65, 10, 100 };

		// TreeSet : 중복X, 순서X, int타입이니 오름차순으로 저장할테야 ( 검색,범위검색 유리 )
		for (int i = 0; i < score.length; i++) {
//			set.add(score[i]);
			// 배열에 담긴 값으로 Integer 객체를 만들어서 set에 저장 ( 즉, 정수값으로 저장 )
			set.add(new Integer(score[i])); // boolean add(Object o)

		}
		// SortedSet headSet(Object toElement) : 지정된 객체보다 작은 값(미만)
		System.out.println("50보다 작은 값:" + set.headSet(new Integer(50)));
		// SortedSet tailSet(Object fromElement) : 지정된 객체보다 큰 값(초과)
		System.out.println("50보다 큰 값:" + set.tailSet(new Integer(50)));
		// SortedSet subSet(fromElement, toElement)
		System.out.println("40과 80사이의 값:" + set.subSet(40,80));

	}

}
