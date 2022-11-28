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
		// ���� ������ �������� '���Ե� Ÿ��(�Ű�����ȭ�� Ÿ��)'�� ��ġ�ؾ� �Ѵ�.
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv> tvList = new ArrayList<Tv>();
//		ArrayList<Product> tvList = new ArrayList<Tv>(); // error '���Ե� Ÿ��' ����ġ
//		List<Tv> tvList = new ArrayList<Tv>(); // OK. ������ '���Ե� Ÿ��'��ġ, ����Ÿ���� ������ ����

		productList.add(new Tv()); // ���Ե� Ÿ���� �ڼ�Ÿ�� ��ü ���� ����
		productList.add(new Audio());
		/*public boolean add(E e) <- ArrayList<E> Ŭ������ ���ǵ� �޼���
			'���Ե� Ÿ��'�� E ��� Product�� �����鼭
		 	public boolean add(Product e) �� �Ǵϱ�
		 	�Ű������� Product�� �� �ڼյ��� ����! (By ������)
		 */

		tvList.add(new Tv()); //public boolean add(Tv e) => Tv�� �� �ڼո� ����
		tvList.add(new Tv());
//		tvList.add(new Audio()); //error. Tv�� Audio�� �ƹ��� ���谡 �����ϱ�
		
		printAll(productList);
//		printAll(tvList); //�����Ͽ��� �߻�. ProductŸ�Ը� ����
		/*
		 	tvList�� �Ű������� ������
		 	ArrayList<Product> list ���⿡��
		 	ArrayList<Product> new ArrayList<Tv> <- ���Ե� Ÿ�� ����ġ! �׷��� ���� �߻�
		 */
		
		

	}// main ��

	public static void printAll(ArrayList<Product> list) {
		// ���� for��
		/*
		  for ( Ÿ�� ������ : �迭 or �÷��� ) // for�� ���鼭, ������ �迭 index 0���� �ϳ��� ��
		 */
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
