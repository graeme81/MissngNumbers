package stripe21319h;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MissingNumTest {
	MissingNum find = new MissingNum();

	@Test
	void test1() {
		int[] a = {9, 8, 7, 6, 5, 4, 3};
		int x = find.search(a);
		assertEquals(1, x);
	}
	@Test
	void test2() {
		int[] a = {1, 6, 8, 2, 3, 4};
		int x = find.search(a);
		assertEquals(5, x);
	}
	@Test
	void test3() {
		int[] a = {-1, 0, -5, 1, 6, 2, 3, 4 };
		int x = find.search(a);
		assertEquals(5, x);
	}
	@Test
	void test4() {
		int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		int x = find.search(a);
		assertEquals(10, x);
	}
	@Test
	void test5() {
		int[] a = {-1, 0, 4, 4, 4, 4, 4};
		int x = find.search(a);
		assertEquals(1, x);
	}
	@Test
	void test6() {
		int[] a = {1, 1, 1, 2, 2, 0, 3, 5, 4, 4, 3, 5};
		int x = find.search(a);
		assertEquals(6, x);
	}	

}
