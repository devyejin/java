package ch12;

import java.util.*;


class Tv {}
class Audio{}

public class GenericTest {

	public static void main(String[] args) {
		
		ArrayList<Tv> list = new ArrayList<Tv>();
		// TvŸ���� ��ü�� ���� ����
		list.add(new Tv()); 
//		list.add(new Audio());
		
		Tv t = list.get(0); //TvŸ�Ը� ��� ������ ��ȯŸ�Ե� Tv�εǾ� ����ȯ�� �ʿ� ����
		
		
	}

}
