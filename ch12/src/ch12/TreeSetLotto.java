package ch12;

import java.util.*;

class Test implements Comparable{

	@Override
	public int compareTo(Object o) {
		return -1;
	}
	
}

class TestComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return -1;
	}

}

public class TreeSetLotto {

	public static void main(String[] args) {
		//������ TreeSet(Comparator comp) // �־��� ���ı������� �����ϴ� TreeSet ����
		Set set = new TreeSet();

		set.add(new Test());
		set.add(new Test());
		set.add(new Test());

		System.out.println(set);
	}

}
