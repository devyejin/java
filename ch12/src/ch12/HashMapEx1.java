package ch12;

import java.util.*;

public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");

		Scanner s = new Scanner(System.in); // 화면으로부터 라인단위로 입력받는다.skipped

		while (true) {
			System.out.println("id와 password를 입력하세요");
			System.out.print("id : ");
			String id = s.nextLine().trim(); // nextLine() return : the line that was skipped

			System.out.print("password : ");
			String pwd = s.nextLine().trim();
			System.out.println();

			if (!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다." + " 다시 입력해주세요.");

				continue; // 다시 while문 초반으로 보냄

			} else {
				// Object.get(Object key) : 지정된 key의 value 반환
				// map.get("myId") => "1234".equals("1234") : true <- 둘 다 string
				if (map.get(id).equals(pwd)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				} else {
					System.out.println("id와 비밀번호가 일치합니다.");
					break; // while문 벗어남
				}
			}
		}
	}

}
