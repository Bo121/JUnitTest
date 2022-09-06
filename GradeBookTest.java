import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	private GradeBook gb1;
	private GradeBook gb2;
	
	@BeforeEach
	void setUp() throws Exception 
	{
		gb1 = new GradeBook(5);
		gb2 = new GradeBook(5);
		
		gb1.addScore(65);
		gb1.addScore(75);
		gb2.addScore(85);
		gb2.addScore(95);
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		gb1 = null;
		gb2 = null;
	}

	@Test
	void testAddScore() 
	{
		assertTrue(gb1.toString().equals("65.0 75.0 "));
		assertTrue(gb2.toString().equals("85.0 95.0 "));
	}

	@Test
	void testSum() 
	{
		assertEquals(140,gb1.sum(),0.001);
		assertEquals(180,gb2.sum(),0.001);
	}

	@Test
	void testMinimum() 
	{
		assertEquals(65, gb1.minimum(), .001);
		assertEquals(85, gb2.minimum(), .001);
	}

	@Test
	void testFinalScore() 
	{
		assertEquals(75,gb1.finalScore(),0.001);
		assertEquals(95,gb2.finalScore(),0.001);
	}


}
