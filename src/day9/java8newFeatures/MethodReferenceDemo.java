package day9.java8newFeatures;

@FunctionalInterface
interface FInterface {
	void method();
}

class MyDemo {
	void method1() {
		System.out.println("In Method1");
	}
	static void method2() {
		System.out.println("method 2");
	}
}


public class MethodReferenceDemo {
	public static void main(String[] args) {
		FInterface fi = () -> System.out.println("FI Method");
		MyDemo md = new MyDemo();
		FInterface f1 = md::method1; //referring to non static method using method reference
		FInterface f2 = MyDemo::method2; //referring to static method using method reference
		
		fi.method();
		f1.method();// non static method referencing
		f2.method();// static method referencing
	}
}
