package monPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TriTableauTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCroissant() {
		int tab[] = {3,2,1};
		int expected[] = {1,2,3};
		TriTableau.triCroissant(tab);
		Assertions.assertEquals(expected[0], tab[0]);
	}
	
	@Test
	void testDecroissant() {
		int tab[] = {1,2,3};
		int expected[] = {3,2,1};
		TriTableau.triDecroissant(tab);
		Assertions.assertEquals(expected[0], tab[0]);

}
}

