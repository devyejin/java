package ch12;

import java.util.*;
public class TreeSetEx1 {
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set.add("abc"); set.add("alien"); set.add("bat");
		set.add("car"); set.add("Car"); set.add("disc");
		set.add("dance"); set.add("dZZZZ"); set.add("dzzzz");
		set.add("elephant"); set.add("elevator"); set.add("fan");
		set.add("flower");
		
		System.out.println(set);
//[Car, abc, alien, bat, car, dZZZZ, dance, disc, dzzzz, elephant, elevator, fan, flower]
//TreeSet은 저장하려는 객체의 내부기준으로 정렬(String 클래스) - 대문자가 소문자보다 앞
		
		System.out.println("range search : from " + from + " to " + to);
		//SortedSet subSet(Object fromE, Object toE) 범위 검색 (fromE와 toE 사이)의 결과 반환
		System.out.println("result1 : " + set.subSet(from, to));
		//result1 : [bat, car]
		
		System.out.println("result2 : " + set.subSet(from, to + "zzz"));
		//result2 : [bat, car, dZZZZ, dance, disc]

		
	}
}
