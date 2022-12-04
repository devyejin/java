package ch12;

import java.util.*;

public class HashMapEx4 {

	public static void main(String[] args) {
		String[] data = { "A", "K", "A", "K", "D", "A", "K", "K", "K", "Z", "D" };

		HashMap map = new HashMap();

		for (int i = 0; i < data.length; i++) {
			// boolean containsKey(key)
			if (map.containsKey(data[i])) {
				// Object get(key) : key에 해당하는 value객체 반환
				Integer value = (Integer) map.get(data[i]);
				map.put(data[i], new Integer(value.intValue() + 1)); // key값이 있으면 value+1
			} else { // map에 key값이 없다면
				map.put(data[i], new Integer(1));
			}
		}
		
		//map 완성
		//Collection인터페이스 구현한 클래스에서만 Iterator 객체 얻는게 가능하니까
		Iterator it =map.entrySet().iterator();
		
		while(it.hasNext()) {
			//Object it next();
			//Map 인터페이스 :  Entry : Map 인터페이스의 내부 인터페이스
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue(); 
			System.out.println(entry.getKey() + " : " + printBar('#',value) + " " + value);
		}
		
	}

	public static String printBar(char ch, int value) {
		
		char[] bar = new char[value]; //길이가 value인 char배열 생성
		
		for(int i=0; i < bar.length; i++) {
			bar[i] = ch;
		}
		
		return new String(bar); //String(char[] chArr)
	}

}
