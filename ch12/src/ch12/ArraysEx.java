package ch12;

import java.util.*;

public class ArraysEx {

	public static void main(String[] args) {
		
	int[] arr7 = new int[5];
	
	
	Arrays.setAll(arr7, i->(int)(Math.random()*6)+1); 
	System.out.println("arr7= "+ Arrays.toString(arr7)); //���� �� ä��
	
	//���� for��
	/*
	 	for(Ÿ�� ������ : �迭or�÷���) {
	 		�迭or�÷��ǿ� ����� ���� �ݺ������� �ϳ��� �ų�����
	 */
	for(int i : arr7) {
		//index=i�ڸ��� �� �� ���, ���� *ä���
		char[] ch = new char[i];
		Arrays.fill(ch, '*');
		System.out.println(new String(ch)+i);
	}
		
		
	}

}
