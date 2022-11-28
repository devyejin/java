package ch12;

import java.util.*;

class Product {

}

class Tv extends Product {
}

class Audio extends Product {
}

public class GenericTest2 {

	public static void main(String[] args) {
		// 참조 변수와 생성자의 '대입된 타입(매개변수화된 타입)'은 일치해야 한다.
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv> tvList = new ArrayList<Tv>();
//		ArrayList<Product> tvList = new ArrayList<Tv>(); // error '대입된 타입' 불일치
//		List<Tv> tvList = new ArrayList<Tv>(); // OK. 다형성 '대입된 타입'일치, 원시타입은 다형성 성립

		productList.add(new Tv()); // 대입된 타입의 자손타입 객체 저장 가능
		productList.add(new Audio());
		/*public boolean add(E e) <- ArrayList<E> 클래스에 정의된 메서드
			'대입된 타입'에 E 대신 Product를 넣으면서
		 	public boolean add(Product e) 가 되니까
		 	매개변수로 Product와 그 자손들이 가능! (By 다형성)
		 */

		tvList.add(new Tv()); //public boolean add(Tv e) => Tv와 그 자손만 가능
		tvList.add(new Tv());
//		tvList.add(new Audio()); //error. Tv와 Audio는 아무런 관계가 없으니까
		
		printAll(productList);
//		printAll(tvList); //컴파일에러 발생. Product타입만 가능
		/*
		 	tvList를 매개변수로 넣으면
		 	ArrayList<Product> list 여기에서
		 	ArrayList<Product> new ArrayList<Tv> <- 대입된 타입 불일치! 그래서 에러 발생
		 */
		
		

	}// main 끝

	public static void printAll(ArrayList<Product> list) {
		// 향상된 for문
		/*
		  for ( 타입 변수명 : 배열 or 컬렉션 ) // for문 돌면서, 변수명에 배열 index 0부터 하나씩 들어감
		 */
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
