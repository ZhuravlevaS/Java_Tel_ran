package lessons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lesson5Test {
	@Test
	void reverseStringSuccess() {
		String str = "qwerty";
		assertEquals("ytrewq", Lesson5.reverseString(str));
	}
	@Test
	void reverseStringFail() {
		String str = "qwerty";
		assertNotEquals("ytrew", Lesson5.reverseString(str));
	}
}