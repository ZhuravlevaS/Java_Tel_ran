package lessons.Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathMethodsTest {

@Test
void getAdditionTest() {

}

@Test
void getSubtractionTest() {
}

@Test
void getMultiplicationPositiveTest() {
	double number = 25;
	assertEquals(number, MathMethods.getMultiplication(5, 5));
}

@Test
void getDivisionTest() {
}
}