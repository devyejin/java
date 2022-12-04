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

//FruitBox는 Box클래스의 자손
//<T extends Fruit> : FruitBox의 '대입된 타입'으로 Fruit과 그 자손만 가능

class Box<T> { // 정해진 타입 객체만 생성.지네릭스
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

	Juice(String name) { // 생성자
		this.name = name + "Juice";
	}

	public String toString() {
		return name;
	}

}

class Juicer {
	static Juice makeJuice(FruitBox<? extends Fruit> box) { // 매개변수로 원시타입은FruitBox 대입된 타입은 Fruit과 그 자손만 가능
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

		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>(); // '대입된 타입' 일치

		FruitBox <Apple> appleBox = new FruitBox<Apple>();
		// 와일드 카드를 사용 => '대입된 타입' Fruit과 그 자손 가능
		
		
		
		fruitBox.add(new Grape());
		fruitBox.add(new Apple()); //이건 다형성. Fruit타입 참조변수로 Apple객체 참조 가능하니까
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		
		System.out.println(Juicer.makeJuice(appleBox));
		System.out.println(Juicer.makeJuice(fruitBox));
	}

}
