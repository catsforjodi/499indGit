import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testBirthstone {

	@Test 
	void testDecember() {
		String str = "turquoise & zircon & tanzanite";
		String result = birthstone.birthstone("december");
		assertEquals(str,result);
	}
	
	@Test
	void testInvalidMonth() {
		assertEquals("invalid month",birthstone.birthstone("marchuary"));
	}

}
