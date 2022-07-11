import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTester {
	GradeBook firstBook;
	GradeBook secondBook;

	@Before
	public void setUp() throws Exception {
		firstBook = new GradeBook(5);
		secondBook = new GradeBook(5);
		
		firstBook.addScore(100.0);
		firstBook.addScore(57.5);
		firstBook.addScore(45.6);
		
		secondBook.addScore(60.7);
		secondBook.addScore(56.0);
		secondBook.addScore(34.5);
	}

	@After
	public void tearDown() throws Exception {
		firstBook = null;
		secondBook = null;
	}

	@Test
	public void testAddScore() {
		assertTrue(firstBook.toString().equals("100.0 57.5 45.6 0.0 0.0 "));
		assertTrue(secondBook.toString().equals("60.7 56.0 34.5 0.0 0.0 "));
		
		assertEquals(3, firstBook.getScoreSize());
		assertEquals(3, secondBook.getScoreSize());
	}

	@Test
	public void testSum() {
		assertEquals(203.1, firstBook.sum(), 0.0001);
		assertEquals(151.2, secondBook.sum(), 0.0001);
	}

	@Test
	public void testMinimum() {
		assertEquals(45.6, firstBook.minimum(), 0.0001);
		assertEquals(34.5, secondBook.minimum(), 0.0001);
	}

	@Test
	public void testFinalScore() {
		assertEquals(157.5, firstBook.finalScore(), 0.0001);
		assertEquals(116.7, secondBook.finalScore(), 0.0001);
	}


}
