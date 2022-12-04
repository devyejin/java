package ch12;

import java.util.ArrayList;

class Fruit {

	@Override
	public String toString() {
		return "Fruit";
	}

}

class Apple extends Fruit {
	@Override
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit {
	@Override
	public String toString() {
		return "Grape";
	}
}

//FruitBox�� BoxŬ������ �ڼ�
//<T extends Fruit> : FruitBox�� '���Ե� Ÿ��'���� Fruit�� �� �ڼո� ����

class Box<T> { // ������ Ÿ�� ��ü�� ����.���׸���
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) {
		list.add(item);
	}

	T get(int i) {
		return list.get(i);
	}

	int size() {
		return list.size();

	}

	ArrayList<T> getList() {
		return list;
	}

	@Override
	public String toString() {
		return list.toString();
	}

}

class Juice {
	String name;

	Juice(String name) { // ������
		this.name = name + "Juice";
	}

	public String toString() {
		return name;
	}

}

class Juicer {
	static Juice makeJuice(FruitBox<? extends Fruit> box) { // �Ű������� ����Ÿ����FruitBox ���Ե� Ÿ���� Fruit�� �� �ڼո� ����
		String tmp = " ";

		for (Fruit f : box.getList())
			tmp += f + " ";
		return new Juice(tmp);
	}
}

class FruitBox<T extends Fruit> extends Box<T> {
}

public class FruitBoxEx1 {

	public static void main(String[] args) {

		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>(); // '���Ե� Ÿ��' ��ġ

		FruitBox <Apple> appleBox = new FruitBox<Apple>();
		// ���ϵ� ī�带 ��� => '���Ե� Ÿ��' Fruit�� �� �ڼ� ����
		
		
		
		fruitBox.add(new Grape());
		fruitBox.add(new Apple()); //�̰� ������. FruitŸ�� ���������� Apple��ü ���� �����ϴϱ�
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		
		System.out.println(Juicer.makeJuice(appleBox));
		System.out.println(Juicer.makeJuice(fruitBox));
	}

}
