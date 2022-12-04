package ch12;

import java.util.*;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		// Object put(key, value)
		map.put("���ڹ�", new Integer(90)); //�ڿ����� ��������鼭 �̰� ������
		map.put("���ڹ�", new Integer(100));
		map.put("���ڹ�", new Integer(100));
		map.put("���ڹ�", new Integer(80));
		map.put("���ڹ�", new Integer(90));

		// Set entrySet() ; Map�� entry���� Set �� ����
		Set set = map.entrySet(); // id�� �������̴ϰ� set�� �����
		// �÷��� ��Ҹ� �о���� Iterator��ü�� Collection �ڼ��̶� Map�� ���Ұ�������
		// Set Ÿ�Կ� ������� ���� �о���� ����
		Iterator it = set.iterator();

		// ��ҵ� �о����
		while (it.hasNext()) {
//			Object obj = it.next(); //Object next();�ϱ� �ٽ� Map�� �������
			// Map �������̽��� ���� �������̽�. EntryŬ������ key, value ���� ��ü�� ���� <-���Ǻ��� ���ذ�
			Map.Entry e = (Map.Entry) it.next();
			System.out.println("�̸� : " + e.getKey() + ", ���� : " + e.getValue());
		}

		set = map.keySet(); // �������� set�� key���� ����
		System.out.println("������ ��� : " + set);

		Collection values = map.values();
		it = values.iterator();

		// total�� ���ϱ�. total���� while�� �ۿ� ���� ���� - while�� �ȿ� ������ ����������
		// while�� ���鼭 �ʱ�ȭ�Ǽ� �� ������ �ȵ�
		int total = 0;

		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			total += i.intValue(); // Returns the value of this Integer as an int.
			// Integer -> int ��ȯ

		}

		System.out.println("���� : " + total);
		System.out.println("��� : " + (float)total/set.size());
		// max, min �޼����� �Ű������δ� Comparable�������̽��� ������ ��ü�� ���� ( ������ �־�� �ϴϱ� )
		System.out.println("�ְ����� :" + Collections.max(values));
		System.out.println("�������� :" + Collections.min(values));
	}

}
