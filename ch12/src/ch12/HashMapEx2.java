package ch12;

import java.util.*;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		// Object put(key, value)
		map.put("김자바", new Integer(90)); //뒤에꺼가 덮어씌워지면서 이건 지워짐
		map.put("김자바", new Integer(100));
		map.put("이자바", new Integer(100));
		map.put("강자바", new Integer(80));
		map.put("안자바", new Integer(90));

		// Set entrySet() ; Map의 entry들을 Set 에 담음
		Set set = map.entrySet(); // id가 독립적이니가 set에 담기지
		// 컬렉션 요소를 읽어오는 Iterator객체는 Collection 자손이라 Map은 사용불가하지만
		// Set 타입에 담았으니 이제 읽어오기 가능
		Iterator it = set.iterator();

		// 요소들 읽어오기
		while (it.hasNext()) {
//			Object obj = it.next(); //Object next();니까 다시 Map에 담아주자
			// Map 인터페이스의 내부 인터페이스. Entry클래스에 key, value 각각 객체로 저장 <-정의보면 이해감
			Map.Entry e = (Map.Entry) it.next();
			System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
		}

		set = map.keySet(); // 참조변수 set에 key값들 담음
		System.out.println("참가자 명단 : " + set);

		Collection values = map.values();
		it = values.iterator();

		// total값 구하기. total값을 while문 밖에 적는 이유 - while문 안에 적으면 지역변수라
		// while문 돌면서 초기화되서 값 저장이 안됨
		int total = 0;

		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			total += i.intValue(); // Returns the value of this Integer as an int.
			// Integer -> int 반환

		}

		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total/set.size());
		// max, min 메서드의 매개변수로는 Comparable인터페이스를 구현한 객체만 가능 ( 기준이 있어야 하니까 )
		System.out.println("최고점수 :" + Collections.max(values));
		System.out.println("최저점수 :" + Collections.min(values));
	}

}
