package ch12;

import java.util.*;

public class TreeSetEx2 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = { 80, 95, 50, 35, 45, 65, 10, 100 };

		// TreeSet : �ߺ�X, ����X, intŸ���̴� ������������ �������׾� ( �˻�,�����˻� ���� )
		for (int i = 0; i < score.length; i++) {
//			set.add(score[i]);
			// �迭�� ��� ������ Integer ��ü�� ���� set�� ���� ( ��, ���������� ���� )
			set.add(new Integer(score[i])); // boolean add(Object o)

		}
		// SortedSet headSet(Object toElement) : ������ ��ü���� ���� ��(�̸�)
		System.out.println("50���� ���� ��:" + set.headSet(new Integer(50)));
		// SortedSet tailSet(Object fromElement) : ������ ��ü���� ū ��(�ʰ�)
		System.out.println("50���� ū ��:" + set.tailSet(new Integer(50)));
		// SortedSet subSet(fromElement, toElement)
		System.out.println("40�� 80������ ��:" + set.subSet(40,80));

	}

}
