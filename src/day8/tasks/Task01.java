package day8.tasks;

import java.util.*;

class Fruit {
	String name;
	String taste;

	void eat() {
		System.out.println("Name of Fruit:" + this.name);
		System.out.println("Taste of Fruit:" + this.taste);
	}
}

class Apple extends Fruit {

	@Override
	void eat() {
		System.out.println("Name of fruit: Apple");
		System.out.println("Taste of fruit: Sweet");
	}

}

class Orange extends Fruit {

	@Override
	void eat() {
		System.out.println("Name of Fruit: Orange");
		System.out.println("Taste of Fruit: Tangy");
	}

}

public class Task01 {
	public static void main(String[] args) {
		Apple apple = new Apple();
		apple.eat();
		Orange orange = new Orange();
		orange.eat();
	}
}
