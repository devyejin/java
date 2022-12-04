package ch12;

import java.util.*;

public class StackEx1 {
	// �������� '�ڷ�' '������' ��ư ��� ����
	// 2���� ������ ����ؾ� ��

	public static Stack back = new Stack();
	public static Stack forward = new Stack();

	public static void main(String[] args) {

		goURL("1.����Ʈ");
		goURL("2.����");
		goURL("3.���̹�");
		goURL("4.����");
		
		printStatus();
		
		goForward();
		printStatus();
	}

	public static void printStatus() {
		System.out.println("back:" + back);
		System.out.println("forward:" + forward);
		System.out.println("����ȭ���� " + back.peek() +"�Դϴ�.");
	}

	public static void goURL(String url) {
		back.push(url);
		if (!forward.empty()) // forward�� ������� ������
			forward.clear(); // forward�� �����

	}
	
	public static void goForward() {
		if(!forward.empty()) // forward�� ������
			back.push(forward.pop()); // forward�� ������ back�� �־��
	}
	
	public static void goBack() {
		if(!back.empty())
			forward.push(back.pop());
		
	}

}
