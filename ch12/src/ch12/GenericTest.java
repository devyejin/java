package ch12;

import java.util.*;


class Tv {}
class Audio{}

public class GenericTest {

	public static void main(String[] args) {
		
		ArrayList<Tv> list = new ArrayList<Tv>();
		// Tv타입의 객체만 저장 가능
		list.add(new Tv()); 
//		list.add(new Audio());
		
		Tv t = list.get(0); //Tv타입만 담기 때문에 반환타입도 Tv로되어 형변환이 필요 없음
		
		
	}

}
