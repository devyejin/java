package ch12;

public class AsciPrint {

	public static void main(String[] args) {
		char ch = ' '; //공백. 아스키코드 값 중 제일 작은 값
		//공백(' ')이후의 문자들을 출력한다.
		for(int i=0; i < 95; i++) {
			System.out.print(++ch);
		}
	}

}
