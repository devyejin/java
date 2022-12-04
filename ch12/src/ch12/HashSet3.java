package ch12;

import java.util.*;


class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person() {}

	@Override
	public String toString() {
		return name + ":" + age;
	}

	@Override
	public int hashCode() {
		//Objects 클래스를 이용 
		return Objects.hash(name,age);
	}

	@Override
	public boolean equals(Object obj) {
		// this의 name, age하고 obj의 name, age가 같으면 true를 반환
		// 참조변수 obj로는 name,age 멤버변수 사용이 불가능하니 형변환이 필요
		if(!( obj instanceof Person)) return false;
		
		Person p = (Person)obj;
		
		return this.name.equals(p.name)&&this.age==p.age;
	}
	
	
	
	
}


public class HashSet3 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("David",10)); 
		set.add(new Person("David",10));
		
		System.out.println(set);
		
	}
}
