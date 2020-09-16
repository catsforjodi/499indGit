import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testPetName {

	@Test
	void testComesOutRight() {
		assertTrue(PetName.petName("Nordel","Disgusting",21).equals("Disgusting Nordeltonson 21"));
		
	}
}
