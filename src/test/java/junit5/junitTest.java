package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

class junitTest {

	junit mathUtils;
	
	@BeforeAll
	static void beforeAllInit() {
		System.out.println("this should run before all");
	}
	
	@BeforeEach
	void init() {
		mathUtils = new junit();
		System.out.println("before each");
		
	}
	
	@AfterEach
	void cleanup() {
		System.out.println("after each");
	}
	
	@AfterAll
	static void finish() {
		System.out.println("this should run after all");
	}
	
	@Test
	void testAdd() {
		
		int expected =6;
		int actual = mathUtils.add(4,2);
		assertEquals(expected,actual,"the two numbers to be added");
		
	
	
		
	}

}
