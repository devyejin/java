package ch12;

import java.util.*;

public class HashSet1 {

	public static void main(String[] args) {

		Set set = new HashSet();
		
		//set�� ũ�Ⱑ 6���� 1~45���� ����
		for(int i=0; set.size() < 6; i++) { //set.size() < 6�� ����: size=6�϶�, false�� for�� �ȵ��ϱ�
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set); //Set�̴� �������� ������ ������ �����ϰ� �ʹٸ�?
		
		List list = new LinkedList(set); //LinkedList(Collection c) �̿�
		
		Collections.sort(list); // LinkedList(Collection c)
		System.out.println(list); //Collections.sort(List list)
		
	}

}
