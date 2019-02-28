package monPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class FIFOTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testFirst() {
		FIFO fifo = new FIFO();
		Integer expected = 2;
		
		fifo.add(2);
		
		Assertions.assertEquals(expected, fifo.first());
	}
	
	@Test
	void testEmpty() {
		FIFO fifo = new FIFO();
		boolean expected = true;
		
		Assertions.assertEquals(expected, fifo.isEmpty());
	}
	
	@Test
	void testRemove() {
		FIFO fifo = new FIFO();
		int expected = 0;
		
		fifo.add(2);
		fifo.removeFirst();
		
		Assertions.assertEquals(expected, fifo.size());
	}
	
}