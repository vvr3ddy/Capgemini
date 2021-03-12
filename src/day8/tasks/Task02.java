package day8.tasks;

import java.util.*;

class Shape {
	void draw() {
		System.out.println("Drawing Shape");
	}

	void erase() {
		System.out.println("Erasing Shape");
	}
}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing circle");
	}

	@Override
	void erase() {
		System.out.println("Erase circle");
	}

}

class Triangle extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing Triangle");
	}

	@Override
	void erase() {
		System.out.println("Erasing Triangle");
	}

}

class Square extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing Square");
	}

	@Override
	void erase() {
		System.out.println("Erasing Square");
	}

}

public class Task02 {
	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape triangle = new Triangle();
		Shape square = new Square();
	}
}
