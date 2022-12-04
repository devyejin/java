package ch12;

import java.util.*;

public class StackEx1 {
	// 웹브라우저 '뒤로' '앞으로' 버튼 기능 구현
	// 2개의 스택을 사용해야 함

	public static Stack back = new Stack();
	public static Stack forward = new Stack();

	public static void main(String[] args) {

		goURL("1.네이트");
		goURL("2.야후");
		goURL("3.네이버");
		goURL("4.다음");
		
		printStatus();
		
		goForward();
		printStatus();
	}

	public static void printStatus() {
		System.out.println("back:" + back);
		System.out.println("forward:" + forward);
		System.out.println("현재화면은 " + back.peek() +"입니다.");
	}

	public static void goURL(String url) {
		back.push(url);
		if (!forward.empty()) // forward가 비어있지 않으면
			forward.clear(); // forward를 비워라

	}
	
	public static void goForward() {
		if(!forward.empty()) // forward에 있으면
			back.push(forward.pop()); // forward꺼 꺼내서 back에 넣어라
	}
	
	public static void goBack() {
		if(!back.empty())
			forward.push(back.pop());
		
	}

}
