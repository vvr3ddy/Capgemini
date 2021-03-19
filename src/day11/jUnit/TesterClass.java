package day11.jUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TesterClass {
	Calculation c = new Calculation();
//	@Test
//	void myTest() {
//		assertTrue(false);
//		assertEquals("Hello", "Hello");
//	}

	@Test
	void test2() {
		assertEquals(0, c.add(10, -2));
		System.out.println("test2");
	}

	@Test
	void test3() {
		assertTrue(c.nameTest("abc"));
		System.out.println("test3");
	}

	@Test
	void test4() {
		assertTrue(c.checkPalin("aba"));
		System.out.println("test4");
	}

	@ParameterizedTest
	@ValueSource(strings = { "ada", "radar", "gadag" })
	void test5(String s1) {
		assertTrue(c.checkPalin(s1));
		System.out.println("test5");
	}

	@ParameterizedTest
	@ValueSource(strings = { "abc", "asdf", "rose" })
	void test6(String s) {
		assertFalse(c.checkPalin(s));
		System.out.println("test6");
	}
	
	@BeforeAll
	static void test7()
	{
		System.out.println("Before all cases");
	}
	@AfterAll
	static void test8() {
		System.out.println("After all cases");
	}
}
