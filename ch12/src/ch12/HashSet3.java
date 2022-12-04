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
		//Objects Ŭ������ �̿� 
		return Objects.hash(name,age);
	}

	@Override
	public boolean equals(Object obj) {
		// this�� name, age�ϰ� obj�� name, age�� ������ true�� ��ȯ
		// �������� obj�δ� name,age ������� ����� �Ұ����ϴ� ����ȯ�� �ʿ�
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
