package ch12;

public class AsciPrint {

	public static void main(String[] args) {
		char ch = ' '; //����. �ƽ�Ű�ڵ� �� �� ���� ���� ��
		//����(' ')������ ���ڵ��� ����Ѵ�.
		for(int i=0; i < 95; i++) {
			System.out.print(++ch);
		}
	}

}
