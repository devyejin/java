package ch12;

import java.util.*;

public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");

		Scanner s = new Scanner(System.in); // ȭ�����κ��� ���δ����� �Է¹޴´�.skipped

		while (true) {
			System.out.println("id�� password�� �Է��ϼ���");
			System.out.print("id : ");
			String id = s.nextLine().trim(); // nextLine() return : the line that was skipped

			System.out.print("password : ");
			String pwd = s.nextLine().trim();
			System.out.println();

			if (!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�." + " �ٽ� �Է����ּ���.");

				continue; // �ٽ� while�� �ʹ����� ����

			} else {
				// Object.get(Object key) : ������ key�� value ��ȯ
				// map.get("myId") => "1234".equals("1234") : true <- �� �� string
				if (map.get(id).equals(pwd)) {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				} else {
					System.out.println("id�� ��й�ȣ�� ��ġ�մϴ�.");
					break; // while�� ���
				}
			}
		}
	}

}
