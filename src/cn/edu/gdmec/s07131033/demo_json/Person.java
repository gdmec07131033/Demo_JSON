package cn.edu.gdmec.s07131033.demo_json;

import java.util.List;

public class Person {
	private int age;
	private String name;
	private List<String> phones;
	public Person() {
		super();
	}
	public Person(int age, String name, List<String> phones) {
		super();
		this.age = age;
		this.name = name;
		this.phones = phones;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", phones=" + phones
				+ "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
}
