package tddjunit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RemoveCharsTest {

	/* TODO list for my feature
	 * 1. empty string "" => "" 
	 * 2. 1 char A => "" 
	 * 3. 4 chars AABB => BB
	 * 4. n chars ABCDEFG => BCDEFG
 	 */
	RemoveChars removeA_s;
	@Before
	public void setUp() throws Exception {
		removeA_s =new RemoveChars();
	}

	@Test
	public void test() {
		assertEquals("FCD" ,removeA_s.remove("AFCD"));
	}
	@Test
	public void test1() {
		assertEquals("C" ,removeA_s.remove("AAC"));
	}
	@Test
	public void test2() {
		assertEquals("BCD" ,removeA_s.remove("BACD"));
	}
	@Test
	public void test3() {
		assertEquals("BBAA" ,removeA_s.remove("BBAA"));
	}
	@Test
	public void test4() {
		assertEquals("BAA" ,removeA_s.remove("AABAA"));
	}
	@Test
	public void test5() {
		assertEquals("" ,removeA_s.remove("A"));
	}
	@Test
	public void test6() {
		assertEquals("B" ,removeA_s.remove("B"));
	}
	@Test
	public void test7() {
		assertEquals("" ,removeA_s.remove(""));
	}
}
