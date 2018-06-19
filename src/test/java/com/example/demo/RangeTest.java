package com.example.demo;
import static org.junit.Assert.*;

import org.junit.Test;

public class RangeTest {
	
	@Test
	public void shouldReturn2_When_exclude_with_1() {
		DemoRange range = new DemoRange("(1,5]");
		int actualResult = range.getStart();
		assertEquals(2, actualResult);
	}
	
	@Test
	public void shouldReturn1_When_include_with_1() {
		DemoRange range = new DemoRange("[1,5]");
		int actualResult = range.getStart();
		assertEquals(1, actualResult);
	}
	
	@Test
	public void shouldReturn2_When_include_with_2() {
		DemoRange range = new DemoRange("[2,5]");
		int actualResult = range.getStart();
		assertEquals(2, actualResult);
	}
	
	@Test
	public void shouldStartWithInclude() {
		DemoRange range = new DemoRange("[1,5]");
		assertTrue("ข้อมูลต้องขึ้นตอนด้วย [ เสมอ", 
				range.isStartWithInclude());
	}
	
	@Test
	public void shouldStartWithExclude() {
		DemoRange range = new DemoRange("(1,5]");
		assertFalse("ข้อมูลต้องขึ้นตอนด้วย ( เสมอ", 
				range.isStartWithInclude());
	}
	
	@Test
	public void shouldEndWithInclude() {
		DemoRange range = new DemoRange("[1,5]");
		assertTrue(range.isEndWithInclude());
	}
	
	@Test
	public void shouldEndWithExclude() {
		DemoRange range = new DemoRange("[1,5)");
		assertFalse(range.isEndWithInclude());
	}

	@Test
	public void test() {
		DemoRange range = new DemoRange();
		String actualResult = range.of("[1,5]");
		assertEquals("1,2,3,4,5", actualResult);
	}

}
