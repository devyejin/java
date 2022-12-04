package ch12;

import java.util.*;

public class HashMapEx4 {

	public static void main(String[] args) {
		String[] data = { "A", "K", "A", "K", "D", "A", "K", "K", "K", "Z", "D" };

		HashMap map = new HashMap();

		for (int i = 0; i < data.length; i++) {
			// boolean containsKey(key)
			if (map.containsKey(data[i])) {
				// Object get(key) : key�� �ش��ϴ� value��ü ��ȯ
				Integer value = (Integer) map.get(data[i]);
				map.put(data[i], new Integer(value.intValue() + 1)); // key���� ������ value+1
			} else { // map�� key���� ���ٸ�
				map.put(data[i], new Integer(1));
			}
		}
		
		//map �ϼ�
		//Collection�������̽� ������ Ŭ���������� Iterator ��ü ��°� �����ϴϱ�
		Iterator it =map.entrySet().iterator();
		
		while(it.hasNext()) {
			//Object it next();
			//Map �������̽� :  Entry : Map �������̽��� ���� �������̽�
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue(); 
			System.out.println(entry.getKey() + " : " + printBar('#',value) + " " + value);
		}
		
	}

	public static String printBar(char ch, int value) {
		
		char[] bar = new char[value]; //���̰� value�� char�迭 ����
		
		for(int i=0; i < bar.length; i++) {
			bar[i] = ch;
		}
		
		return new String(bar); //String(char[] chArr)
	}

}
